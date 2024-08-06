package honeyBee.buzzyBee.ChatMessage;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatmessages")
public class ChatMessageController {

	private final ChatMessageService chatMessageService;

	public ChatMessageController(ChatMessageService chatMessageService) {
		this.chatMessageService = chatMessageService;
	}
}