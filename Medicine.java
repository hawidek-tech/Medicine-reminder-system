public class Medicine {

    private String medicineName;
    private String dosage;
    private String time;
    private boolean taken;

    public Medicine(String medicineName, String dosage, String time) {
        this.medicineName = medicineName;
        this.dosage = dosage;
        this.time = time;
        this.taken = false;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public String getDosage() {
        return dosage;
    }

    public String getTime() {
        return time;
    }

    public boolean isTaken() {
        return taken;
    }

    public void setTaken(boolean taken) {
        this.taken = taken;
    }

    public void displayMedicine() {
        System.out.println("Medicine: " + medicineName);
        System.out.println("Dosage: " + dosage);
        System.out.println("Time: " + time);
        System.out.println("Taken: " + taken);
    }
}
