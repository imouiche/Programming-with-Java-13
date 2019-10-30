package day2.ExampleClassObject;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Employee alex, john, linda;
		
		//following is mandatory
		/*
		 * alex = new Employee(); linda = new Employee(); john = new Employee();
		 */
		// or
		Employee alex = new Employee();
		Employee linda = new Employee();
		Employee john = new Employee();
		
		alex.salary = 90000;
		alex.bonus = 20000;
		alex.calculateTotalPay();
			
		linda.salary = 100000;
		linda.bonus = 2367600;
		linda.calculateTotalPay();
	}

}
