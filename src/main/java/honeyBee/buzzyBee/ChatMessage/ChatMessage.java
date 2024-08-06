package honeyBee.buzzyBee.ChatMessage;

import honeyBee.buzzyBee.ChatRoom.ChatRoom;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import java.time.LocalDateTime;

@Entity
public class ChatMessage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private ChatRoom chatRoom;
	
	@ManyToOne
	private User user;
	
	private String comment;
	
	private LocalDateTime sendTime;
	
	public ChatMessage() {
	}
	
	public ChatMessage(ChatRoom chatRoom, String comment, Long id, LocalDateTime sendTime,
		User user) {
		this.chatRoom = chatRoom;
		this.comment = comment;
		this.id = id;
		this.sendTime = sendTime;
		this.user = user;
	}
	
	public ChatRoom getChatRoom() {
		return chatRoom;
	}
	
	public String getComment() {
		return comment;
	}
	
	public Long getId() {
		return id;
	}
	
	public LocalDateTime getSendTime() {
		return sendTime;
	}
	
	public User getUser() {
		return user;
	}
}