package HW.Units;

import HW.Units.Melee;
import HW.Units.Unit;

import java.util.ArrayList;
import java.util.Arrays;

public class Spearman extends Melee {

    public Spearman(ArrayList<Unit> team, String name) {
        super (team, name,1,15,15, new int[] {3,4},3,3,1,1);
        this.unitClass = "Spearman";
    }

    protected void сounterАttack() {};

    protected void standUp () {};

    @Override
    public String toString() {
        return "Spearmen " + name;
    }

    @Override
    public void step() {
        System.out.println("I am " + name + "и я пока ничего не умею");
    }

    @Override
    public String getInfo() {
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Шанс крит урона: " + chanceCritDmg;
    }
}
