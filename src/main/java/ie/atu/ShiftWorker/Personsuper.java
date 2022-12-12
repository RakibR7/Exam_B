package ie.atu.ShiftWorker;

public class Personsuper extends Person {
    private String PersonsuperName;
    private boolean Shiftlist ;

    public Personsuper (){
    }

    public Personsuper(String name, String gender, boolean shift, String age){
        super(name, gender, shift, age);            //override method
        this.PersonsuperName = PersonsuperName;
        this.Shiftlist = Shiftlist;
    }

    @Override
    public String toString() {
        return "Personsuper{" +
                "PersonsuperName='" + PersonsuperName + '\'' +
                ", Shiftlist=" + Shiftlist +
                '}';
    }
}
