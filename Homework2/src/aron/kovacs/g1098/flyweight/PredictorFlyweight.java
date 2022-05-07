package aron.kovacs.g1098.flyweight;

public class PredictorFlyweight implements PredictorInterface{

	String directory;
	
	public PredictorFlyweight(String directory) {
		super();
		this.directory = directory;
	}


	@Override
	public void predict(PredictorUsageData data) {
		System.out.println("Predicting for " + data.input + " at " + data.domain);
		
	}
	
}
