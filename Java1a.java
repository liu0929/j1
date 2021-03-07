package week1;

import java.util.Scanner;

public class Java1a {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 定义
		final int COINS100 = 100;
		final int COINS50 = 50;
		final int COINS20 = 20;
		final int COINS10 = 10;
		final int COINS5 = 5;
		final int COINS2 = 2;
		final int COINS1 = 1;
		int numberOfCoins;
		int leftoverCoins;
		int numberOf100;
		int numberOf50;
		int numberOf20;
		int numberOf10;
		int numberOf5;
		int numberOf2;
		int numberOf1;

		// 输入
		System.out.println("请输入美元数（单位：美分）");
		numberOfCoins = scan.nextInt();
		// 计算
		numberOf100 = numberOfCoins / COINS100;
		leftoverCoins = numberOfCoins % COINS100;
		numberOf50 = leftoverCoins / COINS50;
		leftoverCoins = leftoverCoins % COINS50;
		numberOf20 = leftoverCoins / COINS20;
		leftoverCoins = leftoverCoins % COINS20;
		numberOf10 = leftoverCoins / COINS10;
		leftoverCoins = leftoverCoins % COINS10;
		numberOf5 = leftoverCoins / COINS5;
		leftoverCoins = leftoverCoins % COINS5;
		numberOf2 = leftoverCoins / COINS2;
		leftoverCoins = leftoverCoins % COINS2;
		numberOf1 = leftoverCoins / COINS1;
		leftoverCoins = leftoverCoins % COINS1;

		// 输出
		System.out.println("可以换" + numberOf100 + "美元");
		System.out.println(numberOf50 + "张50美分");
		System.out.println(numberOf20 + "张20美分");
		System.out.println(numberOf10 + "张10美分");
		System.out.println(numberOf5 + "张5美分");
		System.out.println(numberOf2 + "张2美分");
		System.out.println(numberOf1 + "张1美分");

	}

}
