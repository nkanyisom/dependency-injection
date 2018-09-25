package za.co.di_example.dependencyinjection.injector;

import za.co.di_example.dependencyinjection.consumer.Consumer;
import za.co.di_example.dependencyinjection.consumer.MyDIApplication;
import za.co.di_example.dependencyinjection.service.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		return new MyDIApplication(new SMSServiceImpl());
	}

}
