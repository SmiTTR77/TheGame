package Game.units;

import java.util.ArrayList;

public class Monk extends Healer {
    public Monk(String name, int x, int y) {
        super(name,
            "Монах",
            40,
            40,
            1,
            1,
            20,
            5,
            3,
            1,
                true,
            x, y);
    }
    @Override
    public String getInfo() {
        return type + " " + name + " " + "[" + coordinates.x + ", " + coordinates.y + "] HP: " + health + "/" + maxHealth + " " + "Мана:" + mana + " " + state;
    }
    @Override
    public void step(ArrayList<Unit> enemy, ArrayList<Unit> allys) {
        if (!isAlive) return;

        super.step(enemy, allys);
        Unit tmpAlly = allys.get(0);
        double minAllyHealth = 1;

        if (!isAlive) return;

        for (Unit unit: allys) {
            if (unit.health / unit.maxHealth < minAllyHealth && unit.isAlive) {
                minAllyHealth = unit.health / unit.maxHealth;
                tmpAlly = unit;
            }
        }

        if (minAllyHealth < 1 && mana > 0) {
            tmpAlly.getDamage(-damage);
            mana -= 1;
            state = "Healing";

            return;
        }
    }
}


