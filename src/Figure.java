public abstract class Figure implements Drawable {
    private String name;

    public Figure(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract int calculatePerimeter();
}
