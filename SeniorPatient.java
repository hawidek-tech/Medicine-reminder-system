public class SeniorPatient extends Patient {

    public SeniorPatient(String name, int age) {
        super(name, age);
    }

    @Override
    public void displayInfo() {
        System.out.println("Senior Patient: " + getName());
        System.out.println("Extra Care Required");
    }
}
