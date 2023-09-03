import java.util.Scanner;

//average elements in the array
public class P2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter size of array");
	int n = sc.nextInt();
	int [] a = new int [n];
	for (int i = 0; i < n; i++) {
		System.out.println("enter elements ");
		a[i] = sc.nextInt();
	}
	int sum  = 0 ; 
//	float sum = 0.0f;
	for (int i = 0; i < a.length; i++) {
		sum = sum + a[i];
		
	}
//	float avg 
	int avg = sum/a.length;
	System.out.println(avg);
	
}
}
