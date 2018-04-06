package models;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class StudentGradeSub
{
    @Id
    private int assignmentGradeId;
    private int courseId;
    private String assignmentName;
    private BigDecimal grade;

    public int getCourseId()
    {
        return courseId;
    }

    public int getAssignmentGradeId()
    {
        return assignmentGradeId;
    }

    public String getAssignmentName()
    {
        return assignmentName;
    }

    public BigDecimal getGrade()
    {
        return grade;
    }

    public void setAssignmentName(String assignmentName)
    {
        this.assignmentName = assignmentName;
    }

    public void setGrade(BigDecimal grade)
    {
        this.grade = grade;
    }
}



