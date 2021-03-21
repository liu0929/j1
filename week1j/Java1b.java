package week1;

import java.util.Scanner;

public class Java1b {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 定义
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
		// 输入
		System.out.println("请输入长");
		length = scan.nextDouble();
		System.out.println("请输入宽");
		wide = scan.nextDouble();
		System.out.println("请选择：1.普通框架  2.花式框架");
		frame =  scan.nextInt();
		System.out.println("请输入牙冠的数量");
		numberOfCrowns = scan.nextInt();
		// 计算
		if(frame==1) Frame=REGULARFRAME;
		else Frame=FANCYFRAME;
		cost=numberOfCrowns*CROWNS+length*wide*GLASS+length*wide*PAPER+COSTOFCOLOURING*WIDE*2*(length+wide+2*length*wide);

		// 输出
		System.out.println("画框成本为" + cost + "美元");	

	}

}




