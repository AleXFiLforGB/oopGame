package HW.Units;

import java.util.ArrayList;
import java.util.Arrays;

public class Crossbowman extends Range {

    public Crossbowman (ArrayList<Unit> team, String name, int x, int y) {
        super(team, name,1,4,4,new int[] {1,2},2,4,1,new int[] {4,7},1,4,
                true,5,2,4,3, x, y);
        this.unitClass = "Crossbowman";
    }

    protected void reload () {
        System.out.println(unitClass + " " + name + " тратит ход на зарядку арбалета.");
    };

    @Override
    public void step(ArrayList<Unit> team1) {
        if (readyForFire == true) {
            super.step(team1);
            readyForFire = false;
        } else reload();
    }

    @Override
    public String toString() {
        return "Crossbowman " + name;
    }


    @Override
    public String getInfo() {
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Дистанционный урон " + Arrays.toString(rangeDmg) +
                " Меткость: " + accuracy + " Пробитие: " + penetration + " Дистация стрельбы: " + rangeOfFire +
                " Максимальное кол-во стрел: " + maxAmmo + " Кол-во стрел: " + ammo + " Скорость перезарядки " + speedOfReload;

    }


}
