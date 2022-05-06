package aron.kovacs.g1098.adapter;

public class StandardTextLogin extends AbstractTextLogin{

	public StandardTextLogin(String userName, String dateTime) {
		super(userName, dateTime);
	}

	@Override
	public void log() {
		System.out.println("logged normal login for " + this.userName);
	}

}
