package aron.kovacs.g1098.adapter;

public class VoiceToTextLoginAdapter extends AbstractTextLogin {

	AbstractVoiceLogin voiceLogin = null;
	
	public VoiceToTextLoginAdapter(AbstractVoiceLogin voiceLogin) {
		super(voiceLogin.userName, voiceLogin.dateTime);
		this.voiceLogin = voiceLogin;
	}

	@Override
	public void log() {
		voiceLogin.saveToDb();
	}

}
