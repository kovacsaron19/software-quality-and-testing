package aron.kovacs.g1098.flyweight;

public class TestFlyweight {
	public static void main(String[] args) {
		PredictorUsageData input1 = new PredictorUsageData("198-02.flac", "localhost:5000/voice");
		PredictorUsageData input2 = new PredictorUsageData("test writing", "localhost:5000/text");
		
		PredictorFactory.getPredictor("TEXT").predict(input2);
	}
}
