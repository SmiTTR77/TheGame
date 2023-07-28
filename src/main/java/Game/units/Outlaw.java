package Game.units;

public class Outlaw extends Soldier {
    public Outlaw(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, x, y);
    }
    public Outlaw(String name, int x, int y){
        super(name,"Разбойник", 200, 200,2,1,35,0,true, x, y);
    }
    public Outlaw(int x, int y){
        super("Соловей","Разбойник", 200, 200,2,1,35,0,true, x, y);
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
