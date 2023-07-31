package Game;
import Game.View;
import Game.units.*;

import java.util.*;

import static java.util.Collections.*;

public class StartApp {
    public static ArrayList<Unit> team1 = new ArrayList<>();
    public static ArrayList<Unit> team2 = new ArrayList<>();
    public static ArrayList<Unit> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        int teamSize = 10;
        boolean sortedInitiative = false;


//        System.out.println("Команда А: ");
        team1 = addTeamA(team1, teamSize);
//        showTeam(team1);

//        System.out.println("Команда Б: ");
        team2 = addTeamB(team2, teamSize);
//        showTeam(team2);

        allTeam.addAll(team1);
        allTeam.addAll(team2);
        allTeam.sort(new Comparator<Unit>(){
            @Override
            public int compare(Unit o1, Unit o2) {
                return Integer.compare(o2.initiative, o1.initiative);
            }
        });

        while(!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < team1.size() - 1; i++) {
                if (team1.get(i).initiative < team1.get(i + 1).initiative) {
                    Collections.swap(team1, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }

        sortedInitiative = false;

        while(!sortedInitiative) {
            sortedInitiative = true;
            for (int i = 0; i < team2.size() - 1; i++) {
                if (team2.get(i).initiative < team2.get(i + 1).initiative) {
                    Collections.swap(team2, i, i + 1);
                    sortedInitiative = false;
                }
            }
        }

        View.view();

        Scanner in = new Scanner(System.in);
        while (true) {
            in.nextLine();
            String massege = "";

            int init1 = 0;
            int init2 = 0;
            Unit tmpTeam1 = team1.get(init1);
            Unit tmpTeam2 = team2.get(init2);

            for (int i = 0; i < teamSize * 2; i++) {
                if (isTeamDie(team1)) {
                    massege = "Team 2 win!";
                    break;
                }
                if (isTeamDie(team2)) {
                    massege = "Team 1 win!";
                    break;
                }

                if ((tmpTeam1.initiative >= tmpTeam2.initiative && init1 < 10) || (tmpTeam1.initiative < tmpTeam2.initiative && init2 == 10)) {
                    tmpTeam1.step(team2, team1);
                    init1++;
                    if (init1 < 10) tmpTeam1 = team1.get(init1);
                } else {
                    tmpTeam2.step(team1, team2);
                    init2++;
                    if (init2 < 10) tmpTeam2 = team2.get(init2);
                }
            }

            View.view();

            if (massege.equals("Team 2 win!") || massege.equals("Team 1 win!")) {
                System.out.println(massege);
                break;
            }
        }
    }

    public static ArrayList<Unit> addTeamA (ArrayList <Unit> newTeam, int size){
        ArrayList team = newTeam;
        for (int i = 0; i < size; i++) {
            int value = new Random().nextInt(1,5);
            switch (value) {
                case 1 -> team.add(new Spearman(Unit.getName(),1,i+1));
                case 2 -> team.add(new Crossbowman(Unit.getName(),1, i+1));
                case 3 -> team.add(new Magician(Unit.getName(),1, i+1));
                case 4 -> team.add(new Peasant(Unit.getName(),1,i+1));
            }
        }
        return team;
    }
    public static ArrayList<Unit> addTeamB (ArrayList <Unit> newTeam, int size){
        ArrayList team = newTeam;
        for (int i = 0; i < size; i++) {
            int value = new Random().nextInt(1,5);
            switch (value) {
                case 1 -> team.add(new Outlaw(Unit.getName(),10,i+1));
                case 2 -> team.add(new Sniper(Unit.getName(),10,i+1));
                case 3 -> team.add(new Monk(Unit.getName(),10,i+1));
                case 4 -> team.add(new Peasant(Unit.getName(),10,i+1));
            }
        }
        return team;
    }

//    public static void showTeam(ArrayList<Unit> team){
//            for (int i = 0; i < team.size(); i++) {
//                System.out.println(team.get(i).getInfo());
//                System.out.println("----------------------------------------------------------------------------------");
//            }
//        }

    public static boolean isTeamDie(ArrayList<Unit> team) {
        for (Unit unit : team) {
            if (!unit.state.equals("Dead")) return false;
        }
        return true;
    }
}