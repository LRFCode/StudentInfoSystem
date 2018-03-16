package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Student
{
    @Id
    private int studentId;
    private String studentName;
    private Date birthDate;
    private String gradeClass;
    private int rankClass;
    private BigDecimal overallGPA;
    private BigDecimal semesterGPA;


    public int getStudentId()
    {
        return studentId;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public Date getBirthDate()
    {
        return birthDate;
    }

    public String getGradeClass()
    {
        return gradeClass;
    }

    public int getRankClass()
    {
        return rankClass;
    }

    public BigDecimal getOverallGPA()
    {
        return overallGPA;
    }

    public BigDecimal getSemesterGPA()
    {
        return semesterGPA;
    }
}
