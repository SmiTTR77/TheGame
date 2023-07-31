package Game.units;

import Game.Names;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements GameInterface{
    public String name;
    public String type;
    public int health;
    public int maxHealth;
    public int initiative;
    public int moveDistance;
    public int damage;

    public boolean isAlive;

    public String state = "Stand";

    public Coordinates coordinates;

    public Unit(String name, String type, int health, int maxHealth, int initiative, int moveDistance, int damage, boolean isAlive, int x, int y) {
        this.name = name;
        this.type = type;
        this.health = health; // +
        this.maxHealth = maxHealth; // +
        this.initiative = initiative; //+
        this.moveDistance = moveDistance; //+
        this.damage = damage; // +
        this.isAlive = isAlive;
        coordinates = new Coordinates(x, y);
    }

    public String getInfo(){
        return String.format("Имя: %s (%s) \nHp: { %d } \tИнициатива: { %d }  \tДистанция: { %d } \tЖивой?: { %s } \tПозиция: (%d, %d) ",
                this.name, this.type, this.health, this.initiative, this.moveDistance, this.isAlive, coordinates.x, coordinates.y);
    }


    public static String getName (){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return name;
    }
//    public String getType () { return type; }
    public int getHealth(){return health;}


    public void getDamage (int damage){
        if (this.health - damage > 0){
            this.health -= damage;
        }
        else {
            this.health = 0;
            isAlive = false;
            state = "Dead";
        }
    }

    public Unit nearest(ArrayList <Unit> team) {
        double minDistance = Double.MAX_VALUE;
        Unit closestEnemy = null;

        for (Unit unit : team) {
            if (coordinates.getDistance(unit.coordinates) < minDistance && unit.isAlive) {
                closestEnemy = unit;
                minDistance = coordinates.getDistance(unit.coordinates);
            }
        }

        return closestEnemy;
    }


    @Override
    public String toString() {
        return this.getInfo().split(" ")[0];
    }

    public void move(Coordinates targetPosition, ArrayList<Unit> allys) {
        if (!coordinates.containsByPos(coordinates.newPosition(targetPosition, allys), allys)) {
            for (int i = 0; i < moveDistance; i++) {
                coordinates = coordinates.newPosition(targetPosition, allys);
            }
        }
    }
}