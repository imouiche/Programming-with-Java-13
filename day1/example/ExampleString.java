package day1.example;

public class ExampleString {

	public static void main(String[] args) {
		
		String x = "Inoussa Mouiche";
		System.out.println("Hello " + x);
		System.out.println(x.toUpperCase());
		System.out.println(x.substring(2));
		System.out.println(x.substring(2, 7));
		System.out.println(x.charAt(3));
		
		String age = "37";
		String salary  ="677698.45";
		//wrapper classes eg Integer & Double classes below
		
		//convert to an int/double
		int a = Integer.parseInt(age)/2;
		System.out.println(a);
		double s  = Double.parseDouble(salary) *.15;
		System.out.println(salary);
	}

}
