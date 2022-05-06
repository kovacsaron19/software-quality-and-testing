package aron.kovacs.g1098.decorator;

public abstract class VoiceLoginAbstractDecorator extends AbstractVoiceLogin{

	AbstractVoiceLogin abstractVoiceLogin = null;
	
	public VoiceLoginAbstractDecorator(AbstractVoiceLogin voiceLogin) {
		super(voiceLogin.fileDirectory, voiceLogin.userName, voiceLogin.dateTime);
		this.abstractVoiceLogin = voiceLogin;
	}

	@Override
	public void saveToDb() {
		this.abstractVoiceLogin.saveToDb();	
	}
	
	
	
}
