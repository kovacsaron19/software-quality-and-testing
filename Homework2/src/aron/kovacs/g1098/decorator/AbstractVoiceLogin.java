package aron.kovacs.g1098.decorator;

public abstract class AbstractVoiceLogin {
	protected String fileDirectory;
	protected String userName;
	protected String dateTime;
	
	public abstract void saveToDb();

	public AbstractVoiceLogin(String fileDirectory, String userName, String dateTime) {
		super();
		this.fileDirectory = fileDirectory;
		this.userName = userName;
		this.dateTime = dateTime;
	}
	
	
	
	
}
