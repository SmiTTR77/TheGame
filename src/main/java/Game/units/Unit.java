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
    public int distance;
    public int attack;
    public int damage;
    public int energy;

    public boolean isAlive;

    public String state = "Stand";

    public Coordinates coordinates;

    public Unit(String name, String type, int health, int maxHealth, int initiative, int distance, int attack, int damage, boolean isAlive, int x, int y) {
        this.name = name;
        this.type = type;
        this.maxHealth = this.health = health;
        this.initiative = initiative;
        this.distance = distance;
        this.attack = attack;
        this.damage = damage;
        this.isAlive = isAlive;
        coordinates = new Coordinates(x, y);
    }

    public String getInfo(){
        return String.format("Имя: %s (%s) \nHp: { %d } \tИнициатива: { %d }  \tДистанция: { %d } \tАтака: { %d } \tЖивой?: { %s } \tПозиция: (%d, %d) ",
                this.name, this.type, this.health, this.initiative, this.distance, this.attack, this.isAlive, coordinates.x, coordinates.y);
    }


    public static String getName (){
        String name = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return name;
    }
    public String getType () { return type; }
    public int getHealth(){return health;}
    public int getInitiative(){
        return initiative;
    }
    public int getDistance(){
        return distance;
    }
    public int getAttack(){
        return attack;
    }

    public void doAttack(Unit target){
        this.damage = this.attack;
    }
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

    public void getCure(int cure){
        if(this.health != 0 && this.health + cure < this.maxHealth){
            this.health += cure;
        }
        else{
            if (this.health == 0){
                this.health = 0;
            }
            else {
                this.health = this.maxHealth;
            }
        }
    }

    public Unit nearest(ArrayList <Unit> team){
        double nearestDistance = Double.MAX_VALUE;
        Unit nearestEnemy = null;
        for (int i = 0; i < team.size(); i++) {
            if(coordinates.getDistance(team.get(i).coordinates) < nearestDistance){
                nearestEnemy = team.get(i);
                nearestDistance = coordinates.getDistance(team.get(i).coordinates);
            }
        }
        return nearestEnemy;
    }
    public ArrayList<Integer> getCoords() {
        return coordinates.xy;
    }

    @Override
    public String toString() {
        return this.getInfo().split(" ")[0];
    }

    public void move(Coordinates targetPosition, ArrayList<Unit> team) {
        if (!coordinates.containsByPos(coordinates.newPosition(targetPosition, team), team)) {
            for (int i = 0; i < distance; i++) {
                coordinates = coordinates.newPosition(targetPosition, team);
            }
        }
    }
}