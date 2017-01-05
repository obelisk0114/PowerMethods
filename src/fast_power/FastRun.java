package fast_power;

import java.util.Scanner;

public class FastRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fast1 fast1 = new Fast1();
		Fast2 fast2 = new Fast2();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please input the base : ");
		int base = keyboard.nextInt();
		System.out.println("Please input the order : ");
		int power = keyboard.nextInt();
		
		long preTime = System.nanoTime();
		double ans1 = fast1.fastPower(base, power);
		long aftTime = System.nanoTime();
		long currentTime = aftTime - preTime;
		System.out.println("First try Answer : " + ans1);
		System.out.println("First try Cost time : " + currentTime + " nanosec");
		
		preTime = System.nanoTime();
		double ans2 = fast2.fastPower2(base, power);
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
		int up = Math.abs(power);
		for (int i = 0; i < up; i++) {
			ansLoop *= base;
		}
		if (power < 0)
			ansLoop = 1.0/ansLoop;
		long aftTime3 = System.nanoTime();
		long currentTime3 = aftTime3 - preTime3;
		System.out.println("Loop Answer : " + ansLoop);
		System.out.println("Loop Cost time : " + currentTime3 + " nanosec");
		
		keyboard.close();

	}

}
