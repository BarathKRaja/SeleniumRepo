package week1.day1;

public class Mobile {

	public void makeCall() {
		String mobileModel = "Realme";
		float mobileWeight = 105.0f;
		System.out.println("Realme mobile - 105gms");
	}
	public void sendMsg() {
		boolean FullCharged =true;
		int mobileCost = 6000;
		System.out.println("Cost is 6K");
	}
	public static void main(String[] args) {
		Mobile specs = new Mobile();
		specs.makeCall();
		specs.sendMsg();
		System.out.println("This is my Mobile");
	}
}
