package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ZeroDistribution
{
    @Id
    private String zeroesPerStudent;
    private long count;

    public String getZeroesPerStudent()
    {
        return zeroesPerStudent;
    }

    public long getCount()
    {
        return count;
    }

}
