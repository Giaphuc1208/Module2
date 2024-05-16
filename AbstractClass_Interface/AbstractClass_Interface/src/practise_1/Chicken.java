package practise_1;

public class Chicken extends Animal implements Edible {

    @Override
    public String makeSound() {
        return "Chiken: cluck- cluck!";
    }

    @Override
    public String howToEat() {
        return "Could be fried";
    }
}
