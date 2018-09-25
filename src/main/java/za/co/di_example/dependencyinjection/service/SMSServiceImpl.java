package za.co.di_example.dependencyinjection.service;

public class SMSServiceImpl implements MessageService {

	public void sendMessage(String msg, String rec) {
		//logic to send SMS
		System.out.println("SMS sent to "+rec+ " with Message="+msg);
	}

}
