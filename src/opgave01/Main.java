package opgave01;

import opgave01.models.classes.Barbarian;
import opgave01.models.classes.Ranger;
import opgave01.models.classes.Wizard;
import opgave01.models.spells.Duration;
import opgave01.models.spells.Spell;
import opgave01.models.weapons.Ranged;
import opgave01.models.weapons.Weapon;

import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        Weapon longsword = new Weapon("Longsword");

        Barbarian barbarian = new Barbarian("Forfelstr",6);

        Ranged shortbow = new Ranged("Shortbow");
        barbarian.addWeapon(shortbow);
        barbarian.addWeapon(longsword);
        shortbow.setRange(80);

        System.out.println(barbarian.getName() + "\n" + barbarian.getLevel());
        barbarian.listCharacterWeapon();

        System.out.println("_________________________________________");

        ArrayList<Spell> characterSpell = new ArrayList<>();
        Spell fireball = new Spell("Fireball");
        characterSpell.add(fireball);

        fireball.setRange(150);
        fireball.setDuration(Duration.INSTANTANEOUS);

        Wizard wizard = new Wizard("Orlemaex",10);

        System.out.println(wizard.getName() + "\n" + wizard.getLevel() + "\n" + characterSpell.toString());

        System.out.println("_____________________________________");

        Ranger ranger = new Ranger("Legolas",16);
        Weapon dagger = new Weapon("Dagger");
        Spell cloak = new Spell("Cloak");

        ranger.addmeleeWeapon(dagger);
        ranger.addRangerSpell(cloak);

        System.out.println(ranger.getName() + "\n" + ranger.getLevel());
        ranger.listCharacterWeapon();
        ranger.listCharacterSpell();






    }
}
