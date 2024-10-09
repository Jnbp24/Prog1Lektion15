package opgave01.models.classes;


public class Character
{
    String name;
    int level;

    public Character()
    {
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public Character(String name, int level)
    {
        this.name = name;
        this.level = level;
    }
}
