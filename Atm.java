// creating another package
package one;
//Extracting previous package
import javaexamples.*;


public class Atm {

	public static void main(String[] args) {
//creating object
		BankEx b=new BankEx();
// calling the methods in BankEx
		b.deposit(10000);
		b.Withdraw(500);
		b.Savings();
		
		

	}

}
