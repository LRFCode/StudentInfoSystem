package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Course table
@Entity
public class Course
{
   @Id @GeneratedValue(strategy= GenerationType.IDENTITY)
   private int courseId;
   private String courseName;
   private int teacherId;

    public int getCourseId()
    {
        return courseId;
    }

    public String getCourseName()
    {
        return courseName;
    }

    public int getTeacherId()
    {
        return teacherId;
    }

    public void setCourseId(int courseId)
    {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
}
