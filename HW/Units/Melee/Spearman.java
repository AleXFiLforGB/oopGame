package HW.Units.Melee;

public class Spearman extends Melee {

    public Spearman(String name) {
        super (name,1,1,1, new int[] {1,2},1,1,1,1);

    }

    protected void сounterАttack() {};

    protected void standUp () {};

    @Override
    public String toString() {
        return "Spearmen ";
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
