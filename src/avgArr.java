import java.util.Scanner;

public class avgArr {
public static void main(String[] args) {
//	Scanner sc = new Scanner (System.in);
//	int a = sc.nextInt();
//	int[] n = new int [a];
//	int sum = 0;
//	while(n!=0) {
//		
//	}
	int [] a = {2,2,2,2,2};
	int sum = 0;
	for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
	}
	int avg = sum/a.length;
	int count =0;
	for (int i = 0; i < a.length; i++) {
		if (a[i]==avg) {
			count++;
		}
	}
	System.out.println(count);
}
}
