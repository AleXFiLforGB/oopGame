package HW.Units.Melee;

import HW.Units.Unit;

import java.util.ArrayList;

public class Spearman extends Melee {

    public Spearman(ArrayList<Unit> team, String name) {
        super (team, name,1,15,15, new int[] {3,4},3,1,1,1);

    }

    protected void сounterАttack() {};

    protected void standUp () {};

    @Override
    public String toString() {
        return "Spearmen " + name;
    }

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Шанс крит урона: " + chanceCritDmg;
    }
}
