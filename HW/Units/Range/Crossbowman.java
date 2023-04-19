package HW.Units.Range;

import HW.Units.Unit;

public class Crossbowman extends Range {

    public Crossbowman (String name) {
        super(name,1,1,1,new int[] {1,1},1,11,1,new int[] {3,4},1,2,
                true,1,2,3,3);
    }

    protected void reload () {};

    @Override
    public String toString() {
        return "Crossbowman " + name;
    }
}
