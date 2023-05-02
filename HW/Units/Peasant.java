package HW.Units;


import java.util.ArrayList;
import java.util.Arrays;

public class Peasant extends Melee {

    public Peasant (ArrayList<Unit> team, String name, int x, int y) {
        super (team, name,1,6,6,new int[] {1,2},1,1,2,1, x, y);
        this.unitClass = "Peasant";
    }

    protected void hopeForLuck () {};

    protected void cookFood () {};

    @Override
    public String toString() {
        return "Peasant " + name;
    }


    @Override
    public void step(ArrayList<Unit> team1) {
        System.out.println("I am " + name + "и я пока ничего не умею");
    }

    @Override
    public String getInfo() {
//        return String.format("Имя: %s, Уровень: %d, Макс. ОЖ: %f, ОЖ: %f, Урон: %d, Защита: %d, Скорость: %d, Удача: %f", name,level,maxHp,currentHp, dmg, defence,speed,luck)
        return unitClass + " Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + Arrays.toString(dmg)
                +  " Защита: " + defence +  " Скорость: " + initiative + " Удача: "+ luck + " Шанс крит урона: " + chanceCritDmg;
    }
}
