package HW.Units.Range;

import HW.Units.Unit;

public class Sniper extends Range {

    public Sniper (String name) {
        super(name,1,1,1,new int[] {1,1},1,1,1,new int[] {2,3},
                1,1,true,3,1,2,2);
    }

    protected void getReady() {};

    @Override
    public String toString() {
        return "Sniper " + name;
    }
}
