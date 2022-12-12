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
        return "Personsuper invalid shift  {" +
                "PersonsuperName ='" + PersonsuperName + '\'' +
                ", Shiftlist =" + Shiftlist +
                '}';
    }


    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender);
    }

    @Override
    public boolean isShift() {
        return super.isShift();
    }

    @Override
    public void setShift(boolean shift) {
        super.setShift(shift);
    }

    @Override
    public String getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(String age) {
        super.setAge(age);
    }

}
