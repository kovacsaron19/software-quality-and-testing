package aron.kovacs.g1098.builder;

public class TestBuilder {
	public static void main(String[] args) {
			
			 LoginAttempt loginAttempt = new LoginAttempt.LoginAttemptBuilder("127.0.0.1", false).isFlagged().build();
			 LoginAttempt successfulLoginAttempt = new LoginAttempt.LoginAttemptBuilder("127.0.0.1", true)
					 .setUserName("johnadmindoe")
					 .setDeviceName("JPC1")
					 .build();
	
		}
}
