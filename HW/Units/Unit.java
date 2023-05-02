package HW.Units;

import HW.Coordinate;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements GameInterface, Comparable{
    protected String name, unitClass, state;
    protected int level,defence,initiative;
    protected float maxHp,currentHp, luck;
    protected int[] dmg;
    protected ArrayList <Unit> team;
    protected Coordinate coordinate;

    public Unit (ArrayList <Unit> team, String name, int level, float maxHp, float currentHp, int [] dmg, int defence, int initiative, float luck, int x, int y) {
        this.team = team;
        this.name = name;
        this.level = level;
        this.maxHp = maxHp;
        this.currentHp = currentHp;
        if (new Random().nextBoolean()) this.currentHp/=2;
        this.dmg = dmg;
        this.defence = defence;
        this.initiative = initiative;
        this.luck = luck;
        this.coordinate = new Coordinate(x,y);
        this.state = "active";

    }

    @Override
    public void step(ArrayList<Unit> team1) {
        state = "inactive";
    }

    @Override
    public int compareTo(Object o) {
        Unit unit = (Unit) o;
        return unit.initiative - this.initiative;
    }


    void attack () {}

    void defend (){}

    void movement (){}

    void await () {}
}
