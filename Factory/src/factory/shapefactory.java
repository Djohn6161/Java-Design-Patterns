package factory;

public class shapefactory {
	//use getShape method to get object of type shape
	public shape getShape(String shapeType) {
		if(shapeType == null) {
			return null;
		}
		if(shapeType.equalsIgnoreCase("CIRCLE")) {
			return new circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")) {
			return new square();
		}
		
		return null;
	}

}
