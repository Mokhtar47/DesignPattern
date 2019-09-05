package com.nabil;

public class Youtube {

	public static void main(String[] args) {
		Chanel channel = new Chanel();
		
		Subscriber s1 = new Subscriber("Nabil");
		Subscriber s2 = new Subscriber("Med");
		Subscriber s3 = new Subscriber("Ayoub");
		Subscriber s4 = new Subscriber("Said");
		Subscriber s5 = new Subscriber("Youssef");
		Subscriber s6 = new Subscriber("Bouaaza");
		
		channel.subscribe(s1);
		channel.subscribe(s2);
		channel.subscribe(s3);
		channel.subscribe(s4);
		channel.subscribe(s5);
		channel.subscribe(s6);
		
		channel.unsubscribe(s3);
		
		s1.subscribeChanel(channel);
		s2.subscribeChanel(channel);
		s3.subscribeChanel(channel);
		s4.subscribeChanel(channel);
		s5.subscribeChanel(channel);
		s6.subscribeChanel(channel);
		

		
		channel.upload("cours Design Pattern Java");
		
	}

}
