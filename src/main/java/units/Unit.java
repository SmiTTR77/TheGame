package units;

import java.util.List;
import java.util.Random;

public abstract class Unit implements GameInterface{
    public String name;
    public String type;
    public int health;
    public int maxHealth;
    public int initiative;
    public int defence;
    public int attack;
    public int damage;
    public int energy;

    public Coordinates coordinates;

    public Unit(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy, int x, int y) {
        this.name = name;
        this.type = type;
        this.maxHealth = this.health = health;
        this.initiative = initiative;
        this.defence = defence;
        this.attack = attack;
        this.damage = damage;
        this.energy = energy;
        coordinates = new Coordinates(x, y);
    }

    public String getUnitInfo(){
        return String.format("Имя: %s (%s) \nHp: { %d } \tИнициатива: { %d }  \tЗащита: { %d } \tАтака: { %d } \tЭнергия: { %d } \tПозиция: (%d, %d) ",
                this.name, this.type, this.health, this.initiative, this.defence, this.attack, this.energy, coordinates.x, coordinates.y);
    }


    public static String getName (){
        String name = String.valueOf(units.Names.values()[new Random().nextInt(units.Names.values().length)]);
        return name;
    }
    public String getType () { return type; }
    public int getHealth(){
        return health;
    }
    public int getInitiative(){
        return initiative;
    }
    public int getDefence(){
        return defence;
    }
    public int getAttack(){
        return attack;
    }
    public int getEnergy(){
        return energy;
    }



    public Unit nearest(List<Unit> team){
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
}