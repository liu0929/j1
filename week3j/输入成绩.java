package week3;

import java.util.Scanner;

public class  ‰»Î≥…º® {

	public static void main(String[] args) {
		int choose = menu();
		while(choose!=5){
			switch(choose){
				case 1:createAccount();break;
				case 2:deposit();break;
				case 3:withDraw();break;
				case 4:balance();break;
				default:System.out.println("invalid choose");
			}
			choose = menu();
		}
		System.out.println("See you again!");
	}

	public static int menu(){
		int choose = 0;
		System.out.println("==========WTU Bank==========");
		System.out.println("1.Create New Account");
		System.out.println("2.Deposit");
		System.out.println("3.Withdraw");
		System.out.println("4.Balance");
		System.out.println("5.Exit");
		System.out.println("«Î ‰»Î(1-5)");

		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();

		return choose;
	}

	public static void createAccount(){
		System.out.println("You have selected 1");
	}

	public static void deposit(){
		System.out.println("You hace selected 2");
	}

	public static void withDraw(){
		System.out.println("You have selected 3");
	}

	public static void balance(){
		System.out.println("You have selected 4");
	}

}