package HW.Units;

import java.util.ArrayList;
import java.util.Arrays;

public class Crossbowman extends Range {

    public Crossbowman (ArrayList<Unit> team, String name) {
        super(team, name,1,1,1,new int[] {1,2},1,4,1,new int[] {4,7},1,2,
                true,2,2,3,3);
        this.unitClass = "Crossbowman";
    }

    protected void reload () {};

    @Override
    public String toString() {
        return "Crossbowman " + name;
    }

    @Override
    public void step() {
        System.out.println("I am " + name + "и я пока ничего не умею");
    }

    @Override
    public String getInfo() {
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Дистанционный урон " + Arrays.toString(rangeDmg) +
                " Меткость: " + accuracy + " Пробитие: " + penetration + " Дистация стрельбы: " + rangeOfFire +
                " Максимальное кол-во стрел: " + maxAmmo + " Кол-во стрел: " + ammo + " Скорость перезарядки " + speedOfReload;

    }
}
