package opgave01.models.classes;

import opgave01.models.weapons.Weapon;

import java.util.ArrayList;

public class Warrior extends Character
{
    ArrayList<Weapon> weapons = new ArrayList<>();

    public Warrior(String name, int level)
    {
        super(name,level);
    }

    public Warrior()
    {

    }

    public void addWeapon(Weapon weapon)
    {
        weapons.add(weapon);
    }

    public void listCharacterWeapon()
    {
        for (Weapon weapon : weapons)
        {
            System.out.println(weapon.getName());
        }
    }


}
