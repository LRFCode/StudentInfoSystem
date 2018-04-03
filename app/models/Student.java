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
    private String gradeClass;
    private int rankClass;
    private BigDecimal overallGPA;
    private String parentPhone;
    private String parentEmail;
    private String studentEmail;
    private String studentPhone;
    private boolean bookmarked;

    // GETTERS
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

    public String getParentPhone()
    {
        return parentPhone;
    }

    public String getParentEmail()
    {
        return parentEmail;
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

    public BigDecimal getFormattedOverallGPA()
    {
        double gpa = 0;

        if (overallGPA.intValue() >= 93.50)
        {
            gpa = 4.00;
        }
        else if (overallGPA.intValue() >= 89.50 && overallGPA.intValue() < 93.50)
        {
            gpa = 3.67;
        }
        else if (overallGPA.intValue() >= 86.50 && overallGPA.intValue() < 89.50)
        {
            gpa = 3.33;
        }
        else if (overallGPA.intValue() >= 83.50 && overallGPA.intValue() < 86.50)
        {
            gpa = 3.00;
        }
        else if (overallGPA.intValue() >= 79.50 && overallGPA.intValue() < 83.50)
        {
            gpa = 2.67;
        }
        else if (overallGPA.intValue() >= 76.50 && overallGPA.intValue() < 79.50)
        {
            gpa = 2.33;
        }
        else if (overallGPA.intValue() >= 73.50 && overallGPA.intValue() < 76.50)
        {
            gpa = 2.00;
        }
        else if (overallGPA.intValue() >= 69.50 && overallGPA.intValue() < 73.50)
        {
            gpa = 1.67;
        }
        else if (overallGPA.intValue() >= 66.50 && overallGPA.intValue() < 69.50)
        {
            gpa = 1.33;
        }
        else if (overallGPA.intValue() >= 63.50 && overallGPA.intValue() < 66.50)
        {
            gpa = 1.00;
        }
        else if (overallGPA.intValue() >= 59.50 && overallGPA.intValue() < 63.50)
        {
            gpa = 0.67;
        }
        else if (overallGPA.intValue() < 59.50)
        {
            gpa = 0.00;
        }

        return BigDecimal.valueOf(gpa);
    }

    //SETTERS


    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }

    public void setBirthDate(Date birthDate)
    {
        this.birthDate = birthDate;
    }

    public void setGradeClass(String gradeClass)
    {
        this.gradeClass = gradeClass;
    }

    public void setRankClass(int rankClass)
    {
        this.rankClass = rankClass;
    }

    public void setParentEmail(String parentEmail)
    {
        this.parentEmail = parentEmail;
    }

    public void setParentPhone(String parentPhone)
    {
        this.parentPhone = parentPhone;
    }

    public void setStudentEmail(String studentEmail)
    {
        this.studentEmail = studentEmail;
    }

    public void setStudentPhone(String studentPhone)
    {
        this.studentPhone = studentPhone;
    }

    public void setBookmarked(boolean bookmarked)
    {
        this.bookmarked = bookmarked;
    }
}
