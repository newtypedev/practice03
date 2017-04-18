package prob05;

public class Account {
	
	private String accountNo;
	private int balance;
	
	public Account(String accountNo){
		this.accountNo = accountNo;
		balance =0;
	}
	public String getAccountNo(){
		return this.accountNo;
	}
	public int getBalance(){
		return this.balance;
	}
	public void save(int money){
		this.balance =+ money;
	}
	public void deposit(int money){
		this.balance =this.balance - money;
		
	}
}
