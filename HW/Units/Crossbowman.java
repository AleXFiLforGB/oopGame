package HW.Units.Range;

import HW.Units.Unit;

import java.util.ArrayList;

public class Crossbowman extends Range {

    public Crossbowman (ArrayList<Unit> team, String name) {
        super(team, name,1,1,1,new int[] {1,2},1,3,1,new int[] {4,7},1,2,
                true,2,2,3,3);
    }

    protected void reload () {};

    @Override
    public String toString() {
        return "Crossbowman " + name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Дистанционный урон " + rangeDmg +
                " Меткость: " + accuracy + " Пробитие: " + penetration + " Дистация стрельбы: " + rangeOfFire +
                " Максимальное кол-во стрел: " + maxAmmo + " Кол-во стрел: " + ammo + " Скорость перезарядки " + speedOfReload;

    }
}
