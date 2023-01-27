package test;

public class CountDigits {
	public int getCount(int pinNo) {
		int count=0;
		while(pinNo != 0) {
			pinNo = pinNo / 10;
			count++;
		}
		return count;
	}
}
