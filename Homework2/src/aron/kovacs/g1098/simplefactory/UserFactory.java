package aron.kovacs.g1098.simplefactory;

public class UserFactory {
	public static AbstractUser getUser(UserType type, String userName, String directory) {
		AbstractUser user = null;
		switch (type) {
		case STANDARD:
			user = new StandardUser(userName, directory);
			break;
		case ADMIN:
			user = new Administrator(userName, directory);
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return user;
	}
}
