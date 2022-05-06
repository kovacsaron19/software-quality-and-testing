package aron.kovacs.g1098.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		RESTService voiceBackend = RESTService.getRESTService(PredictionModelType.VOICE, "localhost:5000/voice");
		RESTService textBackend = RESTService.getRESTService(PredictionModelType.TEXT, "localhost:5000/voice");
		RESTService voiceBackend2 = RESTService.getRESTService(PredictionModelType.VOICE, "localhost:5000/voice");
		
		if(voiceBackend == voiceBackend2) {
			System.out.println("They point to the same object");
		}
		else
		{
			System.out.println("They are different");
		}
	}

}
