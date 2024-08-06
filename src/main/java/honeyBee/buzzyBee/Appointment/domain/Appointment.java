package honeyBee.buzzyBee.Appointment.domain;

import honeyBee.buzzyBee.Consultant.domain.Consultant;
import honeyBee.buzzyBee.User.domain.User;
import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Entity
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Consultant consultant;

    @ManyToOne
    private User user;

    private LocalDateTime appointmentDateTime;

    @Enumerated(value = EnumType.STRING)
    private Status status;

    @ColumnDefault(value = "false")
    private Boolean isBooked;

    @Enumerated(value = EnumType.STRING)
    private AppointmentType appointmentType;

    public Appointment() {
    }

    public Appointment(Status status, AppointmentType appointmentType, Consultant consultant, LocalDateTime appointmentDateTime) {
        this.status = status;
        this.appointmentType = appointmentType;
        this.consultant = consultant;
        this.appointmentDateTime = appointmentDateTime;
    }

    public Long getId() {
        return id;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getAppointmentDateTime() {
        return appointmentDateTime;
    }

    public Status getStatus() {
        return status;
    }

    public Boolean getBooked() {
        return isBooked;
    }

    public AppointmentType getAppointmentType() {
        return appointmentType;
    }
}
