package honeyBee.buzzyBee.ChatRoom;

import honeyBee.buzzyBee.ChatMessage.ChatMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatrooms")
public class ChatRoomController {

	private final ChatRoomService chatRoomService;
	
	public ChatRoomController(ChatRoomService chatRoomService) {
		this.chatRoomService = chatRoomService;
	}
}