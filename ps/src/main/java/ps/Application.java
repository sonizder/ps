package ps;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import first.MessageManager;
import first.MessageService;
import first.MessageServiceImpl;

@Configuration
@ComponentScan
public class Application {

	@Bean
	public MessageService getMessageService() {
		return new MessageServiceImpl();
	}
	
	@Bean
	public MessageManager getMessageManager(){
		return new MessageManager();
	}
	
	public static void main(final String[] args) {
		
		final ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);
		
		final MessageManager messageManager = context.getBean(MessageManager.class);
		System.out.println(messageManager.printMessage());
	}
	
}
