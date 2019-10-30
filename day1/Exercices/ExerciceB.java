package day1.Exercices;

public class ExerciceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nums = {"10", "20", "30", "40"};
		int total = 0;
		for (String tmp : nums) {
			total += Integer.parseInt(tmp);
		}
		
		System.out.println("total = " + total);
	}

}
