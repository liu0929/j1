package Bank;

import java.util.Scanner;

public class Drive {

	public static Customer customer = null;
	
	public static void main(String[] args) {
		int choice = menu();
		while(choice != 8){
			switch(choice){
			case 1: create(); break;
			case 2: save(); break;
			case 3: withdraw(); break;
			case 4: comsume(); break;
			case 5: repay(); break;
			case 6: settle(); break;
			case 7: balance(); break;

			default: System.out.println("Menu error input!");
			}
			choice = menu();
		}
		System.out.println("欢迎再次使用系统!");

	}
	
	public static int menu(){
		int choice = 0;
		
		System.out.println("========Menu========");
		System.out.println("1.开户 create。");
		System.out.println("2.存款 save。");
		System.out.println("3.取款 withdraw。");
		System.out.println("4.消费 comsume。");
		System.out.println("5.还款 repay。");
		System.out.println("6.银行结算 settle。");
		System.out.println("7.查询余额 balance。");
		System.out.println("8.退出 exit。");
		System.out.println("========分割线========");
		System.out.print("请选择(1-8):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		return choice;
	}
	
	public static int childmenu(){
		int choice = 0;
		
		System.out.println("=======ChildMenu=======");
		System.out.println("1.信用卡 checkingAccount。");
		System.out.println("2.存储卡 savingsAccount。");
		System.out.println("3.返回 exit。");
		System.out.println("=========分割线=========");
		System.out.print("请选择（1-3）:");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		return choice;
	}
	
	public static void create() {
		int choice = childmenu();
		while(choice != 3){
			switch(choice){
			case 1: createCheckingAccount(); break;
			case 2: createSavingsAccount(); break;

			default: System.out.println("ChildMenu error input!");
			}
			choice = childmenu();
		}
	}
	
	public static void createCheckingAccount(){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入身份证号:");
		String ssn = scan.next();
		System.out.print("请输入姓名:");
		String name = scan.next(); 
		System.out.print("请输入卡号:");
		String accountNum = scan.next();
		System.out.print("请输入服务费:");
		float servicecharge = scan.nextFloat();

		CheckingAccount ca = new CheckingAccount(accountNum, 0, servicecharge);
		customer = new Customer(ssn, name, ca, null);
		
	}
	
	public static void createSavingsAccount(){
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入身份证号:");
		String ssn = scan.next();
		System.out.print("请输入姓名:");
		String name = scan.next(); 
		System.out.print("请输入卡号:");
		String accountNum = scan.next();
		System.out.print("请输入利率:");
		float interestRate = scan.nextFloat();

		SavingsAccount sa = new SavingsAccount(accountNum, 0, interestRate);
		customer = new Customer(ssn, name, null, sa);
		
	}
	
	public static void save(){
		if(customer == null) {
			System.out.println("请先开户!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("请输入想要存入的金额:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			customer.getCa().setBalance(customer.getCa().getBalance() + money);
			return;
		}else	if(customer.getSa() != null) {
					System.out.print("请输入想要存入的金额:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					customer.getSa().setBalance(customer.getSa().getBalance() + money);
					return;
				}

	}
	
	public static void withdraw(){
		if(customer == null) {
			System.out.println("请先开户!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("请输入想要取出的金额:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			if(customer.getCa().getBalance() < money) {
				System.out.println("账户中余额不足!");
				return;
			}
			customer.getCa().setBalance(customer.getCa().getBalance() - money);
			return;
		}else	if(customer.getSa() != null) {
					System.out.print("请输入想要取出的金额:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					if(customer.getSa().getBalance() < money) {
						System.out.println("账户中余额不足!");
						return;
					}
					customer.getSa().setBalance(customer.getSa().getBalance() - money);
					return;
				}
		
	}

	public static void comsume(){
		if(customer == null) {
			System.out.println("请先开户!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("请输入将要消费的金额:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			if(customer.getCa().getBalance() + 1000 < money) {
				System.out.println("信用卡账户中可使用金额不足!");
				return;
			}else {
				customer.getCa().setBalance(customer.getCa().getBalance() - money);
				return;
			}
			
		}else	if(customer.getSa() != null) {
					System.out.print("请输入将要消费的金额:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					if(customer.getSa().getBalance() < money) {
						System.out.println("存储卡账户中余额不足!");
						return;
					}else {
						customer.getSa().setBalance(customer.getSa().getBalance() - money);
						return;
					}
			
				}
		
	}
	
	public static void repay(){
		if(customer == null) {
			System.out.println("请先开户!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("请输入想要还款的金额:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			customer.getCa().setBalance(customer.getCa().getBalance() + money);
			return;
		}else	if(customer.getSa() != null) {
					System.out.print("请输入想要还款的金额:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					customer.getSa().setBalance(customer.getSa().getBalance() + money);
					return;
				}
		
	}
	
	public static void settle(){
		if(customer == null) {
			System.out.println("请先开户!");
			return;
		}
		if(customer.getCa() != null) {
			System.out.println("信用卡正在进行结算!");
			customer.getCa().assessFee();
			System.out.println("信用卡结算成功!");
			return;
		}else	if(customer.getSa() != null) {
					System.out.println("存储卡正在进行结算!");
					customer.getSa().payinterest();
					System.out.println("存储卡结算成功!");
					return;
				}
		
	}
	
	public static void balance(){
		if(customer == null) {
			System.out.println("请先开户!");
			return;
		}
		if(customer.getCa() != null) {
			System.out.println("信用卡中的余额为:" + customer.getCa().getBalance());
			
		}else	if(customer.getSa() != null) {
					System.out.println("存储卡中的余额为:" + customer.getSa().getBalance());
			
				}
		
	}
	
	
}
