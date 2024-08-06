package honeyBee.buzzyBee.payment;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    private User user;

//    @OneToOne
//    private appointment appointment;

    private Double amount;

    private Boolean status;

    @Enumerated(EnumType.STRING)
    private PaymentType type;

    private LocalDateTime paymentDateTime;


    public Payment() {
    }

//    public Payment(User user, appointment appointment, Double amount, Boolean status, PaymentType type, LocalDateTime paymentDateTime) {
//        this.user = user;
//        this.appointment = appointment;
//        this.amount = amount;
//        this.status = status;
//        this.type = type;
//        this.paymentDateTime = paymentDateTime;
//    }


    public Long getId() {
        return id;
    }

//    public User getUser() {
//        return user;
//    }

//    public appointment getAppointment() {
//        return appointment;
//    }

    public Double getAmount() {
        return amount;
    }

    public Boolean getStatus() {
        return status;
    }

    public PaymentType getType() {
        return type;
    }

    public LocalDateTime getPaymentDateTime() {
        return paymentDateTime;
    }
}
