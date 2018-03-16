package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Teacher
{
    @Id
    private int teacherId;
    private String teacherName;
    private String subjectFocus;
    private Date hireDate;

    public int getTeacherId()
    {
        return teacherId;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public String getSubjectFocus()
    {
        return subjectFocus;
    }

    public Date getHireDate()
    {
        return hireDate;
    }
}
