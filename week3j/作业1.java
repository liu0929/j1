package week3;

import java.util.Scanner;

public class ��ҵ1 {

public static double score[];

	public static void main(String[] args) {
		int choose = menu();
		double average;
		double highest;
		double lowest;
		while(choose!=6){
			switch(choose){
				case 1:
					input();
				break;
				case 2:
					if(score == null){
						System.out.println("������ɵ�һ����");
						break;
					}
					average = average();
					System.out.println("ƽ����="+average);
				break;
				case 3:
					if(score == null){
						System.out.println("������ɵ�һ����");
						break;
					}
					highest = highest();
					System.out.println("��߷�="+highest);
				break;
				case 4:
					if(score == null){
						System.out.println("������ɵ�һ����");
						break;
					}
					lowest = lowest();
					System.out.println("��ͷ�="+lowest);
				break;
				case 5:
					if(score == null){
						System.out.println("������ɵ�һ����");
						break;
					}
					range(score);
					for(int i=1;i<score.length;i++) {
						System.out.println(score[i]);
					}
				break;
				default:System.out.println("invalid choose");
			}
			choose = menu();
		}
		System.out.println("See you again!");
	}

	public static int menu(){
		int choose = 0;
		System.out.println("==========WTU Bank==========");
		System.out.println("1.Enter Student Result");
		System.out.println("2.Class Average");
		System.out.println("3.Highest Grade");
		System.out.println("4.Lowest Grade");
		System.out.println("5.Range the Grade");
		System.out.println("6.Exit");
		System.out.println("������(1-6)");

		Scanner scan = new Scanner(System.in);
		choose = scan.nextInt();

		return choose;
	}

	public static void input(){
		score = new double[5];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<score.length;i++){
			System.out.println("�������"+(i+1)+"���ɼ���");
			score[i] = scan.nextDouble();
			if(score[i]>100||score[i]<0){
				System.out.println("��������ȷ�ķ�����0��100��������һ�ΰɣ�");
				i--;
			}
		}
	}

	public static double average(){
		double average = 0;
		double sum = 0;
		for(int i=0;i<score.length;i++){
			sum = sum + score[i];
		}
		average = sum / score.length;
		return average;
	}

	public static double highest(){
		double highest = 0;
		for(int i=0;i<score.length;i++){
			if(highest<=score[i]){
				highest = score[i];
			}
		}
		return highest;
	}

	public static double lowest(){
		double low = score[0];
		for(int i=1;i<score.length;i++){
			if(score[i]<low){
				low = score[i];
			}
		}
		return low;
	}

	public static double[] range(double[] array) {
        if (array.length == 0)
            return array;
        for (int i = 0; i < array.length; i++)
            for (int j = 0; j < array.length - 1 - i; j++)
                if (array[j + 1] < array[j]) {
                    double temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
        return array;
    }
}
