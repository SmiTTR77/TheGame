package Game.units;

import java.util.ArrayList;

public class Peasant extends Healer{
    public int ammunition;


    public Peasant(String name, int x, int y){
        super(name,
                "Подаван",
                30,
                30,
                1,
                1,
                1,
                0,
                1,
                0,
                true,
                x, y);
        this.ammunition = 10;
    }


    @Override
    public String getInfo() {
        return type + " " + name + " " + "[" + coordinates.x + ", " + coordinates.y + "] снаряды: " + ammunition + " HP: " + health + "/" + maxHealth + " " + state;
    }


    @Override
    public void step(ArrayList<Unit> allys, ArrayList<Unit> enemy) {
        if (isAlive) {
            if (state == "Busy") {
                state = "Stand";
            }
        }
    }
}
