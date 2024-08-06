package honeyBee.buzzyBee.ConsultantCategory;

import honeyBee.buzzyBee.Category.Category;
import honeyBee.buzzyBee.Consultant.domain.Consultant;
import jakarta.persistence.*;

@Entity
public class ConsultantCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Consultant consultant;

    @ManyToOne
    private Category category;

    protected ConsultantCategory() {
    }

    public Long getId() {
        return id;
    }

    public Consultant getConsultant() {
        return consultant;
    }

    public Category getCategory() {
        return category;
    }

    public ConsultantCategory(Consultant consultant, Category category) {
        this.consultant = consultant;
        this.category = category;
    }
}
