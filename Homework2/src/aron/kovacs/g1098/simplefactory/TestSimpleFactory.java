package aron.kovacs.g1098.simplefactory;

public class TestSimpleFactory {
	
	public static void main(String[] args) {
		AbstractUser user = UserFactory.getUser(UserType.STANDARD, "johndoe1", "./jd1");
		AbstractUser user2 = UserFactory.getUser(UserType.ADMIN, "johnadmindoe", "./jad1");
	}
	
	
}
