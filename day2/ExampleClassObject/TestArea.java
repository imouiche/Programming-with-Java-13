package day2.ExampleClassObject;

public class TestArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Box ups, fedEx;
		ups = new Box();
		fedEx = new Box();
		ups.length = 5;
		ups.width = 10;
		ups.calculateArea();
		
		fedEx.length = 78;
		fedEx.width = 5;
		fedEx.calculateArea();
	}

}
