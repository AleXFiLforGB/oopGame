package HW.Units;

import HW.Units.Range;
import HW.Units.Unit;

import java.util.ArrayList;
import java.util.Arrays;

public class Sniper extends Range {

    public Sniper (ArrayList<Unit> team, String name) {
        super(team,name,1,3,3,new int[] {1,1},1,4,1,new int[] {3,5},
                1,2,true,3,1,4,4);
        this.unitClass = "Sniper";
    }

    protected void getReady() {};

    @Override
    public String toString() {
        return "Sniper " + name;
    }



    @Override
    public String getInfo() {
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Дистанционный урон " + Arrays.toString(rangeDmg) + " Меткость: " +
                accuracy + " Пробитие: " + penetration + " Дистация стрельбы: " + rangeOfFire +  " Максимальное кол-во стрел: " + maxAmmo + " Кол-во стрел: " + ammo;
    }

    @Override
    public void step() {
        System.out.println("I am " + name + "и я пока ничего не умею");
    }
}
