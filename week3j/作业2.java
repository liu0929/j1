package week3;

import java.util.Scanner;

public class ��ҵ2 {
	public static int number[];
	public static void main(String[] args) {
		int choose = menu();
		double sum;
		while(choose!=6){
			switch(choose){
				case 1:
					input();
				break;
				case 2:
					if(number == null){
						System.out.println("������ɵ�һ����");
						break;
					}
					allOdd();
				break;
				case 3:
					sum = allEvenSum();
					System.out.println("���е�ż����Ϊ��"+sum);
				break;
				case 4:
					allNumberAndpowSum();
				break;
				case 5:
					allOddpowSum();
				break;
				default:System.out.println("invalid choose");
			}
			choose = menu();

		}
		System.out.println("See you again!");
	}

	public static int menu(){
		int choose = 0;
		System.out.println("");
		System.out.println("==========Menu==========");
		System.out.println("1.input two numbers");
		System.out.println("2.Output all the odd numbers between firstNum and secondNum");
		System.out.println("3.Output the sum of all the even numbers between firstNum and secondNum");
		System.out.println("4.Output the numbers and their squares between two numbers");
		System.out.println("5.Output the sum of the squares of all the odd between t");
		System.out.println("������(1-5)");

		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();

		return choose;
	}

	public static void input(){
		number = new int[2];
		int temp;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<number.length;i++){
			System.out.println("�������"+(i+1)+"������");
			number[i] = scan.nextInt();
		}
		if(number[0]>number[1]){
			temp = number[0];
			number[0] = number[1];
			number[1] = temp;
		}else if(number[0]==number[1]){
			System.out.println("������ȣ����������룡");
			input();
		}
	}

	public static void allOdd(){
		System.out.println(number[0]+"��"+number[1]+"֮�������Ϊ��");
		for(int i=number[0]+1;i<=number[1];i++){
			if(i%2!=0){
				System.out.print(" "+i+" ");
			}
		}

	}

	public static double allEvenSum(){
		double sum = 0;
		for(int i=number[0]+1;i<=number[1];i++){
			if(i%2==0){
				sum+=i;
			}
		}
		return sum;
	}



	public static void allNumberAndpowSum(){
		int sum = 0;
		System.out.println(number[0]+"��"+number[1]+"֮�����Ϊ��");
		for(int i=number[0]+1;i<number[1];i++){
			System.out.print(i+" ");
			sum = sum + (int)Math.pow(i, 2);
		}
		System.out.println("�������ֵ�ƽ����Ϊ��"+sum);
}

	public static void allOddpowSum(){
		int sum = 0;
		for(int i=number[0]+1;i<number[1];i++){
			if(i%2!=0){
				sum = sum + (int)Math.pow(i, 2);
			}
		}
		System.out.println("����������ƽ����Ϊ��"+sum);
}
}