package aron.kovacs.g1098.adapter;

public abstract class AbstractTextLogin {
	protected String userName;
	protected String dateTime;
	
	public abstract void log();
	
	public AbstractTextLogin(String userName, String dateTime) {
		super();
		this.userName = userName;
		this.dateTime = dateTime;
	}
	
}
