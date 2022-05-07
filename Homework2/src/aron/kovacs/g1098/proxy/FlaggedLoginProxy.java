package aron.kovacs.g1098.proxy;

public class FlaggedLoginProxy implements LoginInterface{
	LoginInterface standardLogin = null;
	
	boolean isFlagged = true;

	public FlaggedLoginProxy(LoginInterface standardLogin) {
		super();
		this.standardLogin = standardLogin;
	}

	@Override
	public void login(String username, String fileDirectory) {
		System.out.println("Logging in as " + username + " Flagged login.");
		
	}
	
}
