package week1.d1;

public class Mobile {

	public void sendSms() {
		System.out.println("SMS");
	}
	protected void allowVoiceCall() {
		System.out.println("allow Voice call");
	}
	private void takeVideo() {
		System.out.println("take a video");
	}
	public static void main(String[] args)
	{
		Mobile obj = new Mobile();
		obj.sendSms();
		obj.allowVoiceCall();
		obj.takeVideo();
		
		System.out.println("Mobile");
	}
}












/*week1.day1
Step 1:Create a class Mobile
Step 2:Create a method  public 1.sendSMS()
add simple syso
2.protected AllowVoiceCall()
3.private takeVideo()
Step 3:Create main method
Step 4:Create object for the Mobile class and call all the method 
Step 5:verify its printed  in console */