package Zoo;

public class Bird extends ZooAnimals {

    private String name;

    public Bird() {
        name = "Bird";

    }
    public Bird(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String itBreathes() { return "Lungs";}

    @Override
    public String itMoves() { return "Flies, Goes";}

    @Override
    public String toString()
    {
        return "It ia a " + name + ". " + super.toString();
    }
}
