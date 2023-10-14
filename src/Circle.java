public class Circle extends Figure {
    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;
    }

    public int calculatePerimeter() {
        return (int)(6.283185307179586 * (double)this.radius);
    }

    public void draw() {
        System.out.println("\ud83d\udd34");
    }
}
