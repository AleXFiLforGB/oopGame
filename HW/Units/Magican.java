package HW.Units.Magican;

import HW.Units.Unit;

import java.util.ArrayList;

public abstract class Magican extends Unit {
    protected float maxMp,curMp;
    protected int spellDist, spellPower;
    protected int[] magicDmg;

    public Magican (ArrayList<Unit> team, String name, int level, float maxHp, float currentHp, int [] dmg, int defence,
                    int speed, float luck, float maxMp, float curMp, int spellDist, int spellPower, int[] magicDmg) {
        super(team, name,level,maxHp,currentHp,dmg,defence,speed,luck);
        this.maxMp = maxMp;
        this.curMp = curMp;
        this.spellDist = spellDist;
        this.spellPower = spellPower;
        this.magicDmg = magicDmg;
    }

    protected void castSpell () {};
    protected void Concentration () {};

}
