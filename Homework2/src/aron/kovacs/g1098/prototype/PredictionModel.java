package aron.kovacs.g1098.prototype;

public class PredictionModel implements Cloneable{
	public PredictionType predictionType;
	public String directory;
	
	
	public PredictionModel(PredictionType predictionType, String directory) {
		super();
		this.predictionType = predictionType;
		this.directory = directory;
		this.loadModel(directory);
		
	}
	
	private void loadModel(String directory) {
		System.out.println("Loading model from " + directory);
	}
	
	public PredictionModel() {
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		PredictionModel model = new PredictionModel();
		model.predictionType = this.predictionType;
		model.directory = this.directory;
		return model;
	}
	
	
}
