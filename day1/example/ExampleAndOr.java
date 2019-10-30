package day1.example;

public class ExampleAndOr {
	
public static void main(String[] args) {
		
		int x, y;
		x = 10;
		y =-10;
		// one"&" or one "|" would check both conditions before proceeding
		if (x>0 && y>0) {
			System.out.println("Both number are positives");
		}else if(x > 0 || y > 0) {
			System.out.println("at least one number is positive");
		}else {
			System.out.println("Both nums are -ves");
		}
				
		
	}

}
