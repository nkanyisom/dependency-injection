package za.co.di_example.dependencyinjection.injector;

import za.co.di_example.dependencyinjection.consumer.Consumer;

public interface MessageServiceInjector {

	public Consumer getConsumer();
}
