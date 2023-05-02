package HW.Units;

import HW.Units.Unit;

import java.util.ArrayList;

public abstract class Melee extends Unit {
    protected float chanceCritDmg;

    public Melee (ArrayList<Unit> team, String name, int level, float maxHp, float currentHp, int [] dmg,
                  int defence, int initiative, float luck, float critDamage, int x, int y) {
        super(team, name,level,maxHp,currentHp,dmg,defence,initiative,luck, x, y);
        this.chanceCritDmg = critDamage;

    }


    @Override
    public void step(ArrayList<Unit> team1) {
        super.step(team1);
        System.out.println("Я " + unitClass + " " + name + " я пока ничего не умею");
    }
}
