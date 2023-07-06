public class StartApp {
    public static void main(String[] args) {
        Magician magician1 = new Magician();
        System.out.println(magician1.getUnitInfo());
        System.out.println("----------------------------------------------------------------------------------");

        Monk monk1 = new Monk("Беня");
        System.out.println(monk1.getUnitInfo());
        System.out.println("----------------------------------------------------------------------------------");

        Outlaw outlaw1 = new Outlaw();
        System.out.println(outlaw1.getUnitInfo());
        System.out.println("----------------------------------------------------------------------------------");

        Spearman spearman1 = new Spearman();
        System.out.println(spearman1.getUnitInfo());
        System.out.println("----------------------------------------------------------------------------------");

        Sniper sniper1 = new Sniper();
        System.out.println(sniper1.getUnitInfo());
        System.out.println("----------------------------------------------------------------------------------");

        Crossbowman crossbowman1 = new Crossbowman("Роббин-Бобин");
        System.out.println(crossbowman1.getUnitInfo());
        System.out.println("----------------------------------------------------------------------------------");

        Peasant peasant1 = new Peasant();
        System.out.println(peasant1.getUnitInfo());
        System.out.println("----------------------------------------------------------------------------------");
    }
}
