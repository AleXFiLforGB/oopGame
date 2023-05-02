package HW;

import HW.Units.Unit;

import java.util.ArrayList;

public class Coordinate {
    int x,y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public float findNearEnemy (Coordinate coordinateEnemy) {
        float dx = coordinateEnemy.x - this.x ;
        float dy = coordinateEnemy.y - this.y;
        return (float) Math.sqrt(dx*dx + dy*dy);}





}
