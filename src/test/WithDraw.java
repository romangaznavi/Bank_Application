package test;

public class WithDraw {
	public void wDraw(int amt) {
		System.out.println("Amount withdrawn "+ amt);
		System.out.println("Balance amount "+ (2000-amt));
		System.out.println("Transaction Completed");
	}
}
