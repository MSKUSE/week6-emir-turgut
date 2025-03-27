public class Triangle extends Shape{
    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    private int sideA;
    private int sideB;

    public Triangle(Point location,int sideA, int sideB) {
        super(location);
        setSideA(sideA);
        setSideB(sideB);
    }

    @Override
    public double perimeter(){
        return this.sideA + this.sideB + Math.sqrt((this.sideA*this.sideA) + (this.sideB*this.sideB));
    }

    @Override
    public double area() {
        return (double) (this.sideA * this.sideB) / 2;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }
}

