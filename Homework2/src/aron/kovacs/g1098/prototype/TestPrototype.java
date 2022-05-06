package aron.kovacs.g1098.prototype;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		PredictionModel voiceModel = new PredictionModel(PredictionType.VOICE, "./dir");
		PredictionModel voiceModel2 = (PredictionModel) voiceModel.clone();
		
		//loads only once!
	}
}
