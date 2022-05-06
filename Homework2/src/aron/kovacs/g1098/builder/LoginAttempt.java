package aron.kovacs.g1098.builder;

public class LoginAttempt {
	private boolean isSuccessful;
	private String ipAddress;
	
	private String deviceName;
	private boolean isFlagged;
	private String userName;
	
	private LoginAttempt() {
		
	}

	
	public LoginAttempt(String deviceName, String ipAddress, boolean isFlagged, boolean isSuccessful, String userName) {
		super();
		this.deviceName = deviceName;
		this.ipAddress = ipAddress;
		this.isFlagged = isFlagged;
		this.isSuccessful = isSuccessful;
		this.userName = userName;
	}


	public static class LoginAttemptBuilder {
		LoginAttempt loginAttempt;
		
		public LoginAttemptBuilder(String ipAddress, boolean isSuccessful) {
			this.loginAttempt = new LoginAttempt();
			this.loginAttempt.ipAddress = ipAddress;
			this.loginAttempt.isSuccessful = isSuccessful;
		}
		
		public LoginAttemptBuilder setDeviceName(String deviceName) {
			this.loginAttempt.deviceName = deviceName;
			return this;
		}
		
		public LoginAttemptBuilder isFlagged() {
			this.loginAttempt.isFlagged = true;
			return this;
		}
		
		public LoginAttemptBuilder setUserName(String userName) {
			this.loginAttempt.userName = userName;
			return this;
		}

		public LoginAttempt build() {
			return this.loginAttempt;
		}
	}
}
