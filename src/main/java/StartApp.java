import units.Unit;
import units.persons.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StartApp {
    public static void main(String[] args) {

        int teamCount = 10;

        System.out.println("Команда А: ");
        List<Unit> teamA = new ArrayList<>();
        teamA = addTeam(teamA, teamCount);
        showTeam(teamA);

        System.out.println("Команда Б: ");
        List<Unit> teamB = new ArrayList<>();
        teamB = addTeam(teamB, teamCount);
        showTeam(teamB);
    }

        public static List<Unit> addTeam (List <Unit> newTeam, int count){
            List team = newTeam;
            for (int i = 0; i < count; i++) {
                int value = new Random().nextInt(1,8);
                switch (value) {
                    case 1 -> team.add(new Crossbowman(Unit.getName()));
                    case 2 -> team.add(new Magician(Unit.getName()));
                    case 3 -> team.add(new Monk(Unit.getName()));
                    case 4 -> team.add(new Outlaw(Unit.getName()));
                    case 5 -> team.add(new Peasant(Unit.getName()));
                    case 6 -> team.add(new Sniper(Unit.getName()));
                    case 7 -> team.add(new Spearman(Unit.getName()));
                }
            }
            return team;
        }

        public static void showTeam(List<Unit> team){
            for (int i = 0; i < team.size(); i++) {
                System.out.println(team.get(i).getUnitInfo());
                System.out.println("----------------------------------------------------------------------------------");
            }
        }
}
