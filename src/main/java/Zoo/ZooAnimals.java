package Zoo;

public abstract class ZooAnimals {

    abstract String itBreathes();

    abstract String itMoves();

    public String toString() {
        return "It breathes: " + itBreathes() + ". It moves: " + itMoves() + ".";

    }

}
