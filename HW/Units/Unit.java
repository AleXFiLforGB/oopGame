package HW.Units;

public class Unit {
    protected String name;
    protected int level,defence,speed;
    protected float maxHp,currentHp, luck;
    protected int[] dmg;

    public Unit (String name, int level, float maxHp, float currentHp, int [] dmg, int defence, int speed, float luck) {
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        this.dmg = dmg;
        this.defence = defence;
        this.speed = speed;
        this.luck = luck;

    }

    void attack () {}

    void defend (){}

    void movement (){}

    void await () {}
}
