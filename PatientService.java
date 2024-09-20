import java.util.ArrayList;
import java.util.List;

public class PatientService {
    private List<Patient> patients = new ArrayList<>();

    public void registerPatient(String name, String contact) {
        int id = patients.size() + 1; 
        patients.add(new Patient(id, name, contact));
        System.out.println("Patient registered: " + name);
    }
}

