class ProtectedDemo
{
	protected int var=20;
	protected void display()
	{
		System.out.println("This is a Protected Method");
		
	}
}
class ProtectedDemo1 extends ProtectedDemo
{
	int var1=30;
	void display1()
	{
		int var2=var+var1;
	
		System.out.println(" The value is"+var);
		System.out.println(" The value is"+var1);
		System.out.println(" The Addition value is"+var2);

	}

	}
	

public class ProtectedExample {

	public static void main(String[] args) {
		ProtectedDemo1 pd=new ProtectedDemo1();
		pd.display();
		pd.display1();

	}

}
