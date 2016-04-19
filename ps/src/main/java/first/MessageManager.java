package first;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MessageManager {

	@Autowired
	MessageService messageService;
	
	public String printMessage() {
		return this.messageService.getMessage();
	}
}
