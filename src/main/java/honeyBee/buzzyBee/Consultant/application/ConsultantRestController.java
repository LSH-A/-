package honeyBee.buzzyBee.Consultant.application;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultantRestController {

    private final ConsultantService consultantService;

    public ConsultantRestController(ConsultantService consultantService) {
        this.consultantService = consultantService;
    }
}
