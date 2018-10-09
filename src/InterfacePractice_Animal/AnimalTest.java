package InterfacePractice_Animal;

public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for (Animal animal : animals){
            System.out.println(animal.makeSound());
            if (animal instanceof Chicken){
                System.out.println(((Chicken) animal).howtoEat());
            }
        }
        System.out.println();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howtoEat());
        }
    }
}
