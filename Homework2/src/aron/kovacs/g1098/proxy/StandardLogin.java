package aron.kovacs.g1098.proxy;

public class StandardLogin implements LoginInterface{

	String domain;
		
	public StandardLogin(String domain) {
		super();
		this.domain = domain;
	}

	@Override
	public void login(String username, String fileDirectory) {
		System.out.println("Logging in as " + username);
		
	}

}
