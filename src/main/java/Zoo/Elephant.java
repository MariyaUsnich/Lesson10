package Zoo;

public class Elephant extends Animal {
        private String typeName;
        public Elephant() {
            typeName= "Elephant";
        }
        public Elephant(String _typeName) {
            typeName = _typeName;
        }
        @Override
        public String toString() {return typeName + ": " + super.toString() +"\n"+ isEating() + ". Is dangerous: " +isDangerous();}

        @Override
        public String itMoves() {
                return "Goes";
        }
        public boolean isDangerous() {return true;
        }
        public String isEating() {return "Herbivores";}
}


