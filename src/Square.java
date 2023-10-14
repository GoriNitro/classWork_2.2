public class Square extends Figure {
    private int side;

    public Square(String name, int side) {
        super(name);
        this.side = side;
    }

    public int calculatePerimeter() {
        return this.side * 4;
    }

    public void draw() {
        System.out.println("⬛");
    }
}
