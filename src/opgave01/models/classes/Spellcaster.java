package opgave01.models.classes;


import opgave01.models.spells.Spell;
import opgave01.models.weapons.Weapon;

import java.util.ArrayList;

public class Spellcaster extends Character
{

    ArrayList<Spell> spells = new ArrayList<>();

    public Spellcaster(String name, int level)
    {
        this.name = name;
        this.level = level;
    }

    public Spellcaster()
    {
    }

    public void addSpell(Spell spell)
    {
        spells.add(spell);
    }

    public void listCharacterSpell()
    {
        for (Spell spell : spells)
        {
            System.out.println(spell.getName());
        }
    }

}
