package Game;
import Game.View;
import Game.units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class StartApp {
    public static ArrayList<Unit> team1 = new ArrayList<>();
    public static ArrayList<Unit> team2 = new ArrayList<>();
    public static ArrayList<Unit> allTeam = new ArrayList<>();

    public static void main(String[] args) {

        int teamSize = 10;

        System.out.println("Команда А: ");
        team1 = addTeamA(team1, teamSize);
        showTeam(team1);

        System.out.println("Команда Б: ");
        team2 = addTeamB(team2, teamSize);
        showTeam(team2);

        allTeam.addAll(team1);
        allTeam.addAll(team2);
        allTeam.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                return Integer.compare(o2.initiative, o1.initiative);
            }
        });

        Scanner in = new Scanner(System.in);
        while (true){
            View.view();
            in.nextLine();
            for (Unit unit: allTeam){
                if (team2.contains(unit)){
                    unit.step(team1, team2);
                }
                else unit.step(team2, team1);
            }
            if(isTeamDie(team1)){
                System.out.println("Team 2 (Blue) win!");
                break;
            }
            if(isTeamDie(team2)){
                System.out.println("Team 1 (Green) win!");
                break;
            }
        }

    }

    public static ArrayList<Unit> addTeamA (ArrayList <Unit> newTeam, int size){
        ArrayList team = newTeam;
        for (int i = 0; i < size; i++) {
            int value = new Random().nextInt(1,5);
            switch (value) {
                case 1 -> team.add(new Spearman(Unit.getName(),0,i+1));
                case 2 -> team.add(new Crossbowman(Unit.getName(),0, i+1));
                case 3 -> team.add(new Magician(Unit.getName(),0, i+1));
                case 4 -> team.add(new Peasant(Unit.getName(),0,i+1));
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

    public static void showTeam(ArrayList<Unit> team){
            for (int i = 0; i < team.size(); i++) {
                System.out.println(team.get(i).getInfo());
                System.out.println("----------------------------------------------------------------------------------");
            }
        }

    public static boolean isTeamDie(ArrayList<Unit> team) {
        for (Unit unit : team) {
            if (!unit.state.equals("Dead")) return false;
        }
        return true;
    }
}
