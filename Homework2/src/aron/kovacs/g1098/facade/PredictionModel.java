package aron.kovacs.g1098.facade;

public class PredictionModel {
	public String model;

	public PredictionModel(String model) {
		super();
		this.model = model;
	}
	
	public void load() {
		System.out.println("Loading model " + this.model);
	}
}
