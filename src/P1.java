import java.util.Scanner;


public class P1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int n = sc.nextInt();
		int [] a = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println("enter elements ");
			a[i] = sc.nextInt();
		}
	
	for(int i =0;i<a.length;i++) {
		System.out.println(a[i]);
	}
}
}
