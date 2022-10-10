package singleton;

public class SingletonPatternDemo {
	public static void main(String[] args) {
		//illegal construct
		//compile time error: the constructor singleObject() is not visible
		//SingleObject object = new SingleObject();
		
		//Get the only object available
		SingleObject object = SingleObject.getInstance();
		
		object.showMessage();
	}
}
