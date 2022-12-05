package Zoo;

import Zoo.ZooAnimals;

public class Animal extends ZooAnimals {
    private final String name;

    public Animal() {
        name = "Animal";
    }
    public Animal(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String itBreathes() {
        return "Lungs";
    }

    @Override
    public String itMoves() {
        return "Goes, Runs";
    }

    @Override
    public String toString() {
        return "It is an " + name + ". " + super.toString();
    }

}


