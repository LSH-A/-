package honeyBee.buzzyBee.Appointment.application;

import honeyBee.buzzyBee.Appointment.domain.AppointmentRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;

    public AppointmentService(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }
}
