package main.com.salestax;

public class Utils {
	
	public static float roundofftoNearest(float total,float roundFactor) {
		return ((float) Math.ceil(total /roundFactor) * roundFactor);
	}
	public float simpleRound(float input, int numOfDecimals) {
		
		int multiplier = 1;
		for (int i = 1; i <= numOfDecimals; i++) {
			multiplier = multiplier * 10;
		}
		input = input * multiplier;
		float output = Math.round(input);
		output = output / multiplier;
		return output;
	}

}
