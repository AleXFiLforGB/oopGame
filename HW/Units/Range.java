package HW.Units;


import HW.Units.Unit;

import java.util.ArrayList;

public abstract class Range extends Unit {

    protected int[] rangeDmg;
    protected float accuracy,penetration;
    protected boolean readyForFire;
    protected int rangeOfFire, speedOfReload, ammo, maxAmmo;

    public Range (ArrayList<Unit> team, String name, int level, float maxHp, float currentHp, int [] dmg, int defence, int initiative,
                  float luck, int[] rangeDmg, float accuracy, float penetration, boolean readyForFire, int rangeOfFire,
                  int speedOfReload, int ammo, int maxAmmo) {
        super(team, name,level,maxHp,currentHp,dmg,defence,initiative,luck);
        this.accuracy = accuracy;
        this.rangeDmg = rangeDmg;
        this.penetration = penetration;
        this.readyForFire = readyForFire;
        this.rangeOfFire = rangeOfFire;
        this.speedOfReload = speedOfReload;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    protected void aiming () {};
    protected void fire () {};
    protected void changeWeapon () {};
}
