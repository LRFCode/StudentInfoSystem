package controllers;

import models.Course;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.List;

public class CourseController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public CourseController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    //Retrieves entire course table from DB and loads it on page
    @Transactional(readOnly = true)
    public Result getCourses()
    {
        List<Course> courses = jpaApi.em().createQuery("SELECT c from Course c").getResultList();

        return ok(views.html.courses.render(courses));
    }

    //Retrieves a row from the teacher table in DB via id and prints it on page
    @Transactional(readOnly = true)
    public Result getCourse(int courseId)
    {
        Course course = jpaApi.em().createQuery("SELECT c FROM Course c WHERE courseId =:courseId", Course.class)
                .setParameter("courseId", courseId).getSingleResult();

        return ok(views.html.course.render(course));
    }



}
