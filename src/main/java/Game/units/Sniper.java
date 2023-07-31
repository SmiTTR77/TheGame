package Game.units;

public class Sniper extends Shooter {
    public Sniper(String name, int x, int y){
        super(name,
                "Снайпер",
                50,
                50,
                2,
                1,
                50,
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

