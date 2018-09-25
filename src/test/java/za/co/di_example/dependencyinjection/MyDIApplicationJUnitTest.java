package za.co.di_example.dependencyinjection;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

import za.co.di_example.dependencyinjection.consumer.Consumer;
import za.co.di_example.dependencyinjection.consumer.MyDIApplication;
import za.co.di_example.dependencyinjection.injector.MessageServiceInjector;
import za.co.di_example.dependencyinjection.service.MessageService;

public class MyDIApplicationJUnitTest {

	private MessageServiceInjector injector;
//
//	@Before
//	public void setUp(){
//		//mock the injector with anonymous class
//		injector = new MessageServiceInjector() {
//
//			public Consumer getConsumer() {
//				//mock the message service
//				return new MyDIApplication(new MessageService() {
//
//					public void sendMessage(String msg, String rec) {
//						System.out.println("Mock Message Service implementation");
//
//					}
//				});
//			}
//		};
//
//	@Test
//	public void test() {
//		Consumer consumer = injector.getConsumer();
//		consumer.processMessages("Hi Pankaj", "pankaj@abc.com");
//	}
//
//	@After
//	public void tear(){
//		injector = null;
//	}

}
