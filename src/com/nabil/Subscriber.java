package com.nabil;

public class Subscriber implements Observer {
	private String name;
	private Chanel channel;
	
	
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see com.nabil.Observer#update()
	 */
	@Override
	public void update() {
		System.out.println("hi "+name+", video uploaded "+channel.getTitle());
	}

	/* (non-Javadoc)
	 * @see com.nabil.Observer#subscribeChanel(com.nabil.Chanel)
	 */
	@Override
	public void subscribeChanel(Chanel channel) {
		this.channel = channel;
	}
	

}
