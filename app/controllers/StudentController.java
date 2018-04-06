package controllers;

import models.Student;
import models.StudentCourseSub;
import models.StudentDetail;
import models.StudentGradeSub;
import play.data.DynamicForm;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;


public class StudentController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public StudentController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

   /* //Retrieves entire student table from DB and puts it on page
    @Transactional(readOnly = true)
    public Result getStudents()
    {
        List<Student> students = jpaApi.em().createQuery("SELECT s from Student s").getResultList();

        return ok(views.html.students.render(students));
    }*/

    //Retrieves students from DB and puts it on page
    @Transactional
    public Result getStudentsDetails()
    {
        List<StudentDetail> students = jpaApi.em().createQuery("select NEW models.StudentDetail(s.studentId, s" +
                ".studentName, s.birthDate, s.gradeClass, avg(ag.grade), s.rankClass, s.parentPhone, s.parentEmail, s" +
                ".studentEmail, s.studentPhone) from AssignmentGrade ag join Assignment a on ag.assignmentId = a" +
                ".assignmentId join Student s on ag.studentId = s.studentId group by ag.studentId, s.studentName, s" +
                ".birthDate, s.gradeClass, s.rankClass, s.parentPhone, s.parentEmail, s.studentEmail, s" +
                ".studentPhone").getResultList();

        String studentCourseSubSQL = "SELECT sc.studentCourseId AS studentCourseId, s.studentId as studentId, c.courseid AS courseId, c" +
                ".courseName AS courseName, t.teacherName AS teacherName, avg(ag.grade) AS overallGPA FROM course c JOIN teacher t ON c.teacherId = t.teacherId" +
                " JOIN assignment a ON c.courseId = a.courseId JOIN studentcourse sc ON sc.courseId = c.CourseId JOIN" +
                " student s ON sc.StudentId = s.StudentId JOIN assignmentgrade ag ON ag.StudentId = s.StudentId  AND ag.assignmentId = a.assignmentId GROUP" +
                " BY sc.studentCourseId, s.studentId, c.courseName, t.teacherName";

        List<StudentCourseSub> studentCourseSubs = jpaApi.em().createNativeQuery(studentCourseSubSQL, StudentCourseSub.class).getResultList();



        return ok(views.html.students.render(students, studentCourseSubs));
    }

    /*//Retrieves individual student and puts it on page
    @Transactional(readOnly = true)
    public Result getStudent(int studentId)
    {
        Student student = jpaApi.em().createQuery("SELECT s FROM Student s WHERE studentId =:studentId", Student.class)
                .setParameter("studentId", studentId).getSingleResult();

        return ok(views.html.student.render(student));
    }*/
    //Retrieves individual student and builds it on the page

    @Transactional(readOnly = true)
    public Result getStudentDetails(int studentId)
    {
        StudentDetail student = jpaApi.em().createQuery("select NEW models.StudentDetail(s.studentId, s.studentName, " +
                "s.birthDate, s.gradeClass, avg(ag.grade), s.rankClass, s.parentPhone, s.parentEmail, s.studentEmail," +
                " s.studentPhone) from AssignmentGrade ag join Assignment a on ag.assignmentId = a.assignmentId join " +
                "Student s on ag.studentId = s.studentId WHERE s.studentId =:studentId group by ag.studentId, s" +
                ".studentName, s.birthDate, s.gradeClass, s.rankClass, s.parentPhone, s.parentEmail, s.studentEmail, " +
                "s.studentPhone", StudentDetail.class)
                .setParameter("studentId", studentId).getSingleResult();

        String studentCourseSubSQL = "SELECT sc.studentCourseId AS studentCourseId, s.studentId as studentId, c.courseid AS courseId, c" +
                ".courseName AS courseName, t.teacherName AS teacherName, avg(ag.grade) AS overallGPA FROM course c JOIN teacher t ON c.teacherId = t.teacherId" +
                " JOIN assignment a ON c.courseId = a.courseId JOIN studentcourse sc ON sc.courseId = c.CourseId JOIN" +
                " student s ON sc.StudentId = s.StudentId JOIN assignmentgrade ag ON ag.StudentId = s.StudentId  AND ag.assignmentId = a.assignmentId WHERE s.studentId =:studentId  GROUP" +
                " BY sc.studentCourseId, s.studentId, c.courseName, t.teacherName, c.courseId";

        List<StudentCourseSub> courseSubs = jpaApi.em().createNativeQuery(studentCourseSubSQL, StudentCourseSub.class).setParameter("studentId", studentId).getResultList();

        String courseGradesSQL = "SELECT ag.assignmentGradeId, c.courseId, a.assignmentName, ag.grade FROM course c " +
                "JOIN assignment a ON c.courseId = a.courseId JOIN assignmentGrade ag ON a.assignmentId = ag" +
                ".assignmentId where ag.studentId =:studentId";

        List<StudentGradeSub> gradeSubs = jpaApi.em().createNativeQuery(courseGradesSQL, StudentGradeSub.class).setParameter("studentId", studentId).getResultList();

       /*String studentCourseSubSQL = "SELECT sc.studentCourseId, s.studentId AS studentId, c.courseid, c.courseName, t.teacherName, avg(ag.grade) FROM course c JOIN teacher t ON c.teacherId = t.teacherId JOIN assignment a ON c.courseId = a.courseId JOIN studentcourse sc ON sc.courseId = c.CourseId JOIN student s ON sc.StudentId = s.StudentId join assignmentgrade ag ON ag.StudentId = s.StudentId WHERE s.studentId =: studentId GROUP BY sc.studentCourseId, s.studentId, c.courseName, t.teacherName";

        StudentCourseSub course = jpaApi.em().createQuery(studentCourseSubSQL, StudentCourseSub.class).setParameter("studentId", studentId).getSingleResult();*/

        return ok(views.html.student.render(student, courseSubs, gradeSubs));
    }

    @Transactional(readOnly = false)
    public Result postTableUpdate()
    {

        DynamicForm form = formFactory.form().bindFromRequest();
        String name = form.get("name");
        String pk = form.get("pk");
        String value = form.get("value");

        int studentId = Integer.parseInt(pk);

        String sql = "Select s FROM Student s WHERE studentId = :studentId";

        Student student = jpaApi.em().createQuery(sql, Student.class).setParameter("studentId", studentId)
                .getSingleResult();

        if (name != null)
        {
            if (name.equals("8"))
            {
                student.setStudentPhone(value);

            }
            else if (name.equals("7"))
            {
                student.setStudentEmail(value);

            }
            else if (name.equals("6"))
            {
                student.setParentPhone(value);
            }
            else if (name.equals("5"))
            {
                student.setParentEmail(value);
            }
            else if (name.equals("3"))
            {
                student.setGradeClass(value);
            }
            else if (name.equals("1"))
            {
                student.setStudentName(value);
            }

            jpaApi.em().persist(student);
        }

        System.out.println(name);
        System.out.println(pk);
        System.out.println(value);

        return ok("Blah");


    }

    /*@Transactional
    public Result getOverallGrade(int studentId)
    {
        List<Student> students = jpaApi.em().createQuery("select ag.studentid, avg(ag.grade) from assignmentgrade ag
        join assignment a on ag.assignmentId = a.assignment id group by ag.studentid", Student.class)
                .setParameter("studentId", studentId).getResultList();

        return ok(views.html.students.render(students));
    }*/


}
