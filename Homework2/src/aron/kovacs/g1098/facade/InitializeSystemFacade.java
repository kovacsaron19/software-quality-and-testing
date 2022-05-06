package aron.kovacs.g1098.facade;

public class InitializeSystemFacade {
	public static void initialize(String domain, String model) {
		PredictionModel loadedModel = new PredictionModel(model);
		loadedModel.load();
		
		Database database = new Database(domain);
		database.connect();
	}
}
