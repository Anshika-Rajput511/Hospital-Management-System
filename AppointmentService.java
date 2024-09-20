import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class AppointmentService {
    private List<Appointment> appointments = new ArrayList<>();

    public void bookAppointment(int patientId, int doctorId, LocalDate date) {
        int id = appointments.size() + 1; 
        appointments.add(new Appointment(id, patientId, doctorId, date));
        System.out.println("Appointment booked for Patient ID: " + patientId + " with Doctor ID: " + doctorId + " on " + date);
    }

}
