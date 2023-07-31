package Game.units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, int x, int y){
        super(name,
                "Арбалетчик",
                50,
                50,
                2,
                1,
                45,
                7,
                10,
                true,
                x, y);
    }

    @Override
    public String getInfo() {
        return type + " " + name + " " + "[" + coordinates.x + ", " + coordinates.y + "] снаряды: " + ammunition + " HP: " + health + "/" + maxHealth + " " + state;
    }
}


