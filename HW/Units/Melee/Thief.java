package HW.Units.Melee;

public class Thief extends Melee {

    protected int stealth;
    protected int evasion;

    public Thief (String name) {
        super(name,1,1,1,new int[] {1,2},1,1,1,2);
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
}
