public class Point {

    protected int xCord, yCord;

    public Point(){}

    public Point(int x , int y){
        this.xCord = x;
        this.yCord = y;
    }

    public Point(int xy){
        this.xCord = xy;
        this.yCord = xy;
    }

    @Override
    public String toString() {
        return "Point{" +
                "xCord=" + xCord +
                ", yCord=" + yCord +
                '}';
    }
}
