package Game.units;

import java.util.ArrayList;

public abstract class Shooter extends Unit {
    protected int ammunition;
    protected int attackRange;

    public Shooter(String name, String type, int health, int maxHealth, int initiative, int moveDistance, int damage, int attackRange,  int ammunition, boolean isAlive,  int x, int y) {
        super(name, type, health, maxHealth, initiative, moveDistance, damage, isAlive, x, y);
        this.ammunition = ammunition;
        this.attackRange = attackRange;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> allys) {
        Unit tmp = nearest(enemy);

        if (isAlive) {
            for (Unit unit: allys) {
                if (unit instanceof Peasant && unit.state == "Stand" && ammunition < 20 && this instanceof Sniper) {
                    ammunition += 1;
                    unit.state = "Busy";
                    return;
                }
            }

            if ((int)coordinates.getDistance(tmp.coordinates) <= attackRange) {
                if (ammunition > 0 && attackRange != 1) {
                    if (attackRange == 1) tmp.getDamage(1);
                    else tmp.getDamage(damage);
                    ammunition -= 1;
                    state = "Attack";
                    return;
                } else {
                    attackRange = 1;
                    state = "->Soldier";
                }
            } else {
                move(tmp.coordinates, allys);
                state = "Moving";
                return;
            }
        }
        return;
    }
}
