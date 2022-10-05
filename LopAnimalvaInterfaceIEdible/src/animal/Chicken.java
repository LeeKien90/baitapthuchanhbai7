package animal;

import edible.IEdible;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Chicken extends Animal implements IEdible {

    @Override
    public String makeSound() {
        return "Chicker: o ó o o";
    }


    @Override
    public String howToEat() {
        return "Chicken eat rice";
    }
}
