package HW.Units;

import HW.Units.Unit;

import java.util.ArrayList;

public abstract class Magican extends Unit {
    protected float maxMp,curMp;
    protected int spellDist, spellPower;
    protected int[] magicDmg;

    public Magican (ArrayList<Unit> team, String name, int level, float maxHp, float currentHp, int [] dmg, int defence,
                    int initiative, float luck, float maxMp, float curMp, int spellDist, int spellPower, int[] magicDmg,
                    int x, int y) {
        super(team, name,level,maxHp,currentHp,dmg,defence,initiative,luck, x, y);
        this.maxMp = maxMp;
        this.curMp = curMp;
        this.spellDist = spellDist;
        this.spellPower = spellPower;
        this.magicDmg = magicDmg;

    }

    @Override
    public void step(ArrayList<Unit> team1) {
        super.step(team1);
    }

    protected void castSpell () {};
    protected void Concentration () {
        curMp += 1;
        if (curMp > maxMp) {curMp = maxMp;}
        System.out.println(unitClass + " " + name + " restored 1 МР. Now current MP: " + curMp );
    };

}
