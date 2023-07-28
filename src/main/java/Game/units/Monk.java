package Game.units;

public class Monk extends Healer {
    public Monk(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, int mana, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, mana, isAlive, x, y);
    }
    public Monk(String name, int x, int y){
        super(name, "Монах", 100, 100,1, 10,20,0,3,true, x, y);
    }
    public Monk(int x, int y){
        super("Моня", "Монах", 100, 100,1, 10,20,0,3,true, x, y);
    }
    @Override
    public String getInfo() {

        return String.format("Имя: %s (%s) \tПозиция: (x = %d, y = %d)",
                this.name, this.type, this.coordinates.x, this.coordinates.y);
    }

//    @Override
//    public void step(ArrayList<Unit> allys, ArrayList<Unit> enemy) {
//        Unit currentEnemy = nearest(enemy);
//        System.out.println(currentEnemy.name + " " + coordinates.getDistance(currentEnemy.coordinates));
//    }
}
