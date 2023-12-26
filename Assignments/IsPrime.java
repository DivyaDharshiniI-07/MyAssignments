package week2.Assignments;

public class IsPrime {
	public static void main(String[] args) {
		int num=29,count=0;
		for (int i = 1; i <= num; i++) {
			if(num%i==0) {
				count = count+1;
				}
		}
			if(count>2) {
				System.out.println("Non Prime Number");
			}
		else {
		System.out.println("Prime Number");
		}
	}

}

/*int numb[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
for (int i = 0; i < numb.length; i++) {
	if(numb[i]%2==1) {
		System.out.println(numb[i]);
	}*/
	