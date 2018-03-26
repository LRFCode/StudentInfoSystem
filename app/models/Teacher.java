package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.text.SimpleDateFormat;
import java.util.Date;

//Teacher table
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

    public String getFormattedHireDate()
    {
        SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");

        String date = null;

        if (hireDate != null)
        {
            date = sdf.format(hireDate);
        }

        return date;
    }
}
