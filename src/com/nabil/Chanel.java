package com.nabil;

import java.util.ArrayList;
import java.util.List;

public class Chanel implements Subject {
	
	private List<Observer> subscribers=new ArrayList<>();
	private String title;
	
	/* (non-Javadoc)
	 * @see com.nabil.Subject#subscribe(com.nabil.Subscriber)
	 */
	@Override
	public void subscribe(Observer sub) {
		subscribers.add(sub);
	}
	
	/* (non-Javadoc)
	 * @see com.nabil.Subject#unsubscribe(com.nabil.Observer)
	 */
	@Override
	public void unsubscribe(Observer sub) {
		subscribers.remove(sub);
	}
	
	/* (non-Javadoc)
	 * @see com.nabil.Subject#notifySubcribers()
	 */
	@Override
	public void notifySubcribers() {
		subscribers.forEach(s -> s.update());
	}
	
	/* (non-Javadoc)
	 * @see com.nabil.Subject#upload(java.lang.String)
	 */
	@Override
	public void upload(String title) {
		this.title=title;
		notifySubcribers();
	}

	public String getTitle() {
		return title;
	}
}
