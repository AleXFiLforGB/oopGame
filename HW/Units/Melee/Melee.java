package HW.Units.Melee;

import HW.Units.Unit;

public class Melee extends Unit {
    protected float critDamage;

    public Melee (String name, int level, float maxHp, float currentHp, int [] dmg, int defence, int speed, float luck, float critDamage) {
        super(name,level,maxHp,currentHp,dmg,defence,speed,luck);
        this.critDamage = critDamage;

    }




}
