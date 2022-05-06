package aron.kovacs.g1098.adapter;

public class StandardVoiceLogin extends AbstractVoiceLogin{

	public StandardVoiceLogin(String fileDirectory, String userName, String dateTime) {
		super(fileDirectory, userName, dateTime);
	}

	@Override
	public void saveToDb() {
		System.out.println("saving standard voice login to DB. voice file in " + this.fileDirectory);
		
	}

}
