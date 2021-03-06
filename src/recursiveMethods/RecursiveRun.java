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
		
		long preTime = System.nanoTime();
		double ans1 = recursive1.recursive_1(base, power);
		long aftTime = System.nanoTime();
		long currentTime = aftTime - preTime;
		System.out.println("First try Answer : " + ans1);
		System.out.println("First try Cost time : " + currentTime + " nanosec");
		
		preTime = System.nanoTime();
		double ans2 = recursive2.recursive_2(base, power);
		aftTime = System.nanoTime();
		currentTime = aftTime - preTime;
		System.out.println("Second try Answer : " + ans2);
		System.out.println("Second try Cost time : " + currentTime + " nanosec");
		
		long preTime2 = System.nanoTime();
		double ans = Math.pow(base, power);
		long aftTime2 = System.nanoTime();
		long currentTime2 = aftTime2 - preTime2;
		System.out.println("Math.pow Answer : " + ans);
		System.out.println("Math.pow Cost time : " + currentTime2 + " nanosec");
		
		double ansLoop = 1;
		long preTime3 = System.nanoTime();
		for (int i = 0; i < power; i++) {
			ansLoop *= base;
		}
		long aftTime3 = System.nanoTime();
		long currentTime3 = aftTime3 - preTime3;
		System.out.println("Loop Answer : " + ansLoop);
		System.out.println("Loop Cost time : " + currentTime3 + " nanosec");
		
		keyboard.close();

	}

}
