package opgave01.models.weapons;

public class Ranged extends Weapon
{
    int range;

    public Ranged(String name)
    {
        super(name);
    }

    public int getRange()
    {
        return range;
    }

    public void setRange(int range)
    {
        this.range = range;
    }

}
