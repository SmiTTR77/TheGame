package Game.units;

public class Outlaw extends Soldier {

    public Outlaw(String name, int x, int y) {
        super(name,
                "Разбойник",
                50,
                50,
                3,
                1,
                35,
                1,
                2,
                true,
                x, y);
    }
    @Override
    public String getInfo() {
        return type + " " + name + " " + "[" + coordinates.x + ", " + coordinates.y + "] HP: " + health + "/" + maxHealth + " " + state;
    }
}


