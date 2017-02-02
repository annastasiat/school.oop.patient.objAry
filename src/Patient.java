import java.lang.reflect.Array;

/**
 * Created by work on 01.02.2017.
 */
public class Patient {
    public String first_name, surname, address, diagnosis;
    public int id;

    public Patient(String first_name, String surname, String address, String diagnosis, int id) {
        this.first_name = first_name;
        this.surname = surname;
        this.address = address;
        this.diagnosis = diagnosis;
        this.id = id;
    }

}

