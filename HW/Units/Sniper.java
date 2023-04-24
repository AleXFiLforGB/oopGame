package HW.Units.Range;

import HW.Units.Unit;

import java.util.ArrayList;

public class Sniper extends Range {

    public Sniper (ArrayList<Unit> team, String name) {
        super(team,name,1,1,1,new int[] {1,1},1,1,1,new int[] {3,5},
                1,2,true,3,1,4,4);
    }

    protected void getReady() {};

    @Override
    public String toString() {
        return "Sniper " + name;
    }



    @Override
    public String getInfo() {
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Дистанционный урон " + rangeDmg + " Меткость: " +
                accuracy + " Пробитие: " + penetration + " Дистация стрельбы: " + rangeOfFire +  " Максимальное кол-во стрел: " + maxAmmo + " Кол-во стрел: " + ammo;
    }
}
