package honeyBee.buzzyBee.ConsultantCategory;

import honeyBee.buzzyBee.Category.Category;
import honeyBee.buzzyBee.Consultant.domain.Consultant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ConsultantCategoryRepository extends JpaRepository<ConsultantCategory, Long> {

    List<Consultant> findByCategory(Category category);

}
