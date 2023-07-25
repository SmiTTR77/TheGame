package units;

public class Coordinates {
    public int x;
    public int y;

    public Coordinates(int x, int y){
        this.x = x;
        this.y = y;
    }
    public double getDistance(Coordinates coordinates){
        int dx = coordinates.x - x;
        int dy = coordinates.y - y;
        return Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
    };


}
