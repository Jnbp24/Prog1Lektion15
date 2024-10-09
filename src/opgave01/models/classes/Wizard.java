package opgave01.models.classes;

import opgave01.models.spells.Spell;

import java.util.ArrayList;

public class Wizard extends Spellcaster
{
    ArrayList<Spell> spells = new ArrayList<>();

    public Wizard(String name, int level)
    {
        super();
        this.name = name;
        this.level = level;
    }


}
