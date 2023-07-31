package Game.units;

import java.util.ArrayList;

public abstract class Healer extends Unit {
    protected int mana;
    protected int attackRange;

    public Healer(String name, String type, int health, int maxHealth, int initiative, int moveDistance, int damage, int mana, int attackRange, int actionPriority, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, moveDistance, damage, isAlive, x, y);
        this.mana = mana;
        this.attackRange = attackRange;
    }

    public void step(ArrayList<Unit> enemy, ArrayList<Unit> allys) {
        Unit tmp = nearest(enemy);

        if ((int)coordinates.getDistance(tmp.coordinates) <= attackRange) {
            if (mana > 0) {
                tmp.getDamage(damage);
                mana -= 1;
                state = "Attack";
            } else {
                mana += 1;
                state = "Busy";
            }
        } else {
            move(tmp.coordinates, allys);
            state = "Moving";
        }

    }
}

