package day1.Exercices;

public class ExerciceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salary = 1000;
		double tax =0.0;
		if (salary <= 15000) {
			tax = salary * .10;
		}else if(salary <= 40000) {
			tax =salary * .20;
		}else {
			tax = salary * .30;
		}
		System.out.println( " tax = " + tax);
	}

}
