package Game.units;

import java.util.ArrayList;


public abstract class Shooter extends Unit {
    public int ammunition;

    public Shooter(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int ammunition, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, x, y);
        this.ammunition = ammunition;
    }

    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> team) {
        Unit tmp = nearest(enemy);

        if (isAlive) {
            for (Unit unit: team) {
                if (unit instanceof Peasant && unit.state == "Stand" && ammunition < 20 && this instanceof Shooter) {
                    ammunition += 1;
                    unit.state = "Busy";
                    return;
                }
            }

            if ((int) coordinates.getDistance(tmp.coordinates) <= attack) {
                if (ammunition > 0 && attack != 1) {
                    if (attack == 1) tmp.getDamage(1);
                    else tmp.getDamage(damage);
                    ammunition -= 1;
                    state = "Attack";
                    return;
                } else {
                    attack = 1;
                    state = "->Melee";
                }
            } else {
                move(tmp.coordinates, team);
                state = "Moving";
                return;
            }
        }
        return;
    }
//    public String getInfo(){
//        return super.getUnitInfo() + " Стрелы: " + ammunition;
//    }
}
