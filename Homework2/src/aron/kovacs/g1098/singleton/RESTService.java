package aron.kovacs.g1098.singleton;

import java.util.Hashtable;

public class RESTService {
	String url;
	PredictionModelType predictionModel;
	
	private static Hashtable<PredictionModelType, RESTService> backends = new Hashtable<>();
	
	
	private RESTService(PredictionModelType model, String url) {
		System.out.println("backend of model " + model.toString());
		this.url = url;
		this.predictionModel = model;
	}
	
	private RESTService() {
		
	}
	
	public void loginGET() {
		System.out.println("Get the login page");
	}
	
	public void predictionPOST() {
		System.out.println("Predict using " + this.predictionModel);
	}

	
	public static synchronized RESTService getRESTService(PredictionModelType model, String url) {	
		RESTService backend = backends.get(model);
		if(backend == null) {
			backend = new RESTService(model, url);
			backends.put(model, backend);
		}
		
		return backend;
	}
	
}
