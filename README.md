# Medicine-reminder-system
Medicine Reminder System is a Java console application that helps users manage medicines and reminder times. Users can add medicines, view reminders, and mark medicines as taken.

Features:
  - Add medicines
  - View medicines
  - Show reminders
  - Mark medicine as taken

How to Run
  Compile:
javac model/*.java service/*.java Main.java
Run:
 java Main

OOP Concepts Used:
Classes and Objects
    - Person
    - Patient
    - SeniorPatient
    - Medicine
    - ReminderManager

Encapsulation:
  - Private fields with getters and    setters
  - Used in Person.java and Medicine.java

Inheritance
    - Patient extends Person
    - SeniorPatient extends Patient

Method Overriding
   - displayInfo() in Patient and    SeniorPatient

Method Overloading
    - addMedicine() methods in  ReminderManager

Runtime Polymorphism
   - Patient patient = new SeniorPatient("Hawi", 65);

Author
Hawi Dek
