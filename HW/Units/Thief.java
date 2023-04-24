package HW.Units.Melee;

import HW.Units.Unit;

import java.util.ArrayList;

public class Thief extends Melee {

    protected int stealth;
    protected int evasion;

    public Thief (ArrayList<Unit> team, String name) {
        super(team, name,1,12,12,new int[] {1,3},1,1,1,3);
        this.stealth = 1;
        this.evasion = 1;
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

    }

    @Override
    public String getInfo() {
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Шанс крит урона: " + chanceCritDmg;
    }
}
