package seventh;

import java.util.*;
public class Account {
	private String name;
	private ArrayList<Object> transactions = new ArrayList<>();
	
	public int id = 0;
	public double balance = 0;
	public double rate = 0;
	public java.util.Date dateCreated;
	
	public Account() {
		Date dateCreated = new Date();
		this.dateCreated = dateCreated;
	}
	
	public Account(int id, double balance) {
		Date dateCreated = new Date();
		this.dateCreated = dateCreated;
		this.id = id;
		this.balance = balance;
		this.name = name;
	}
	
	public Account(String name, int id, double balance) {
		Date dateCreated = new Date();
		this.dateCreated = dateCreated;
		this.id = id;
		this.balance = balance;
		this.name = name;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public int getId() {
		return id;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public double getRate() {
		return rate;
	}
	
	public double getMrate() {
		return rate/12;
	}
	
	public String getDateCreated() {
		return dateCreated.toString();
	}
	
	public double withDraw(double withDraw) {
		Transaction withDrawTransacte=new Transaction('W', withDraw, (this.balance=this.balance-withDraw), "取款："+withDraw+"美元");
		transactions.add(withDrawTransacte.getDescription());
		
		return this.balance;
	}
	
	public double deposit(double deposit) {
		Transaction depositTransacte=new Transaction('D', deposit, (this.balance=this.balance+deposit), "存款："+deposit+"美元");
		transactions.add(depositTransacte.getDescription());
		
		return this.balance;
	}
	
	public String toString() {
		return "\n日期： "+getDateCreated()+"\n"+transactions.toString();
	}
}
