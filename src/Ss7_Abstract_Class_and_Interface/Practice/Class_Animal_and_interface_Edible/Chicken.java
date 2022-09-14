package Ss7_Abstract_Class_and_Interface.Practice.Class_Animal_and_interface_Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "có thể chiên ";
    }
}
