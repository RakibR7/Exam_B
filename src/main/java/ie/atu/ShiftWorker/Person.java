package ie.atu.ShiftWorker;

public class Person {
    private String name;
    private String gender;
    private boolean shift;
    private String age;

    public Person() {
    }

    public Person(String name, String gender, boolean shift, String age) {
        this.name = name;
        this.gender = gender;
        this.shift = shift;
        this.age = age;
    }


    public String getName() {       //setters and getters
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isShift() {
        return shift;
    }
    public void setShift(boolean shift) {
        this.shift = shift;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name ='" + name + '\'' +
                ", gender ='" + gender + '\'' +
                ", shift =" + shift +
                ", age ='" + age + '\'' +
                '}';
    }
}

