package HW.Units.Melee;



public class Peasant extends Melee {

    public Peasant (String name) {
        super (name,1,1,1,new int[] {1,2},1,1,1,1);
    }

    protected void hopeForLuck () {};

    protected void cookFood () {};

    @Override
    public String toString() {
        return "Peasant ";
    }


    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
//        return String.format("Имя: %s, Уровень: %d, Макс. ОЖ: %f, ОЖ: %f, Урон: %d, Защита: %d, Скорость: %d, Удача: %f", name,level,maxHp,currentHp, dmg, defence,speed,luck)
        return "Имя: " + name + " Уровень: " + level + " Макс. ОЖ: " + maxHp +  " ОЖ: " + currentHp +  " Урон: " + dmg
                +  " Защита: " + defence +  " Скорость: " + speed + " Удача: "+ luck + " Шанс крит урона: " + chanceCritDmg;
    }
}
