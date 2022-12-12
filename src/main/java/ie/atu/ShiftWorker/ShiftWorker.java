package ie.atu.ShiftWorker;

public class ShiftWorker {
    public static void main(String[] args) {
        Person jack = new Person();
        jack.setName("Jack");
        jack.setGender("male");
        jack.setShift (true);
        jack.setAge("30");

        System.out.println("\nHere are the details given: " + jack.toString());
        Personsuper myPerson = new Personsuper("jack","male", true, "30");
        System.out.println("Here are the details: " + myPerson.toString());
    }
}


