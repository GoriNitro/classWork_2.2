
import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 12);
        Triangle triangle = new Triangle("Треугольник", 2, 4, 5);
        Square square = new Square("Квадрат", 45);
        Dog dog = new Dog("Рекс");
        Cat cat = new Cat("Маруся");
        dog.callSound();
        Drawable[] drawables = new Drawable[]{circle, triangle, square, dog, cat};

        for(int i = 0; i < drawables.length; ++i) {
            if (drawables[i] instanceof Figure) {
                PrintStream var10000 = System.out;
                String var10001 = ((Figure)drawables[i]).getName();
                var10000.println(var10001 + " Периметр -> " + ((Figure)drawables[i]).calculatePerimeter());
                dog.callSound();
            }

            if (drawables[i] instanceof Animal) {
                System.out.println(((Animal)drawables[i]).getName());
            }

            drawables[i].draw();
        }

    }
}
