package test;

public class CheckPinNo {
	public boolean verify(int pinNo) {
		
		boolean k = false;
		switch(pinNo) {
		case 1111: k = true;
			break;
		case 2222: k=true;
			break;
		case 3333: k=true;
			break;
		}
		return k;
	}
}
