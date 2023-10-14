public class Dog extends Animal implements SoundProducable {
    public Dog(String name) {
        super(name);
    }

    public void draw() {
        System.out.println("\ud83d\udc15");
    }

    public void callSound() {
        System.out.println("Гав гав Гув гув Гив гив");
    }
}
