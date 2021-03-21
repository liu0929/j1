package week2;

import java.util.Scanner;
import java.lang.Math;

public class 水仙花数 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number, n, i, t;
		double sum=0;
		System.out.println("输入一个数n(3<=n<=7)");
		n = scan.nextInt();
		for (i = (int)Math.pow(10, n-1); i < Math.pow(10, n); i++) {
			number = i;
			sum=0;
			while (number > 0) {

				t = number % 10;
				number = number / 10;
				sum = sum +  Math.pow(t, n);
			}
			if (i == ((int)sum))
				System.out.println(i);
		}
		System.out.println("over!");
	}
}
