package test;

public class WithDraw implements Tranasaction {

	@Override
	public void process(int amount) {
		if(amount<=b.bal)
		{
			System.out.println("amt withdraw :"+amount);
			b.bal=b.bal-amount;
			System.out.println("Balance amt:"+b.getBalance());
			System.out.println("Tranasaction Successful");
		}
		else
		{
			System.out.println("Invalid amount");
		}
		
	
	}

}
