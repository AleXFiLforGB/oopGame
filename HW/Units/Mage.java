package HW.Units.Magican;

import HW.Units.Unit;

import java.util.ArrayList;

public class Mage extends Magican {

    public Mage (ArrayList<Unit> team, String name) {
        super(team, name,1,8,8,new int []{1,1},1,1,1,5,5,
                3,3,new int []{3,4});
    }

    protected void castFireball () {};
    protected void castFirewall () {};

    @Override
    public String toString() {
        return "Mage " + name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Макс ОМ: " + maxMp + " ОМ: " +
                curMp + " Макс дистанция заклинаний: " + spellDist + " Сила заклинаний: " + spellPower +  " Магический урон: " + magicDmg;
    }
}
