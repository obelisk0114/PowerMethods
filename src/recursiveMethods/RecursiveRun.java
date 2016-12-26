package recursiveMethods;

import java.util.Scanner;

public class RecursiveRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursive1 recursive1 = new Recursive1();
		Recursive2 recursive2 = new Recursive2();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input the base : ");
		int base = keyboard.nextInt();
		System.out.println("Please input the order : ");
		int power = keyboard.nextInt();
		
		double ans1 = recursive1.recursive_1(base, power);
		System.out.println("First try Answer : " + ans1);
		
		double ans2 = recursive2.recursive_2(base, power);
		System.out.println("Second try Answer : " + ans2);
		
		keyboard.close();

	}

}
