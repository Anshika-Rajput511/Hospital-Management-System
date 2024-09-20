import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HospitalManagementSystem {
    private static PatientService patientService = new PatientService();
    private static DoctorService doctorService = new DoctorService();
    private static AppointmentService appointmentService = new AppointmentService();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Hospital Management System!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Register Patient");
            System.out.println("2. Register Doctor");
            System.out.println("3. Book Appointment");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    // Register Patient
                    System.out.print("Enter patient name: ");
                    String patientName = scanner.nextLine();
                    System.out.print("Enter patient contact: ");
                    String patientContact = scanner.nextLine();
                    patientService.registerPatient(patientName, patientContact);
                    break;

                case 2:
                    // Register Doctor
                    System.out.print("Enter doctor name: ");
                    String doctorName = scanner.nextLine();
                    System.out.print("Enter doctor specialization: ");
                    String specialization = scanner.nextLine();
                    doctorService.registerDoctor(doctorName, specialization);
                    break;

                case 3:
                    // Book Appointment
                    System.out.print("Enter patient ID: ");
                    int patientId = scanner.nextInt();
                    System.out.print("Enter doctor ID: ");
                    int doctorId = scanner.nextInt();
                    System.out.print("Enter appointment date (YYYY-MM-DD): ");
                    String dateString = scanner.next(); 

                    LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
                    appointmentService.bookAppointment(patientId, doctorId, date);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
