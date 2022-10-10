package factory;

public class FactoryPatternDemo {
	public static void main(String[] args) {
		shapefactory shapingF = new shapefactory();
		
		shape shape1 = shapingF.getShape("CIRCLE");
		shape1.draw();
		
		shape shape2 = shapingF.getShape("RECTANGLE");
		shape2.draw();
		shape shape3 = shapingF.getShape("SQUARE");
		shape3.draw();
	}
}
