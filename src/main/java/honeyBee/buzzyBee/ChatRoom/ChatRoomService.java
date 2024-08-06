package honeyBee.buzzyBee.ChatRoom;

import honeyBee.buzzyBee.ChatMessage.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChatRoomService {
	
	private final ChatMessageRepository chatMessageRepository;
	
	public ChatRoomService(ChatMessageRepository chatMessageRepository) {
		this.chatMessageRepository = chatMessageRepository;
	}
}