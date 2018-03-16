package controllers;

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

    @Transactional (readOnly = true)
    public Result getStudents()
    {
        List<Student> students = jpaApi.em().createQuery("SELECT s from Student s").getResultList();

        return ok(views.html.students.render(students));
    }

    @Transactional (readOnly = true)
    public Result getStudent(int studentId)
    {
        Student student = jpaApi.em().createQuery("SELECT s FROM Student s WHERE studentId =:studentId", Student.class)
                .setParameter("studentId", studentId).getSingleResult();

        return ok(views.html.student.render(student));
    }


}
