import units.Unit;
import units.persons.*;
import units.GameInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StartApp {
    public static void main(String[] args) {

        int teamCount = 5;

        System.out.println("Команда А: ");
        List<Unit> teamA = new ArrayList<>();
        teamA = addTeamA(teamA, teamCount);
        showTeam(teamA);

        System.out.println("Команда Б: ");
        List<Unit> teamB = new ArrayList<>();
        teamB = addTeamB(teamB, teamCount);
        showTeam(teamB);

        List<Unit> finalTeamB = teamB;
        teamA.forEach(n -> n.step(finalTeamB));
    }

    public static List<Unit> addTeamA (List <Unit> newTeam, int count){
        List team = newTeam;
        for (int i = 0; i < count; i++) {
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
    public static List<Unit> addTeamB (List <Unit> newTeam, int count){
        List team = newTeam;
        for (int i = 0; i < count; i++) {
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
//    public static List<Unit> addTeam (List <Unit> newTeam, int count){
//        List team = newTeam;
//        for (int i = 0; i < count; i++) {
//            int value = new Random().nextInt(1,8);
//            switch (value) {
//                case 1 -> team.add(new Crossbowman(Unit.getName(),0, 1));
//                case 2 -> team.add(new Magician(Unit.getName(),0,2));
//                case 3 -> team.add(new Monk(Unit.getName(),0,3));
//                case 4 -> team.add(new Outlaw(Unit.getName(),0,4));
//                case 5 -> team.add(new Peasant(Unit.getName(),0,5));
//                case 6 -> team.add(new Sniper(Unit.getName(),0,6));
//                case 7 -> team.add(new Spearman(Unit.getName(),0, 7));
//            }
//        }
//        return team;
//    }

    public static void showTeam(List<Unit> team){
            for (int i = 0; i < team.size(); i++) {
                System.out.println(team.get(i).getUnitInfo());
                System.out.println("----------------------------------------------------------------------------------");
            }
        }

}
