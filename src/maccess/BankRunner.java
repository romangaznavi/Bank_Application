package maccess;

import java.util.*;
import test.*;

public class BankRunner {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i = 0;
		System.out.println("Enter the pinNo ");
		int pinNo = s.nextInt();
		CountDigits cd = new CountDigits();
		int count = cd.getCount(pinNo);
		if (count == 4) {
			CheckPinNo cpn = new CheckPinNo();
			boolean ver = cpn.verify(pinNo);
			if (ver) {
				System.out.println("Enter the amount ");
				int amt = s.nextInt();
				if (amt > 0 && amt % 100 == 0) {
					if (amt <= 2000) {
						WithDraw wd = new WithDraw();
						wd.wDraw(amt);
					} else {
						System.out.println("Insufficient Fund");
					}
				} else {
					System.out.println("Invalid Amount");
				}
			} else {
				for(int j = 1; j < 3; j++) {
					System.out.println("Incorrect PinNo, Please try again!");
					pinNo = s.nextInt();
				}
				System.out.println("System LOCKED!");
			}
		} else {
			System.out.println("Invalid PinNo");
		}

		s.close();
	}
}
