//creating package 
package javaexamples;
public class BankEx
{
	protected  int amount; 
	private  int balance=1000;
	 public void deposit(int amount)
	{
//depositing amount
		balance=balance+amount;
		System.out.println("The Required amount is"+balance);
	}
	public void Withdraw(int amount)
	
	{
//With drawing amount
		balance=balance-amount;
		System.out.println("The REquired amount is"+balance);
		
	}
	public void Savings() {
//viewing our current bank balance 
		System.out.println("The required Saving amount is" +balance);
	}
	
}
