package units;

import java.util.Random;

public abstract class Unit {
    public String name;
    public String type;
    public int health;
    public int maxHealth;
    public int initiative;
    public int defence;
    public int attack;
    public int damage;
    public int energy;

    public Unit(String name, String type, int health, int maxHealth, int initiative, int defence, int attack, int damage, int energy) {
        this.name = name;
        this.type = type;
        this.maxHealth = this.health = health;
        this.initiative = initiative;
        this.defence = defence;
        this.attack = attack;
        this.damage = damage;
        this.energy = energy;
    }

    public String getUnitInfo(){
        return String.format("Имя: %s (%s) \nHp: { %d } \tИнициатива: { %d }  \tЗащита: { %d } \tАтака: { %d } \tЭнергия: { %d } ",
                this.name, this.type, this.health, this.initiative, this.defence, this.attack, this.energy);
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

}