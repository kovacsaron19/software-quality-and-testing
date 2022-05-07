package aron.kovacs.g1098.flyweight;

import java.util.HashMap;

public class PredictorFactory {
	static HashMap<String, PredictorInterface> predictors = new HashMap<>();
	
	static {
		predictors.put("VOICE", new PredictorFlyweight("./voice"));
		predictors.put("TEXT", new PredictorFlyweight("./text"));
	}
	
	public static PredictorInterface getPredictor(String type) {
		return predictors.get(type);
	}
}
