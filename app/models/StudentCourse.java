package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

//StudentCourse table
@Entity
public class StudentCourse
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentCourseId;
    private int studentId;
    private int courseId;
    private BigDecimal grade;

    public void setStudentCourseId(int studentCourseId)
    {
        this.studentCourseId = studentCourseId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

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

    public BigDecimal getGrade()
    {
        return grade;
    }


}
