package HW.Units;

import java.util.ArrayList;
import java.util.Arrays;

public class Mage extends Magican {

    public Mage (ArrayList<Unit> team, String name) {
        super(team, name,1,8,8,new int []{1,1},1,2,1,5,5,
                3,3,new int []{3,4});
        this.unitClass = "Mage";
    }

    protected void castFireball () {};
    protected void castFirewall () {};

    @Override
    public String toString() {
        return "Mage " + name;
    }

    @Override
    public void step() {
        System.out.println("I am " + name + "и я пока ничего не умею");
    }

    @Override
    public String getInfo() {
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Макс ОМ: " + maxMp + " ОМ: " +
                curMp + " Макс дистанция заклинаний: " + spellDist + " Сила заклинаний: " + spellPower +  " Магический урон: " + Arrays.toString(magicDmg);
    }
}
