package Game.units;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Unit> allys, ArrayList<Unit> enemy);
    String getInfo();
}
