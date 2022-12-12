package ie.atu.ShiftWorker;

public class ShiftWorkerApp extends ShiftWorker {   //dummy values for testing
    public static void main(String[] args) {
        Person mary = new Person();     //bloody mary broke my code
        mary.setName("mary");
        mary.setGender("female");
        mary.setShift (false);
        mary.setAge("12");

        System.out.println("\nHere are the details given: " + mary.toString());
        Personsuper myPerson2 = new Personsuper("mary","female", false, "12");
        System.out.println("Here are the details: " + myPerson2.toString());
    }
}
