package Zoo;

public class Straus extends Bird{
    private String typeName;
    public Straus() {
        typeName= "Straus";
    }
    public Straus(String _typeName) {
        super();
    }


    public String getName() {
        return typeName;
    }

    @Override
    public String toString()
    {
        return "It ia a " + typeName + ". " + super.toString() +"\n"+ itAlsoDoes();
    }
    @Override
    public String itMoves() { return "Runs, Goes, but does not Fly";}

    public String itAlsoDoes() {return "It also hides its head in the sand if frightned.";
    }
}


