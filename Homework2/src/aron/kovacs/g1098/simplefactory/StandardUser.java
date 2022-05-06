package aron.kovacs.g1098.simplefactory;

public class StandardUser extends AbstractUser {

	public StandardUser(String userName, String directory) {
		super(userName, directory);
	}

	@Override
	public void login() {
		System.out.println("standard user login");

	}

}
