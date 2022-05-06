package aron.kovacs.g1098.simplefactory;

public class Administrator extends AbstractUser {

	public Administrator(String userName, String directory) {
		super(userName, directory);
	}

	@Override
	public void login() {
		System.out.println("Admin login.");

	}

}
