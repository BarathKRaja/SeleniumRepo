package week1.day1;

public class Car {
	public void applyBreak() {
		System.out.println("Applied Break");
	}
	public void soundHorn() {
		System.out.println("Sound horn");
	}
	public static void main(String[] args) {
		Car features = new Car();
		features.applyBreak();
		features.soundHorn();
	}
	
}
