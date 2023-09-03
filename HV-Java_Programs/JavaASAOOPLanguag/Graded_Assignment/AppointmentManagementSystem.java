import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Visitor {
    private String name;
    private String phone;
    private String email;

    public Visitor(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

class Appointment {
    private String visitorName;
    private String timeSlot;

    public Appointment(String visitorName, String timeSlot) {
        this.visitorName = visitorName;
        this.timeSlot = timeSlot;
    }

    public String getVisitorName() {
        return visitorName;
    }

    public void setVisitorName(String visitorName) {
        this.visitorName = visitorName;
    }

    public String getTimeSlot() {
        return timeSlot;
    }

    public void setTimeSlot(String timeSlot) {
        this.timeSlot = timeSlot;
    }
}

public class AppointmentManagementSystem {
    private List<Visitor> visitors;
    private Map<String, String> appointmentSchedule;

    public AppointmentManagementSystem() {
        this.visitors = new ArrayList<>();
        this.appointmentSchedule = new HashMap<>();
    }

    public void addVisitor(Visitor visitor) {
        visitors.add(visitor);
    }

    public void editVisitor(String visitorName, String newPhone, String newEmail) {
        for (Visitor visitor : visitors) {
            if (visitor.getName().equals(visitorName)) {
                visitor.setPhone(newPhone);
                visitor.setEmail(newEmail);
                System.out.println("Visitor details updated successfully!");
                return;
            }
        }
        System.out.println("Visitor not found!");
    }

    public void displayVisitors() {
        System.out.println("Visitors List:");
        for (Visitor visitor : visitors) {
            System.out.println("Name: " + visitor.getName());
            System.out.println("Phone: " + visitor.getPhone());
            System.out.println("Email: " + visitor.getEmail());
            System.out.println();
        }
    }

    public void displayAppointmentSchedule() {
        System.out.println("Appointment Schedule:");
        for (Map.Entry<String, String> entry : appointmentSchedule.entrySet()) {
            String timeSlot = entry.getKey();
            String visitorName = entry.getValue();
            System.out.println("Time Slot: " + timeSlot);
            System.out.println("Visitor: " + visitorName);
            System.out.println();
        }
    }

    public void bookAppointment(String timeSlot, String visitorName) {
        if (appointmentSchedule.containsKey(timeSlot)) {
            System.out.println("Time slot already booked!");
        } else {
            appointmentSchedule.put(timeSlot, visitorName);
            System.out.println("Appointment booked successfully!");
        }
    }

    public void editAppointment(String timeSlot, String visitorName) {
        if (appointmentSchedule.containsKey(timeSlot)) {
            appointmentSchedule.put(timeSlot, visitorName);
            System.out.println("Appointment updated successfully!");
        } else {
            System.out.println("Time slot not found!");
        }
    }

    public void cancelAppointment(String timeSlot) {
        if (appointmentSchedule.containsKey(timeSlot)) {
            appointmentSchedule.remove(timeSlot);
            System.out.println("Appointment canceled successfully!");
        } else {
            System.out.println("Time slot not found!");
        }
    }

    public static void main(String[] args) {
        AppointmentManagementSystem appointmentSystem = new AppointmentManagementSystem();

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("=== Appointment Management System ===");
            System.out.println("1. Visitors List");
            System.out.println("2. Add new Visitor");
            System.out.println("3. Edit Visitor Details");
            System.out.println("4. View Appointment Schedule for a Day");
            System.out.println("5. Book an Appointment");
            System.out.println("6. Edit/Cancel Appointment");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    appointmentSystem.displayVisitors();
                    break;
                case 2:
                    System.out.print("Enter visitor name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter visitor phone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Enter visitor email: ");
                    String email = scanner.nextLine();
                    Visitor visitor = new Visitor(name, phone, email);
                    appointmentSystem.addVisitor(visitor);
                    System.out.println("Visitor added successfully!");
                    break;
                case 3:
                    System.out.print("Enter visitor name: ");
                    String editVisitorName = scanner.nextLine();
                    System.out.print("Enter new phone: ");
                    String newPhone = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    appointmentSystem.editVisitor(editVisitorName, newPhone, newEmail);
                    break;
                case 4:
                    appointmentSystem.displayAppointmentSchedule();
                    break;
                case 5:
                    System.out.print("Enter time slot: ");
                    String timeSlot = scanner.nextLine();
                    System.out.print("Enter visitor name: ");
                    String bookVisitorName = scanner.nextLine();
                    appointmentSystem.bookAppointment(timeSlot, bookVisitorName);
                    break;
                case 6:
                    System.out.print("Enter time slot: ");
                    String editTimeSlot = scanner.nextLine();
                    System.out.print("Enter visitor name: ");
                    String editVisitorName = scanner.nextLine();
                    appointmentSystem.editAppointment(editTimeSlot, editVisitorName);
                    break;
                case 7:
                    System.out.print("Enter time slot: ");
                    String cancelTimeSlot = scanner.nextLine();
                    appointmentSystem.cancelAppointment(cancelTimeSlot);
                    break;
                case 8:
                    exit = true;
                    System.out.println("Exiting Appointment Management System... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
