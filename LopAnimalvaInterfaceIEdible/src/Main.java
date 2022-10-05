import animal.Animal;
import animal.Chicken;
import animal.Tiger;
import edible.IEdible;

public class Main {
    public static void main(String[] args) {
        Animal[] animal = new Animal[5];
        animal[0] = new Tiger();
        animal[1] = new Chicken();
        for (Animal animals : animal) {
            System.out.println(animals.makeSound());
            if (animals instanceof Chicken) {
                IEdible iEdible = (Chicken) animals;
                System.out.println(iEdible.howToEat());
            }
        }
    }
}