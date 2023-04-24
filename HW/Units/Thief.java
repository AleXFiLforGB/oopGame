package HW.Units;

import HW.Units.Melee;
import HW.Units.Unit;

import java.util.ArrayList;
import java.util.Arrays;

public class Thief extends Melee {

    protected int stealth,evasion;


    public Thief (ArrayList<Unit> team, String name) {
        super(team, name,1,12,12,new int[] {1,3},1,3,1,3);
        this.stealth = 1;
        this.evasion = 1;
        this.unitClass = "Thief";
    }

    protected void dodge() {};

    protected void stealth() {};

    protected void setTrap () {};

    @Override
    public String toString() {
        return "Thief " + name;
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
