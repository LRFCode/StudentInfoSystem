package models;

import com.sun.org.apache.bcel.internal.generic.NEW;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.Date;

//example model
@Entity
public class StudentDetail
{
    @Id
    private int studentId;
    private String studentName;
    private double overallGPA;
    private Date birthDate;
    private int rankClass;
    private String parentPhone;
    private String parentEmail;
    private String studentEmail;
    private String studentPhone;
    private boolean bookmarked;
    private String gradeClass;
    // courseGPA comes from the studentCourse table instead of the student table
    private BigDecimal courseGPA;


    public StudentDetail(int studentId, String studentName, Date birthDate, String gradeClass, double overallGPA, int rankClass, String parentPhone, String
            parentEmail, String studentEmail, String studentPhone)
    {
        this.studentId = studentId;
        this.studentName = studentName;
        this.birthDate = birthDate;
        this.gradeClass = gradeClass;
        this.overallGPA = overallGPA;
        this.rankClass = rankClass;
        this.parentPhone = parentPhone;
        this.parentEmail = parentEmail;
        this.studentEmail = studentEmail;
        this.studentPhone = studentPhone;


    }

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

    public double getOverallGPA()
    {
        return overallGPA;
    }

    public BigDecimal getFormattedOverallGPA()
    {
        double gpa = 0;

        if (overallGPA >= 93.50)
        {
            gpa = 4.00;
        }
        else if (overallGPA >= 89.50 && overallGPA < 93.50)
        {
            gpa = 3.67;
        }
        else if (overallGPA >= 86.50 && overallGPA < 89.50)
        {
            gpa = 3.33;
        }
        else if (overallGPA >= 83.50 && overallGPA < 86.50)
        {
            gpa = 3.00;
        }
        else if (overallGPA >= 79.50 && overallGPA < 83.50)
        {
            gpa = 2.67;
        }
        else if (overallGPA >= 76.50 && overallGPA < 79.50)
        {
            gpa = 2.33;
        }
        else if (overallGPA >= 73.50 && overallGPA < 76.50)
        {
            gpa = 2.00;
        }
        else if (overallGPA >= 69.50 && overallGPA < 73.50)
        {
            gpa = 1.67;
        }
        else if (overallGPA >= 66.50 && overallGPA < 69.50)
        {
            gpa = 1.33;
        }
        else if (overallGPA >= 63.50 && overallGPA < 66.50)
        {
            gpa = 1.00;
        }
        else if (overallGPA >= 59.50 && overallGPA < 63.50)
        {
            gpa = 0.67;
        }
        else if (overallGPA < 59.50)
        {
            gpa = 0.00;
        }

        return new BigDecimal(gpa).setScale(2,BigDecimal.ROUND_HALF_UP);
    }

    public int getRankClass()
    {
        return rankClass;
    }

    public BigDecimal getCourseGPA()
    {
        return courseGPA;
    }

    public String getGradeClass()
    {
        return gradeClass;
    }

    public String getParentPhone()
    {
        return parentPhone;
    }

    public void setParentPhone(String parentPhone)
    {
        this.parentPhone = parentPhone;
    }

    public String getParentEmail()
    {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail)
    {
        this.parentEmail = parentEmail;
    }

    public String getStudentEmail()
    {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail)
    {
        this.studentEmail = studentEmail;
    }

    public String getStudentPhone()
    {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone)
    {
        this.studentPhone = studentPhone;
    }

    public boolean isBookmarked()
    {
        return bookmarked;
    }

    public void setBookmarked(boolean bookmarked)
    {
        this.bookmarked = bookmarked;
    }
}
