package honeyBee.buzzyBee.Appointment.application;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppointmentRestController {

    private final AppointmentService appointmentService;

    public AppointmentRestController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }
}
