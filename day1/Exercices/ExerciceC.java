package day1.Exercices;

import java.util.Random;

public class ExerciceC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a = "Hello World";
		System.out.println(a.substring(6).toLowerCase());
		
		int dice = 0;
		Random r = new Random();
		dice = r.nextInt(6) + 1; // +1 to avoid 0 as output
		double dice1 = r.nextDouble();
		double num = dice1 * 10000;
		
		int ourNumber = (int) num;
		
		System.out.println("There you go: " + dice + " and " + ourNumber);
		
	}

}
