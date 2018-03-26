package controllers;

import models.Assignment;
import models.AssignmentGrade;
import models.StudentCourse;
import play.db.jpa.JPAApi;
import play.db.jpa.Transactional;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.Random;

//Controller for generating test data to add to database
public class TestDataController extends Controller
{

    private JPAApi jpaApi1;

    @Inject
    public TestDataController(JPAApi jpaApi)
    {
        this.jpaApi1 = jpaApi;
    }

    public Result getTestDataGenerator()
    {
        return ok(views.html.testdata.render());
    }

    //Generate data for StudentCourse table
    @Transactional
    public Result postAddStudentCourseRows()
    {
        Random random = new Random();
        for (int studentId = 1; studentId <= 30; studentId++)
        {
            StudentCourse studentCourse = new StudentCourse();

            studentCourse.setStudentId(studentId);
            studentCourse.setCourseId(random.nextInt(20) + 1);

            jpaApi1.em().persist(studentCourse);
        }

        return ok("Added Rows!");

    }

    //Generate data for Assignment table
    @Transactional
    public Result postAddAssignmentRows()
    {
        //Random random = new Random();

        for (int courseId = 1; courseId <= 20; courseId++)
        {

            for (int count = 1; count <= 5; count++)
            {
                Assignment assignment = new Assignment();
                assignment.setCourseId(courseId);

                if (count == 1)
                {
                    assignment.setAssignmentName("Pop Quiz 3");
                }
                if (count == 2)
                {
                    assignment.setAssignmentName("Midterm");
                }
                if (count == 3)
                {
                    assignment.setAssignmentName("Interest Topic Paper");
                }
                if (count == 4)
                {
                    assignment.setAssignmentName("Semester Project");
                }
                if (count == 5)
                {
                    assignment.setAssignmentName("Course Final");
                }

                jpaApi1.em().persist(assignment);
            }

        }

        return ok("Added Rows!");

    }

    //An edit as needed, catch-all data generator for adding assignments
    @Transactional
    public Result postAddAssignmentRow()
    {
        int assignmentId = 61;
        //Random random = new Random();
        for (int courseId = 1; courseId <= 20; courseId++)
        {

            Assignment assignment = new Assignment();

            assignment.setAssignmentId(assignmentId);
            assignment.setCourseId(courseId);
            assignment.setAssignmentName("Pop Quiz 2");

            assignmentId++;

            jpaApi1.em().persist(assignment);
        }

        return ok("Added Rows!");
    }

    //Generate grades for student's assignments
    @Transactional
    public Result postAddAssignmentGradeRows()
    {
        Random random = new Random();
        for (int assignmentId = 1; assignmentId <= 280; assignmentId++)
        {

            AssignmentGrade assignmentGrade = new AssignmentGrade();

            assignmentGrade.setAssignmentId(assignmentId);

            jpaApi1.em().persist(assignmentGrade);
        }

        return ok("Added Rows!");

    }


}


