package week1;

import java.util.Scanner;

public class Java1b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// ����
		final double COSTOFCOLOURING = 0.10;
		final double WIDE = 1;
		final double REGULARFRAME = 0.15;
		final double FANCYFRAME = 0.25;
		final double PAPER = 0.02;
		final double GLASS = 0.07;
		final double CROWNS = 0.35;
		double  wide;
		double length;
		int numberOfCrowns;
		double cost;
		int frame;
		double Frame;
		// ����
		System.out.println("�����볤");
		length = scan.nextDouble();
		System.out.println("�������");
		wide = scan.nextDouble();
		System.out.println("��ѡ��1.��ͨ���  2.��ʽ���");
		frame =  scan.nextInt();
		System.out.println("���������ڵ�����");
		numberOfCrowns = scan.nextInt();
		// ����
		if(frame==1) Frame=REGULARFRAME;
		else Frame=FANCYFRAME;
		cost=numberOfCrowns*CROWNS+length*wide*GLASS+length*wide*PAPER+COSTOFCOLOURING*WIDE*2*(length+wide+2*length*wide);

		// ���
		System.out.println("����ɱ�Ϊ" + cost + "��Ԫ");	

	}

}




