package HW.Units.Melee;

import HW.Units.Unit;

import java.util.ArrayList;

public abstract class Melee extends Unit {
    protected float chanceCritDmg;

    public Melee (ArrayList<Unit> team, String name, int level, float maxHp, float currentHp, int [] dmg, int defence, int speed, float luck, float critDamage) {
        super(team, name,level,maxHp,currentHp,dmg,defence,speed,luck);
        this.chanceCritDmg = critDamage;

    }




}
