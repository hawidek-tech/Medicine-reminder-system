public class Main {

    public static void main(String[] args) {

        ReminderManager manager =
                new ReminderManager();

        Medicine med1 =
                new Medicine(
                        "Paracetamol",
                        "500mg",
                        "8:00 AM");

        Medicine med2 =
                new Medicine(
                        "Vitamin C",
                        "1000mg",
                        "1:00 PM");

        manager.addMedicine(med1);
        manager.addMedicine(med2);

        System.out.println("=== MEDICINES ===");
        manager.displayMedicines();

        System.out.println("\n=== REMINDERS ===");
        manager.showReminders();

        manager.markAsTaken("Paracetamol");

        System.out.println("\n=== REMINDERS AFTER TAKING MEDICINE ===");
        manager.showReminders();

        Patient patient =
                new SeniorPatient(
                        "alex",
                        65);

        System.out.println("\n=== PATIENT INFO ===");
        patient.displayInfo();
    }
}
