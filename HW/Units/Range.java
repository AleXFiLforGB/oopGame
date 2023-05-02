package HW.Units;


import HW.Units.Unit;

import java.util.ArrayList;

public abstract class Range extends Unit {

    protected int[] rangeDmg;
    protected float accuracy, penetration;
    protected boolean readyForFire;
    protected int speedOfReload, ammo, maxAmmo, rangeOfFire;

    public Range(ArrayList<Unit> team, String name, int level, float maxHp, float currentHp, int[] dmg, int defence, int initiative,
                 float luck, int[] rangeDmg, float accuracy, float penetration, boolean readyForFire, int rangeOfFire,
                 int speedOfReload, int ammo, int maxAmmo, int x, int y) {
        super(team, name, level, maxHp, currentHp, dmg, defence, initiative, luck, x, y);
        this.accuracy = accuracy;
        this.rangeDmg = rangeDmg;
        this.penetration = penetration;
        this.readyForFire = readyForFire;
        this.rangeOfFire = rangeOfFire;
        this.speedOfReload = speedOfReload;
        this.ammo = ammo;
        this.maxAmmo = maxAmmo;
    }

    @Override
    public void step(ArrayList<Unit> team1) {
        if (currentHp > 0 || ammo > 0) {
            float minDist = Float.MAX_VALUE;
            Unit target = null;
            for (Unit enemy : team1) {
                float tmp = enemy.coordinate.findNearEnemy(this.coordinate);
                if (tmp < minDist && tmp <= rangeOfFire) {
                    minDist = tmp;
                    target = enemy;
                }
            }
            /**проверка на наличие креста рядом
             * Если крест находится на в соседней клекте то расстояние будет меньше 2
             * Второе условие чтобы не выбрать себя, костыль из-за того, команда пишется в поле юнита
             */
            boolean hasNearPeasent = false;
            for (Unit friend : team) {
                float tmp = friend.coordinate.findNearEnemy(this.coordinate);
                if (tmp < 2 & tmp != 0) {
                    if (friend.unitClass == "Peasant") {
                        hasNearPeasent = true;
                    }
                }
            }

            if (hasNearPeasent == false) {
                ammo -= 1;
            }
            if (target != null) {
                System.out.println(unitClass + " " + name + " shot at " + target.unitClass + " " + target.name + "." +
                        "Now HP " + target.name + " " + target.currentHp);
            }

            System.out.println(unitClass + " " + name + " не видет цель. Должен или идти или ждать");
        }
        state = "inactive";
    }

    protected void aiming() {
    }

    ;

    protected void fire() {
    }

    ;

    protected void changeWeapon() {
    }

    ;
}
