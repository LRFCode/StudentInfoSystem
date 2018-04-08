package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class StudentCourseSub
{

    @Id
    private int studentCourseId;
    private int studentId;
    private int courseId;
    private String courseName;
    private String teacherName;
    private BigDecimal overallGPA;

    public int getStudentCourseId()
    {
        return studentCourseId;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public int getCourseId()
    {
        return courseId;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public BigDecimal getOverallGPA()
    {

        return overallGPA;
    }

}



