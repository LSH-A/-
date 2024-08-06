package honeyBee.buzzyBee.review;

import jakarta.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    private User user;

//    @ManyToOne
//    private Consultant consultant;

    private Double rating;

    private String comment;

    public Review() {
    }

//    public Review(User user, Consultant consultant, Double rating, String comment) {
//        this.user = user;
//        this.consultant = consultant;
//        this.rating = rating;
//        this.comment = comment;
//    }

    public Long getId() {
        return id;
    }

//    public User getUser() {
//        return user;
//    }

//    public Consultant getConsultant() {
//        return consultant;
//    }

    public Double getRating() {
        return rating;
    }

    public String getComment() {
        return comment;
    }
}
