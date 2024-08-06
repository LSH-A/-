package honeyBee.buzzyBee.ChatRoom;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class ChatRoom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Appointment appointment;

	@ManyToOne
	private User user;

	@ManyToOne
	private Consultant consultant;

	private LocalDateTime createdAt;

	// Constructors, getters, and setters
	public ChatRoom() {}

	public ChatRoom(Appointment appointment, User user, Consultant consultant, LocalDateTime createdAt) {
		this.appointment = appointment;
		this.user = user;
		this.consultant = consultant;
		this.createdAt = createdAt;
	}

	public Appointment getAppointment() {
		return appointment;
	}

	public Consultant getConsultant() {
		return consultant;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public Long getId() {
		return id;
	}

	public User getUser() {
		return user;
	}
}