package Game.units;

import java.util.ArrayList;
import java.util.Random;

public class Magician extends Healer {
    public Magician(String name, int x, int y) {
        super(name,
            "Маг",
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
    public void step(ArrayList<Unit> enemy, ArrayList <Unit> allys) {
        if (!isAlive) return;

        super.step(enemy, allys);
        ArrayList<Unit> deadTeammates = new ArrayList<>();
        Unit tmpAlly = allys.get(0);

        if (!isAlive) return;

        for (Unit unit: allys) {
            if (!unit.isAlive) {
                deadTeammates.add(unit);
            }
        }

        if (deadTeammates.size() > allys.size() / 2 - 1 && mana >= 5) {
            int n = new Random().nextInt(deadTeammates.size() - 1);

            deadTeammates.get(n).isAlive = true;
            deadTeammates.get(n).health =  deadTeammates.get(n).maxHealth / 2;
            state = "Revive";
            mana = 0;
            return;
        }
    }
}



