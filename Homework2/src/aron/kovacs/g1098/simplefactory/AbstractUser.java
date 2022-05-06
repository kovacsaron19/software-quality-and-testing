package aron.kovacs.g1098.simplefactory;

public abstract class AbstractUser {
	public String userName;
	public String directory;
	
	public AbstractUser(String userName, String directory) {
		this.directory = directory;
		this.userName = userName;
	}
	
	public abstract void login();
}
