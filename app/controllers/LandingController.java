package controllers;

import com.amazonaws.auth.policy.actions.SimpleEmailServiceActions;
import models.GradeClassCount;
import models.GradeDistribution;
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
        String gradeClassSQL = "SELECT NEW GradeClassCount(s.gradeClass, COUNT(*)) " +
                "FROM Student s " +
                //"JOIN PugFood pf ON f.foodId = pf.foodId " +
                "GROUP BY s.gradeClass";

        List<GradeClassCount> gradeClassCounts = jpaApi.em().createQuery(gradeClassSQL, GradeClassCount.class)
                .getResultList();


        String gradeDistributionSQL = "SELECT CASE WHEN avgGrade > 89.50 THEN 'A' WHEN avgGrade >= 79.50 AND avgGrade < 89.50 " +
                "THEN 'B' WHEN avgGrade >= 69.50 AND avgGrade < 79.50 THEN 'C' WHEN avgGrade >= 59.50 AND avgGrade < 69.50 THEN " +
                "'D' ELSE 'F' END AS grade, COUNT(*) as count FROM (SELECT ag.studentid, AVG(ag.grade) AS avgGrade FROM " +
                "assignmentgrade ag GROUP BY ag.studentId) AS grades GROUP BY grade";

        List<GradeDistribution> gradeDistributions = jpaApi.em().createNativeQuery(gradeDistributionSQL,
                GradeDistribution.class).getResultList();


        return ok(views.html.adminHome.render(gradeClassCounts, gradeDistributions));
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
