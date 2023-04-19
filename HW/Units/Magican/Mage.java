package HW.Units.Magican;

import HW.Units.Unit;

public class Mage extends Magican {

    public Mage (String name) {
        super(name,1,1,1,new int []{1,1},1,1,1,1,1,
                1,1,new int []{1,2});
    }

    protected void castFireball () {};
    protected void castFirewall () {};

    @Override
    public String toString() {
        return "Mage " + name;
    }
}
