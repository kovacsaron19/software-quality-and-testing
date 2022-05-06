package aron.kovacs.g1098.adapter;

import java.util.ArrayList;

public class TestAdapter {

	public static void main(String[] args) {
		ArrayList<AbstractTextLogin> logins = new ArrayList<>();
		
		AbstractVoiceLogin voiceLogin = new StandardVoiceLogin("./dir", "user1", "2022-05-06 15:40");
		AbstractTextLogin textLogin = new StandardTextLogin("user2", "2022-05-06 15:40");
		
		VoiceToTextLoginAdapter adapter = new VoiceToTextLoginAdapter(voiceLogin);
		
		logins.add(textLogin);
		logins.add(adapter);
		
		for(AbstractTextLogin login : logins) {
			login.log();
		}
	}

}
