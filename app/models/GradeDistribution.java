package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GradeDistribution
{
    @Id
    private String grade;
    private long count;

    public String getGrade()
    {
        return grade;
    }

    public long getCount()
    {
        return count;
    }

}
