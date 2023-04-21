package HW.Units.Magican;

import HW.Units.Unit;

public class Mage extends Magican {

    public Mage (String name) {
        super(name,1,1,1,new int []{1,1},1,1,1,1,1,
                1,1,new int []{1,2});
    }

    protected void castFireball () {};
    protected void castFirewall () {};

    @Override
    public String toString() {
        return "Mage ";
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
