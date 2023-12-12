package week1.day1;

public class Mobile {
	public static void main(String[] args) {
		System.out.println("Mobile Actions:");
		Mobile phone=new Mobile();
		phone.sendMessage();
		phone.shareDocument();
		phone.makeCall();
		phone.statusPrivacy();
	}
	public void sendMessage() {
		System.out.println("Message delevired");
	}
     public void shareDocument() {
    	 System.out.println("Share the Documents");
     }
     public void makeCall() {
    	 System.out.println("Call Declined");
     }
     public void statusPrivacy() {
    	 System.out.println("Hide the unwanted contacts");
     }
}
