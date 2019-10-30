package day1.example;

public class ExampleArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * int a =10; int b = 20; int c, d, e; c = 30; d = 40; 2 = 50;
		 */
		
		//int a =10; int b = 20;
		int[] a = {10, 20, 30, 40, 50};
		System.out.println(a[2] + " " + a[4]);
		
		// enhanced for
		for (int temp : a) {
			System.out.println(temp);
		}
		System.out.println("--------------------");
		//declare an array
		int[] x = new int[5]; x[3] =25; x[0]=12;
		for (int tmp : x) {
			System.out.println(tmp);
		}
		System.out.println("=============");
		String[] st = {"one", "two", "three"};
		for (String tmp : st) {
			System.out.println(tmp);
		}
	}

}
