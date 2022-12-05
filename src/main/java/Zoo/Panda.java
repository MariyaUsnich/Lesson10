package Zoo;
public class Panda extends Animal {
    private String typeName;
    public Panda() {
        typeName= "Panda";
    }
    public Panda(String _typeName) {
        typeName = _typeName;
    }
    @Override
    public String toString() {return typeName + ": " + super.toString() +"\n"+ isEating() + ". Is dangerous: " +isDangerous();}

    public boolean isDangerous() {return false;
    }
    public String isEating() {return "Herbivores";}
}
