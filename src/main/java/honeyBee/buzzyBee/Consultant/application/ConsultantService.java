package honeyBee.buzzyBee.Consultant.application;

import honeyBee.buzzyBee.Consultant.domain.ConsultantRepository;
import org.springframework.stereotype.Service;

@Service
public class ConsultantService {

    private final ConsultantRepository consultantRepository;

    public ConsultantService(ConsultantRepository consultantRepository) {
        this.consultantRepository = consultantRepository;
    }
}
