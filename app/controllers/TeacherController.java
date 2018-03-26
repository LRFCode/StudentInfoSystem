package controllers;

import models.Course;
import models.Teacher;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class TeacherController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public TeacherController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    //Retrieves teacher table from DB and loads it on page
    @Transactional(readOnly = true)
    public Result getTeachers()
    {
        List<Teacher> teachers = jpaApi.em().createQuery("SELECT t from Teacher t").getResultList();

        return ok(views.html.teachers.render(teachers));
    }

}
