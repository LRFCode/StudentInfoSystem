package controllers;

import com.amazonaws.auth.policy.actions.SimpleEmailServiceActions;
import models.GradeClassCount;
import play.data.FormFactory;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;
import services.Email;

import javax.inject.Inject;
import java.util.Date;
import java.util.List;

// Admin page and Login screen
public class LandingController extends Controller
{
    private FormFactory formFactory;
    private JPAApi jpaApi;


    @Inject
    public LandingController(FormFactory formFactory, JPAApi jpaApi)
    {
        this.formFactory = formFactory;
        this.jpaApi = jpaApi;
    }

    //Admin Page
    @Transactional(readOnly = true)
    public Result getAdmin()
    {
        String sql = "SELECT NEW GradeClassCount(s.gradeClass, COUNT(*)) " +
                "FROM Student s " +
                //"JOIN PugFood pf ON f.foodId = pf.foodId " +
                "GROUP BY s.gradeClass";

        List<GradeClassCount> gradeClassCounts = jpaApi.em().createQuery(sql, GradeClassCount.class).getResultList();

        return ok(views.html.adminHome.render(gradeClassCounts));
    }

    //Login Page
    @Transactional(readOnly = true)
    public Result getLogin()
    {

        return ok(views.html.login.render());

    }


    public Result postSendEmail()
    {
        Date date = new Date();

        Email.sendEmail(date);

        return ok("Sent Email");
    }

}
