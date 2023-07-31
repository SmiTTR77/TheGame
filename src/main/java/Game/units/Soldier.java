package Game.units;

import java.util.ArrayList;

public abstract class Soldier extends Unit {

    protected int attackRange;
    protected int attacksAmount;
    public Soldier(String name, String type, int health, int maxHealth, int initiative, int moveDistance, int damage, int attackRange, int attacksAmount, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, moveDistance, damage, isAlive, x, y);
        this.attackRange = attackRange;
        this.attacksAmount = attacksAmount;
    }
    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> allys) {
        if (!isAlive) return;

        Unit tmp = nearest(enemy);


        if (coordinates.getDistance(tmp.coordinates) <= attackRange) {
            for (int i = 0; i < attacksAmount; i++) tmp.getDamage(damage);
            state = "Attack";
        } else {
            move(tmp.coordinates, allys);
            state = "Moving";
        }
    }
}
