package HW.Units.Melee;

import Sem.Sem1.Peasent;
import Sem.Sem1.Unit;

public class Peasant extends Melee {

    public Peasant (String name) {
        super (name,1,1,1,new int[] {1,2},1,1,1,1);
    }

    protected void hopeForLuck () {};

    protected void cookFood () {};

    @Override
    public String toString() {
        return "Peasant " + name;
    }
}
