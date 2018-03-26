package models;

import javax.persistence.Entity;
import javax.persistence.Id;

//Course table
@Entity
public class Course
{
   @Id
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
}
