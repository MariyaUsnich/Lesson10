package Zoo;

public class Tiger extends Animal {
  private String typeName;
    public Tiger() {
        typeName= "Tiger";
    }
    public Tiger(String _typeName) {
        typeName = _typeName;
    }
    @Override
    public String toString() {return typeName + ": " + super.toString() +"\n"+ isEating() + ". Is dangerous: " +isDangerous();}

    public boolean isDangerous() {return true;
    }
    public String isEating() {return "Predator";}
}

