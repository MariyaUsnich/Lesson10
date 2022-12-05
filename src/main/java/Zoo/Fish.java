package Zoo;

public class Fish extends ZooAnimals {

    private String name;

    public Fish() {
        name = "Fish";
    }
    public Fish(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }
    @Override
    public String itBreathes() { return "Gills";
    }

    @Override
    public String itMoves() { return "Swims"; }

    @Override
    public String toString()
    {
        return "It ia a " + name + ". " + super.toString();
    }
}
