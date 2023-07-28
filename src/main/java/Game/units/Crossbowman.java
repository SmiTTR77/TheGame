package Game.units;

public class Crossbowman extends Shooter {
    public Crossbowman(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int ammunition, int x, int y) {
        super(name, type, health, maxHealth, initiative, distance, attack, damage, isAlive, ammunition, x, y);
        this.type = "Арбалетчик";
    }

    public Crossbowman(String name, int x, int y){
        super(getName(),"Арбалетчик", 200, 200,1,5,45,0,true, 10, x, y);
    }
    public Crossbowman(int x, int y){
        super("Егорка","Арбалетчик", 200, 200,1,5,45,0,true, 10, x, y);
    }

    @Override
    public String getInfo() {

        return String.format("Имя: %s (%s) \tПозиция: (x = %d, y = %d) \tСтрелы: %d",
                this.name, this.type, this.coordinates.x, this.coordinates.y, this.ammunition);
    }

//    @Override
//    public void step(ArrayList<Unit> allys, ArrayList<Unit> enemy) {
//        Unit tmp = nearest(enemy);
//        System.out.println(currentEnemy.name + " " + coordinates.getDistance(currentEnemy.coordinates));
//    }

}
