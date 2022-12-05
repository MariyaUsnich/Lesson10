package Zoo;

public class Peacock extends Bird{
    private String typeName;
    public Peacock() {
        typeName= "Peacock";
    }
    public Peacock(String _typeName) {
        typeName = _typeName;
    }
    @Override
    public String toString() {return typeName + ": " + super.toString() + ". Is beautiful: " +isBeautiful();}

    public boolean isBeautiful() {return true;
    }
}
