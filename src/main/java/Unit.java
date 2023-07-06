public abstract class Unit {
    public String name;
    public String type;
    public int health;
    public int initiative;
    public int defence;
    public int attack;
    public int energy;

    public Unit(String name, String type, int health, int initiative, int defence, int attack, int energy) {
        this.name = name;
        this.type = type;
        this.health = health;
        this.initiative = initiative;
        this.defence = defence;
        this.attack = attack;
        this.energy = energy;
    }


    public String getUnitInfo(){
        return String.format("Имя: %s (%s) \nHp: { %d } \tИнициатива: { %d }  \tЗащита: { %d } \tАтака: { %d } \tЭнергия: { %d } ",
                this.name, this.type, this.health, this.initiative, this.defence, this.attack, this.energy);
    }


    public String getName (){
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


    public void Move(){
        System.out.println("метод Ход");
    }
    public void Attack() {
        System.out.println("метод Атака");
    }
    public void Defence() {
        System.out.println("метод Защита");
    }

}