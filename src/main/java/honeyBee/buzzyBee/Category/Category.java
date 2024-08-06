package honeyBee.buzzyBee.Category;

import jakarta.persistence.*;

@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    protected Category() {
    }

    public Category(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
