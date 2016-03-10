package base;
import java.util.Date;

public class Account {

	private int ID = 0;
	private double balance = 0;
	private static double annualInterestRate = 0;
	private Date dateCreated = new Date();
	
	public Account(){
	
	}
	
	public Account(int ID, double balance){
		setID(ID);
		setBalance(balance);
		
	}
	
	public int getID() {
		return ID;
	}

	private void setID(int iD) {
		this.ID = iD;
	}

	public double getBalance() {
		return balance;
	}

	private void setBalance(double balance) {
		this.balance = balance;
	}

	public Date getDateCreated() {
		return dateCreated;
	}
	
	public static double getAnnualInterestRate() {
		return annualInterestRate;
	}

	@SuppressWarnings("unused")
	private static void setAnnualInterestRate(double annualInterestRate) {
		Account.annualInterestRate = annualInterestRate;
	}

	public double withdraw(int drawn){
		double current = getBalance();
		this.balance = current - drawn;
		return drawn;
	}
	
	public void deposit(double d){
		double current = getBalance();
		this.balance = current + d;
	}
}
