package Game.units;

public class Magician extends Healer {
    public Magician(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, int mana, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, mana, isAlive, x, y);
    }
    public Magician(String name, int x, int y){
        super(name,"Маг", 200, 200,1,10,5,0,3,true, x, y);
    }
    public Magician(int x, int y){
        super("Гендальф","Маг", 200, 200,1,10,5,0, 3,true, x, y);
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
