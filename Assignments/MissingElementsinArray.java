package week2.Assignments;

import java.util.Arrays;

public class MissingElementsinArray {
public static void main(String[] args) {
	int[] arr= {1,2,3,4,7,6,8};
	//method 1(this method work for the numbers between 1-9)
	Arrays.sort(arr);
	System.out.println(Arrays.toString(arr));
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]!=i+1) {
			System.out.println("Missing elements: " + i);
			break;
		}
		
	}
}
}
