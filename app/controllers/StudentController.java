package controllers;

import models.GradeClassCount;
import models.Student;
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

    //Retrieves entire student table from DB and puts it on page
    @Transactional(readOnly = true)
    public Result getStudents()
    {
        List<Student> students = jpaApi.em().createQuery("SELECT s from Student s").getResultList();

        return ok(views.html.students.render(students));
    }

    //Retrieves individual student and puts it on page
    @Transactional(readOnly = true)
    public Result getStudent(int studentId)
    {
        Student student = jpaApi.em().createQuery("SELECT s FROM Student s WHERE studentId =:studentId", Student.class)
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


}
