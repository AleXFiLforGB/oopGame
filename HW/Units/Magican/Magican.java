package HW.Units.Magican;

import HW.Units.Unit;

public class Magican extends Unit {
    protected float maxMp,curMp;
    protected int spellDist, spellPower;
    protected int[] magicDmg;

    public Magican (String name, int level, float maxHp, float currentHp, int [] dmg, int defence,
                    int speed, float luck, float maxMp, float curMp, int spellDist, int spellPower, int[] magicDmg) {
        super(name,level,maxHp,currentHp,dmg,defence,speed,luck);
        this.maxMp = maxMp;
        this.curMp = curMp;
        this.spellDist = spellDist;
        this.spellPower = spellPower;
        this.magicDmg = magicDmg;
    }

    protected void castSpell () {};
    protected void Concentration () {};

}
