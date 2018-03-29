package controllers;

import models.GradeClassCount;
import models.Student;
import models.StudentDetail;
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

    //todo fix later V
    //Retrieves student details from DB and puts it on page
    @Transactional
    public Result getStudentsDetails()
    {
        List<StudentDetail> students = jpaApi.em().createQuery("select NEW models.StudentDetail(s.studentId, s.studentName, s.birthDate, s.gradeClass, avg(ag.grade), s.rankClass, s.parentPhone, s.parentEmail, s.studentEmail, s.studentPhone) from AssignmentGrade ag join Assignment a on ag.assignmentId = a.assignmentId join Student s on ag.studentId = s.studentId group by ag.studentId, s.studentName, s.birthDate, s.gradeClass, s.rankClass, s.parentPhone, s.parentEmail, s.studentEmail, s.studentPhone").getResultList();

        return ok(views.html.students.render(students));
    }

    /*//Retrieves individual student and puts it on page
    @Transactional(readOnly = true)
    public Result getStudent(int studentId)
    {
        Student student = jpaApi.em().createQuery("SELECT s FROM Student s WHERE studentId =:studentId", Student.class)
                .setParameter("studentId", studentId).getSingleResult();

        return ok(views.html.student.render(student));
    }*/
//todo !!! fix this beneath this
    //Retrieves individual student details and builds it on the page
    @Transactional(readOnly = true)
    public Result getStudentDetails(int studentId)
    {
        StudentDetail student = jpaApi.em().createQuery("select NEW models.StudentDetail(s.studentId, s.studentName, s.birthDate, s.gradeClass, avg(ag.grade), s.rankClass, s.parentPhone, s.parentEmail, s.studentEmail, s.studentPhone) from AssignmentGrade ag join Assignment a on ag.assignmentId = a.assignmentId join Student s on ag.studentId = s.studentId WHERE s.studentId =:studentId group by ag.studentId, s.studentName, s.birthDate, s.gradeClass, s.rankClass, s.parentPhone, s.parentEmail, s.studentEmail, s.studentPhone", StudentDetail.class)
                .setParameter("studentId", studentId).getSingleResult();

        return ok(views.html.student.render(student));
    }

    //Takes students' classifications from DB and graphs them on page
    @Transactional(readOnly = true)
    public Result getGradeClassChart()
    {
        String sql = "SELECT NEW GradeClassCount(s.gradeClass, COUNT(*)) " +
                "FROM Student s " +
                //"JOIN PugFood pf ON f.foodId = pf.foodId " +
                "GROUP BY s.gradeClass";

        List<GradeClassCount> gradeClassCounts = jpaApi.em().createQuery(sql, GradeClassCount.class).getResultList();

        return ok(views.html.gradeclasschart.render(gradeClassCounts));
    }

    /*@Transactional
    public Result getOverallGrade(int studentId)
    {
        List<Student> students = jpaApi.em().createQuery("select ag.studentid, avg(ag.grade) from assignmentgrade ag join assignment a on ag.assignmentId = a.assignment id group by ag.studentid", Student.class)
                .setParameter("studentId", studentId).getResultList();

        return ok(views.html.students.render(students));
    }*/


}
