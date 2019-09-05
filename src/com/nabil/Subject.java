package com.nabil;

public interface Subject {

	void subscribe(Observer sub);

	void unsubscribe(Observer sub);

	void notifySubcribers();

	void upload(String title);

}