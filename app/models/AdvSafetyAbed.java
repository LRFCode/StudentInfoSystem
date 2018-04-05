package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AdvSafetyAbed
{
    @Id
    private String label;
    private int count;

    public String getLabel()
    {
        return label;
    }

    public long getCount()
    {
        return count;
    }
}


