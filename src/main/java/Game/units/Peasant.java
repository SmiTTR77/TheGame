package Game.units;

import java.util.ArrayList;

public class Peasant extends Unit{
    public int ammunition;

    public Peasant(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int ammunition, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, x, y);
        this.ammunition = ammunition;
    }
    public Peasant(String name, int x, int y){
        super(name,"Крестьянин", 150, 150,1,10,5,0,true, x, y); this.ammunition = 10;
    }
    public Peasant(int x, int y){
        super("Иванушка","Крестьянин", 150, 150,1,10,5,0,true,  x, y); this.ammunition =10;
    }

    @Override
    public String getInfo() {

        return String.format("Имя: %s (%s) \tПозиция: (x = %d, y = %d)",
                this.name, this.type, this.coordinates.x, this.coordinates.y);
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
