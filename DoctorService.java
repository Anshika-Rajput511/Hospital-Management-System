import java.util.ArrayList;
import java.util.List;

public class DoctorService {
    private List<Doctor> doctors = new ArrayList<>();

    public void registerDoctor(String name, String specialization) {
        int id = doctors.size() + 1; 
        doctors.add(new Doctor(id, name, specialization));
        System.out.println("Doctor registered: " + name);
    }

}

