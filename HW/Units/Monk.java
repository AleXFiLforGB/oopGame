package HW.Units.Magican;

import HW.Units.Unit;

import java.util.ArrayList;

public class Monk extends Magican {

    public Monk (ArrayList<Unit> team, String name) {
        super(team, name,1,9,9,new int[] {1,2},1,1,2,6,
                6,1,2,new int[] {1,3});
    }

    protected void castHeal() {};
    protected void castShield() {};

    @Override
    public String toString() {
        return "Monk " + name;
    }

    @Override
    public void step() {

        int index_damaged = 0;
        for (int i = 0; i < target.length; i++){
            for (int j = i + 1; j < target.length - 1; j++) {
                if (target[i].)
            }
        }

    }

    @Override
    public String getInfo() {
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Макс ОМ: " + maxMp + " ОМ: " +
                curMp + " Макс дистанция заклинаний: " + spellDist + " Сила заклинаний: " + spellPower +  " Магический урон: " + magicDmg;
    }





}
