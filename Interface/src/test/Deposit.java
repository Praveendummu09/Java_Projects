package test;

public class Deposit implements Tranasaction {

	@Override
	public void process(int amount) {
		System.out.println("Amt Deposit"+amount);
		b.bal=b.bal+amount;
		System.out.println("Balance amt:"+b.getBalance());

		
	}

}
