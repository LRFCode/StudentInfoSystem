package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GradeClassCount
{
    @Id
    private String label;
    private long count;

    public GradeClassCount(String label, long count)
    {
        this.label = label;
        this.count = count;
    }

    public String getLabel()
    {
        return label;
    }

    public long getCount()
    {
        return count;
    }
}


