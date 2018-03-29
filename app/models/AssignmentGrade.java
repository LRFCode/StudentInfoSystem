package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;

//AssignmentGrade table
@Entity
public class AssignmentGrade
{
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int assignmentGradeId;
    private int assignmentId;
    private int studentId;
    private BigDecimal grade;


    public int getAssignmentGradeId()
    {
        return assignmentGradeId;
    }

    public int getAssignmentId()
    {
        return assignmentId;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public BigDecimal getGrade()
    {
        return grade;
    }

    public void setAssignmentId(int assignmentId)
    {
        this.assignmentId = assignmentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public void setGrade(BigDecimal grade)
    {
        this.grade = grade;
    }
}
//L 3.67, C 3.67, I .67, A 2.00  jja