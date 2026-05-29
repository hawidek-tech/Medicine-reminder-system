public class Patient extends Person {

    public Patient(String name, int age) {
        super(name, age);
    }
 @Override
    public void displayInfo() {
        System.out.println("Patient: " + getName());
        System.out.println("Age: " + getAge());
    }
}
