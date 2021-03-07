package week1;

import java.util.Scanner;

public class Java1b {
	public static void main(String[] args) {
		/*假设每个框架有1英寸宽。给镜框着色的成本是每英寸0.10美元。
		普通框架的成本是每英寸0.15美元，而花式框架的成本是每英寸0.25美元
		。在图片后面放置一张纸板纸的成本是每平方英寸0.02美元，在图片顶
		部放置玻璃的成本是每平方英寸0.07美元。顾客也可以选择在角上加冕
		，每冠0.35美元。
		编写一个程序，提示用户输入以下信息，然后输出画框的成本。
		(A)图片的长度和宽度(以英寸为单位)b)框架的类型
		(C)客户对框架颜色的选择
		(D)如果用户想要放置牙冠，那么冠的数量。
		*/
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
