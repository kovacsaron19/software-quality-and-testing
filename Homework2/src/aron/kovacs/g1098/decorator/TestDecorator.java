package aron.kovacs.g1098.decorator;

public class TestDecorator {

	public static void main(String[] args) {
		AbstractVoiceLogin login = new StandardVoiceLogin("./dir", "JD1", "2022-05-06");
		
		login.saveToDb();
		
		login = new FlaggedDecorator(login);
		
		login.saveToDb();

	}

}
