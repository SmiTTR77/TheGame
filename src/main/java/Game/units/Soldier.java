package Game.units;


import java.util.ArrayList;

public abstract class Soldier extends Unit {
    public Soldier(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, x, y);
    }
    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> allys) {
        if (!isAlive) return;

        Unit tmp = nearest(enemy);

        if (coordinates.getDistance(tmp.coordinates) <= distance) {
            for (int i = 0; i < attack; i++) {
                tmp.getDamage(damage);
            }
            state = "Attack";
        } else {
            move(tmp.coordinates, allys);
            state = "Moving";
        }
    }
}
