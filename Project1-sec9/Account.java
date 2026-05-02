package project;
import java.util.Scanner;
public class Account {
	
	private int id;
	private String name;
	private long phoneNo;
	private char accType;
	private double balance;
	
	public Account() {
		Scanner in=new Scanner(System.in);
		System.out.println("enter the ID:");
		this.id=in.nextInt();
		
		System.out.println("enter the Name:");
		this.name=in.next();
		
		System.out.println("enter the Phone number:");
		this.phoneNo=in.nextLong();
		
		System.out.println("enter the Account type:");
		this.accType=in.next().charAt(0);
		
		System.out.println("enter the Balance:");
		this.balance=in.nextDouble();
		
		System.out.println("\n\t\" the Account information is loaded \"");
		
	}
	
	
	public void setId(int id) {
		
		this.id=id;
	}
	
	public int getId() {
		
		return this.id;
	}
	
	public void setName(String name) {
		
		this.name=name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setPhoneNo(long phoneNo) {
		
		this.phoneNo=phoneNo;
	}
	
	public long getPhoneNo() {
		
		return this.phoneNo;
	}
	
	public void setAccType(char accType) {
		
		this.accType=accType;
	}
	
	public char getAccType() {
		
		return this.accType;
	}
	
	public void setBalance(double balance) {
		
		this.balance=balance;
	}
	
	public double getBalance() {
		
		return this.balance;
	}
	
	public String toString() {
		
		return "Account {" + "ID=" + id + ", Name=" + name + ",Phone number=" + phoneNo + ", Account type=" +accType+ ", Balance=" +balance+ "}";
	}
	
}
