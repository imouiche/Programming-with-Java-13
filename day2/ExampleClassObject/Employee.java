package day2.ExampleClassObject;

public class Employee {
	
	double salary;
	double bonus;
	//void is a return type of a method
	void calculateTotalPay(){
		double totalPay = salary + bonus;
		System.out.println("Total Pay = " + totalPay);
	}

}
