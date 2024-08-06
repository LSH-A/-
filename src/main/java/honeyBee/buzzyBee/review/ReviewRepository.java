package honeyBee.buzzyBee.review;

import honeyBee.buzzyBee.payment.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
