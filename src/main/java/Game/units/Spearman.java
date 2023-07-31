package Game.units;

public class Spearman extends Soldier {
    public Spearman(String name, int x, int y){
        super(name,
                "Копейщик",
                50,
                50,
                3,
                1,
                50,
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

