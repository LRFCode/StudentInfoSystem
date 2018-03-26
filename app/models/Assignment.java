package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Assignment table
@Entity
public class Assignment
{
    @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int assignmentId;
    private String assignmentName;
    private int courseId;

    public int getAssignmentId()
    {
        return assignmentId;
    }

    public String getAssignmentName()
    {
        return assignmentName;
    }

    public int getCourseId()
    {
        return courseId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public void setAssignmentName(String assignmentName)
    {
        this.assignmentName = assignmentName;
    }

    public void setAssignmentId(int assignmentId)
    {
        this.assignmentId = assignmentId;
    }
}
