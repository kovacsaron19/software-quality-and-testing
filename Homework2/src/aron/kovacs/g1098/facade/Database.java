package aron.kovacs.g1098.facade;

public class Database {
	public String domain;

	public Database(String domain) {
		super();
		this.domain = domain;
	}
	
	public void connect() {
		System.out.println("Connecting to DB at " + this.domain);
	}
	
}
