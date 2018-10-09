package InterfacePractice_Animal;

public class Chicken extends Animal implements Edible {
    public Chicken() {
    }

    @Override
    public String howtoEat() {
        return "Eat: Chiên rán, luộc, hấp, hầm";
    }

    @Override
    String makeSound() {
        return "Chicken: Quác, quác";
    }
}
