package honeyBee.buzzyBee.ChatMessage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatmessages")
public class ChatMessageController {

	private final ChatMessageRepository chatMessageRepository;
	
	public ChatMessageController(ChatMessageRepository chatMessageRepository) {
		this.chatMessageRepository = chatMessageRepository;
	}
}