package Game.units;

public class Spearman extends Soldier {
    public Spearman(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, x, y);
    }
    public Spearman(String name, int x, int y){
        super(name,"Копейщик", 200, 200,1,1,50,0, true,x, y);
    }
    public Spearman(int x, int y){
        super("Вася","Копейщик", 200, 200,1,1,50,0, true, x, y);
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
