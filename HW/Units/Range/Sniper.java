package HW.Units.Range;

import HW.Units.Unit;

public class Sniper extends Range {

    public Sniper (String name) {
        super(name,1,1,1,new int[] {1,1},1,1,1,new int[] {2,3},
                1,1,true,3,1,2,2);
    }

    protected void getReady() {};

    @Override
    public String toString() {
        return "Sniper " + name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Дистанционный урон " + rangeDmg + " Меткость: " +
                accuracy + " Пробитие: " + penetration + " Дистация стрельбы: " + rangeOfFire +  " Максимальное кол-во стрел: " + maxAmmo + " Кол-во стрел: " + ammo;
    }
}
