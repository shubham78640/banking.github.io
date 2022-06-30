package abstraction;
import java.util.Scanner;

abstract class bank{
	public String Name="State Bank Of India";
	public String IFSC="SBIN0012345";
	
	public void bankDetail() {
		
		System.out.println("BankName-: " +Name+"IFSC-: "+IFSC);
	}
	abstract void Deposite();
	abstract void Withdraw();
	abstract void checkBal();
	
}

class bankService extends bank{
	private double bal=5000;
	private int pwd;
	private double money;
	
	public void Deposite() {
		System.out.println("Enter Your Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123) {
			System.out.println("enter Deposite Amount: ");
			money=s.nextDouble();
			bal=bal+money;
			System.out.println("Deposited Money: " + money);
            System.out.println("Totel Balance " +bal);
		}
		else {
			System.out.println("password is not correct");
		}
		
	}
	
	public void Withdraw() {
		System.out.println("Enter Your Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123) {
			System.out.println("enter Withdraw Amount: ");
			money=s.nextDouble();
			bal=bal-money;
			System.out.println("Withdraw Money: " + money);
            System.out.println("Totel Balance " +bal);
		}
		else {
			System.out.println("password is not correct");
		}
		
	}
	
	public void checkBal() {
		System.out.println("Enter Your Password");
		Scanner s=new Scanner(System.in);
		pwd=s.nextInt();
		
		if(pwd==123) {
			
            System.out.println("Totel Balance " +bal);
		}
		else {
			System.out.println("password is not correct");
		}
		
	}
}


public class abstraction {
	
	public static void main(String[] args) {
		bankService b = new bankService();
		b.bankDetail();
		
		int ch;
		System.out.println("Welcome to my bank ");
		System.out.println("press 1 for deposite and Press 2 for Withdraw ");
		System.out.println("Enter your Option ");
		Scanner s2= new Scanner(System.in);
		ch=s2.nextInt();
		
		switch (ch) {
		case 1: {
			b.Deposite();
			break;	
		}
        case 2: {
			b.Withdraw();
			break;	
		}
        case 3: {
			b.checkBal();
			break;	
		}
		default:
			System.out.println("Please enter correct number...");
		}
		
	}
	

}
