package Game.units;

import java.util.ArrayList;

public abstract class Healer extends Unit {
    int mana;
    public Healer(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, int mana, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, x, y);
        this.mana = mana;
    }

    @Override
//    public void step(ArrayList<Unit> allys, ArrayList<Unit> enemy) {
//        if (isAlive) {
//            state = "Stand";
//            Unit tmp = nearest(allys);
//            Unit tmpAlly = allys.get(0);
//            double minTeamHealth = 1;
//
//            for(Unit unit: allys) {
//                if (unit.health / unit.maxHealth < minTeamHealth) {
//                    minTeamHealth = unit.health / unit.maxHealth;
//                    tmpAlly = unit;
//                }
//            }
//            if (minTeamHealth < 1){
//                tmpAlly.getDamage(-damage);
//                state = "Healing";
//                return;
//            }
//        }
//    }
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> team) {
        Unit tmp = nearest(enemy);
        if (!isAlive) return;
        if ((int) coordinates.getDistance(tmp.coordinates) <= attack) {
            if (mana > 0) {
                tmp.getDamage(damage);
                mana -= 1;
                state = "Attack";
            } else {
                mana += 1;
                state = "Busy";
            }
        } else {
            move(tmp.coordinates, team);
            state = "Moving";
        }
    }
}

