package observer;

public class Test {

	public static void main(String[] args) {
		SimpleSubject simpleSubject = new SimpleSubject();
		SimpleObserver simpleObserver = new SimpleObserver(simpleSubject);
		
		simpleSubject.setValue(80);
	}
}
