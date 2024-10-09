package opgave01.models.classes;

import opgave01.models.spells.Spell;
import opgave01.models.weapons.Weapon;

import java.util.ArrayList;

public class Ranger extends Character
{
    ArrayList<Weapon> weapons = new ArrayList<>();
    ArrayList<Spell> spells = new ArrayList<>();

    public Ranger(String name, int level)
    {
        super(name,level);
    }
    public void addmeleeWeapon(Weapon weapon)
    {
        weapons.add(weapon);
    }
    public  void addRangerSpell(Spell spell)
    {
        spells.add(spell);
    }

    public void listCharacterWeapon()
    {
        for (Weapon weapon : weapons)
        {
            System.out.println(weapon.getName());
        }
    }

    public void listCharacterSpell()
    {
        for (Spell spell : spells)
        {
            System.out.println(spell.getName());
        }
    }

}
