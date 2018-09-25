package za.co.di_example.dependencyinjection.injector;

import za.co.di_example.dependencyinjection.consumer.Consumer;
import za.co.di_example.dependencyinjection.consumer.MyDIApplication;
import za.co.di_example.dependencyinjection.service.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	public Consumer getConsumer() {
		MyDIApplication app = new MyDIApplication();
		app.setService(new EmailServiceImpl());
		return app;
	}

}
