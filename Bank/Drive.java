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
		System.out.println("��ӭ�ٴ�ʹ��ϵͳ!");

	}
	
	public static int menu(){
		int choice = 0;
		
		System.out.println("========Menu========");
		System.out.println("1.���� create��");
		System.out.println("2.��� save��");
		System.out.println("3.ȡ�� withdraw��");
		System.out.println("4.���� comsume��");
		System.out.println("5.���� repay��");
		System.out.println("6.���н��� settle��");
		System.out.println("7.��ѯ��� balance��");
		System.out.println("8.�˳� exit��");
		System.out.println("========�ָ���========");
		System.out.print("��ѡ��(1-8):");
		Scanner scan = new Scanner(System.in);
		choice = scan.nextInt();
		
		return choice;
	}
	
	public static int childmenu(){
		int choice = 0;
		
		System.out.println("=======ChildMenu=======");
		System.out.println("1.���ÿ� checkingAccount��");
		System.out.println("2.�洢�� savingsAccount��");
		System.out.println("3.���� exit��");
		System.out.println("=========�ָ���=========");
		System.out.print("��ѡ��1-3��:");
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
		System.out.print("���������֤��:");
		String ssn = scan.next();
		System.out.print("����������:");
		String name = scan.next(); 
		System.out.print("�����뿨��:");
		String accountNum = scan.next();
		System.out.print("����������:");
		float servicecharge = scan.nextFloat();

		CheckingAccount ca = new CheckingAccount(accountNum, 0, servicecharge);
		customer = new Customer(ssn, name, ca, null);
		
	}
	
	public static void createSavingsAccount(){
		Scanner scan = new Scanner(System.in);
		System.out.print("���������֤��:");
		String ssn = scan.next();
		System.out.print("����������:");
		String name = scan.next(); 
		System.out.print("�����뿨��:");
		String accountNum = scan.next();
		System.out.print("����������:");
		float interestRate = scan.nextFloat();

		SavingsAccount sa = new SavingsAccount(accountNum, 0, interestRate);
		customer = new Customer(ssn, name, null, sa);
		
	}
	
	public static void save(){
		if(customer == null) {
			System.out.println("���ȿ���!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("��������Ҫ����Ľ��:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			customer.getCa().setBalance(customer.getCa().getBalance() + money);
			return;
		}else	if(customer.getSa() != null) {
					System.out.print("��������Ҫ����Ľ��:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					customer.getSa().setBalance(customer.getSa().getBalance() + money);
					return;
				}

	}
	
	public static void withdraw(){
		if(customer == null) {
			System.out.println("���ȿ���!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("��������Ҫȡ���Ľ��:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			if(customer.getCa().getBalance() < money) {
				System.out.println("�˻�������!");
				return;
			}
			customer.getCa().setBalance(customer.getCa().getBalance() - money);
			return;
		}else	if(customer.getSa() != null) {
					System.out.print("��������Ҫȡ���Ľ��:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					if(customer.getSa().getBalance() < money) {
						System.out.println("�˻�������!");
						return;
					}
					customer.getSa().setBalance(customer.getSa().getBalance() - money);
					return;
				}
		
	}

	public static void comsume(){
		if(customer == null) {
			System.out.println("���ȿ���!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("�����뽫Ҫ���ѵĽ��:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			if(customer.getCa().getBalance() + 1000 < money) {
				System.out.println("���ÿ��˻��п�ʹ�ý���!");
				return;
			}else {
				customer.getCa().setBalance(customer.getCa().getBalance() - money);
				return;
			}
			
		}else	if(customer.getSa() != null) {
					System.out.print("�����뽫Ҫ���ѵĽ��:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					if(customer.getSa().getBalance() < money) {
						System.out.println("�洢���˻�������!");
						return;
					}else {
						customer.getSa().setBalance(customer.getSa().getBalance() - money);
						return;
					}
			
				}
		
	}
	
	public static void repay(){
		if(customer == null) {
			System.out.println("���ȿ���!");
			return;
		}
		
		float money = 0;
		
		if(customer.getCa() != null) {
			System.out.print("��������Ҫ����Ľ��:");
			Scanner scan = new Scanner(System.in);
			money = scan.nextFloat();
			customer.getCa().setBalance(customer.getCa().getBalance() + money);
			return;
		}else	if(customer.getSa() != null) {
					System.out.print("��������Ҫ����Ľ��:");
					Scanner scan = new Scanner(System.in);
					money = scan.nextFloat();
					customer.getSa().setBalance(customer.getSa().getBalance() + money);
					return;
				}
		
	}
	
	public static void settle(){
		if(customer == null) {
			System.out.println("���ȿ���!");
			return;
		}
		if(customer.getCa() != null) {
			System.out.println("���ÿ����ڽ��н���!");
			customer.getCa().assessFee();
			System.out.println("���ÿ�����ɹ�!");
			return;
		}else	if(customer.getSa() != null) {
					System.out.println("�洢�����ڽ��н���!");
					customer.getSa().payinterest();
					System.out.println("�洢������ɹ�!");
					return;
				}
		
	}
	
	public static void balance(){
		if(customer == null) {
			System.out.println("���ȿ���!");
			return;
		}
		if(customer.getCa() != null) {
			System.out.println("���ÿ��е����Ϊ:" + customer.getCa().getBalance());
			
		}else	if(customer.getSa() != null) {
					System.out.println("�洢���е����Ϊ:" + customer.getSa().getBalance());
			
				}
		
	}
	
	
}
