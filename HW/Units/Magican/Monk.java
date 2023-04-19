package HW.Units.Magican;

import HW.Units.Unit;

public class Monk extends Magican {

    public Monk (String name) {
        super(name,1,1,1,new int[] {1,1},1,1,1,1,
                1,1,1,new int[] {1,1});
    }

    protected void castHeal() {};
    protected void castShield() {};

    @Override
    public String toString() {
        return "Monk " + name;
    }
}
