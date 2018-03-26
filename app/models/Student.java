package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

//Student table
@Entity
public class Student
{
    @Id
    private int studentId;
    private String studentName;
    private Date birthDate;
    private String parentEmail;
    private String parentPhone;
    private String studentEmail;
    private String studentPhone;
    private boolean bookmarked;
    private String gradeClass;
    private int rankClass;
    private BigDecimal overallGPA;


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

    public String getFormattedBirthDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");

        String date = null;

        if (birthDate != null)
        {
            date = sdf.format(birthDate);
        }

        return date;
    }

    public String getParentEmail()
    {
        return parentEmail;
    }

    public String getParentPhone()
    {
        return parentPhone;
    }

    public String getStudentEmail()
    {
        return studentEmail;
    }

    public String getStudentPhone()
    {
        return studentPhone;
    }

    public boolean isBookmarked()
    {
        return bookmarked;
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



}
