package Game.units;

public class Sniper extends Shooter {
    public Sniper(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int ammunition, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, ammunition, x, y);
    }
    public Sniper(String name, int x, int y){
        super(name,"Снайпер", 150, 150,1,5,50,0,true, 10, x, y);
    }
    public Sniper(int x, int y){
        super("Виталя","Снайпер", 150,150, 1,5,50,0,true, 10,x, y);
    }
    @Override
    public String getInfo() {

        return String.format("Имя: %s (%s) \tПозиция: (x = %d, y = %d) \tПули: %d",
                this.name, this.type, this.coordinates.x, this.coordinates.y, this.ammunition);
    }

//    @Override
//    public void step(ArrayList<Unit> allys, ArrayList<Unit> enemy) {
//        Unit currentEnemy = nearest(enemy);
//        System.out.println(currentEnemy.name + " " + coordinates.getDistance(currentEnemy.coordinates));
//    }
}
