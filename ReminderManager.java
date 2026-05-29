package service;

import model.Medicine;
import java.util.ArrayList;

public class ReminderManager {

    private ArrayList<Medicine> medicines = new ArrayList<>();

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }
    
    public void addMedicine(String name, String dosage) {
        medicines.add(new Medicine(name, dosage, "Not Set"));
    }

    public void displayMedicines() {
        for (Medicine medicine : medicines) {
            medicine.displayMedicine();
            System.out.println();
        }
    }

    public void markAsTaken(String medicineName) {

        for (Medicine medicine : medicines) {

            if (medicine.getMedicineName()
                    .equalsIgnoreCase(medicineName)) {

                medicine.setTaken(true);

                System.out.println(
                        medicineName + " marked as taken.");
            }
        }
    }

    public void showReminders() {

        for (Medicine medicine : medicines) {

            if (!medicine.isTaken()) {

                System.out.println(
                        "Reminder: Take "
                        + medicine.getMedicineName()
                        + " at "
                        + medicine.getTime());
            }
        }
    }
}
