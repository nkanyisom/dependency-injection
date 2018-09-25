package za.co.di_example.dependencyinjection;

import za.co.di_example.dependencyinjection.consumer.Consumer;
import za.co.di_example.dependencyinjection.injector.EmailServiceInjector;
import za.co.di_example.dependencyinjection.injector.MessageServiceInjector;
import za.co.di_example.dependencyinjection.injector.SMSServiceInjector;

public class MyMessageDITest {

	public static void main(String[] args) {
		String msg = "Hi Pankaj";
		String email = "nkanyimalunga@gmail.com";
		String phone = "4088888888";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		//Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, email);
		
		//Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessages(msg, phone);
	}

}
