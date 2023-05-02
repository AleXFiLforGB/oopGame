package HW.Units;

import java.util.ArrayList;
import java.util.Arrays;

public class Mage extends Magican {

    public Mage (ArrayList<Unit> team, String name, int x, int y) {
        super( team, name,1,8,8,new int []{1,1},1,2,1,5,5,
                3,3,new int []{3,4}, x, y);
        this.unitClass = "Mage";
    }

    protected void castFireArrow (ArrayList<Unit>enemyTeam) {
        float minDist = Float.MAX_VALUE;
        Unit target = null;
        for (Unit enemy : enemyTeam) {
            float tmp = enemy.coordinate.findNearEnemy(this.coordinate);
            if (tmp < minDist && tmp <= spellDist) {
                minDist = tmp;
                target = enemy;
            }
        }
        if (target != null) {
            System.out.println(unitClass + " " + name + " cast firearrow at " + target.unitClass + " " + target.name + "." +
                    "Now HP " + target.name + " " + target.currentHp);
        }

        System.out.println(unitClass + " " + name + " не видет цель. Должен или идти или ждать");
    }
    protected void castFirewall () {};

    @Override
    public String toString() {
        return "Mage " + name;
    }

    @Override
    public void step(ArrayList<Unit> team1) {
        if (currentHp > 0) {
            if (curMp > 0) {
                castFireArrow(team1);
            }
            else Concentration();
        }

    }

    @Override
    public String getInfo() {
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Макс ОМ: " + maxMp + " ОМ: " +
                curMp + " Макс дистанция заклинаний: " + spellDist + " Сила заклинаний: " + spellPower +  " Магический урон: " + Arrays.toString(magicDmg);
    }
}
