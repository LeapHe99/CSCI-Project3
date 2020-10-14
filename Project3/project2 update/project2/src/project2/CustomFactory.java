package project2;

public class CustomFactory {
	public Custom generateCustom(String customType) {
		if(customType.equalsIgnoreCase("casual")) {
			return new Casual();
		}
		if(customType.equalsIgnoreCase("business")) {
			return new Business();
		}
		if(customType.equalsIgnoreCase("catering")) {
			return new Catering();
		}
		return null;
	}
	
	
}
