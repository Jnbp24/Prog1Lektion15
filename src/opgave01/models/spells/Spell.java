package opgave01.models.spells;

public class Spell
{
    int range;
    Duration duration;
    String name;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Spell(String name)
    {
        this.name = name;
    }

    public Duration getDuration()
    {
        return duration;
    }

    public void setDuration(Duration duration)
    {
        this.duration = duration;
    }

    public int getRange()
    {
        return range;
    }

    public void setRange(int range)
    {
        this.range = range;
    }

    public String toString()
    {

        return "Your spell has " + range +  " range" + " " + "and the cast time is " + duration;
    }
}

