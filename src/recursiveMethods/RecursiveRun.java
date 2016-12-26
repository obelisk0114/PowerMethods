package recursiveMethods;

import java.util.Scanner;

public class RecursiveRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive1 recursive1 = new Recursive1();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input the base : ");
		int base = keyboard.nextInt();
		System.out.println("Please input the order : ");
		int power = keyboard.nextInt();
		double ans = recursive1.recursive1(base, power);
		System.out.println("Answer : " + ans);
		
		keyboard.close();

	}

}
