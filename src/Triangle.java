public class Triangle extends Figure {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(String name, int sideA, int sideB, int sideC) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public int calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    public void draw() {
        System.out.println("\ud83d\udd3a");
    }
}
