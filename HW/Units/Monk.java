package HW.Units;

import HW.Units.Magican;
import HW.Units.Unit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Monk extends Magican {

    public Monk (ArrayList<Unit> team, String name) {
        super(team, name,1,9,9,new int[] {1,2},1,2,2,6,
                6,1,2,new int[] {1,3});
        this.unitClass = "Monk";
    }

    protected void castHeal(Unit target) {
        if (curMp < 1 ) {
            System.out.println("Недостаточно маны");
            return;
        }
        if (target.currentHp < maxHp) {
            target.currentHp += (new Random().nextInt(2) * spellPower);
            if (currentHp > maxHp) {currentHp = maxHp;}
            System.out.println("Monk " + this.name + " heal " + target.name + " now HP " + target.currentHp);
        }
        this.curMp -= 1;
    };
    protected void castShield() {};

    @Override
    public String toString() {
        return "Monk " + name;
    }

    @Override
    public void step() {

        int index_damaged = 0;
        for (int i = 0; i < team.size(); i++) {
            for (int j = i + 1; j < team.size() - 1; j++) {
                if (team.get(i).currentHp != 0 || team.get(j).currentHp !=0) {
                    if ((team.get(i).maxHp - team.get(i).currentHp) < (team.get(j).maxHp - team.get(j).currentHp)) {
                        index_damaged = i;
                    }
                }
            }
        }
        castHeal(team.get(index_damaged));
    }

    @Override
    public String getInfo() {
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Макс ОМ: " + maxMp + " ОМ: " +
                curMp + " Макс дистанция заклинаний: " + spellDist + " Сила заклинаний: " + spellPower +  " Магический урон: " + Arrays.toString(magicDmg);
    }





}
