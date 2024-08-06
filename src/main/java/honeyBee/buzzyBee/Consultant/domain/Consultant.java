package honeyBee.buzzyBee.Consultant.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Consultant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String specialty;

    private String career;

    private String password;

    private String phoneNumber;

    private Double consultationFee; // 요금

    private String hospitalAddress;

    protected Consultant() {
    }

    public Consultant(String name, String specialty, String career, String password, String phoneNumber, Double consultationFee, String hospitalAddress) {
        this.name = name;
        this.specialty = specialty;
        this.career = career;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.consultationFee = consultationFee;
        this.hospitalAddress = hospitalAddress;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public String getCareer() {
        return career;
    }

    public String getPassword() {
        return password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Double getConsultationFee() {
        return consultationFee;
    }

    public String getHospitalAddress() {
        return hospitalAddress;
    }
}
