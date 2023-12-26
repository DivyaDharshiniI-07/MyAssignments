package week2.Assignments;

public class RemoveDuplicatesInString {
	public static void main(String[] args) {
		
	
	String text = "We learn java basics as part of java sessions in java week1";		
	int count =1;
	String[] array1 = text.split("\\s+");
	for (int j = 0; j < array1.length; j++) {
		for (int i = j+1; i < array1.length; i++) {
			if(array1[j]==array1[i]) {
				System.out.println(array1[i]);
				count=count+1;
			}
			/*if(count>1) {
				
			}*/
		}
	
	}
	System.out.println(count);
}
}
