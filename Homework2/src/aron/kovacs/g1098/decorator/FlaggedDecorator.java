package aron.kovacs.g1098.decorator;

public class FlaggedDecorator extends VoiceLoginAbstractDecorator{
	
	boolean isFlagged = true;

	public FlaggedDecorator(AbstractVoiceLogin voiceLogin) {
		super(voiceLogin);
	}

	@Override
	public void saveToDb() {
		System.out.println("saving standard voice login to DB. voice file in " + this.fileDirectory + " Login is flagged.");
	}
	
	

}
