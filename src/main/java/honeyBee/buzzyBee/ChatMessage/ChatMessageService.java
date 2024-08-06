package honeyBee.buzzyBee.ChatMessage;

import org.springframework.stereotype.Service;

@Service
public class ChatMessageService {
	
	private final ChatMessageRepository chatMessageRepository;
	
	public ChatMessageService(ChatMessageRepository chatMessageRepository) {
		this.chatMessageRepository = chatMessageRepository;
	}
}