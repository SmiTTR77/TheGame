package units;

import java.util.List;

public interface GameInterface {
    void step(List<Unit> team);
    String getUnitInfo();
}
