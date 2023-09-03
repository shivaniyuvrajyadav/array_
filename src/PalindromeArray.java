
public class PalindromeArray {
public static void main(String[] args) {
	int [] a = {1,2,2,1};
	int [] b = new int[a.length];
	for (int i = 0,j=a.length-1; i < b.length; i++,j--) {
		b[i] = a[j];
		System.out.println(b[i]);
	}
	boolean flag = true; 
	for (int i = 0; i < b.length; i++) {
		if (a[i]!=b[i]) {
			flag = false;
			break;
		}
	}
	if (flag) {
		System.out.println("palindrome");
	}
	else {
		System.out.println("not palindrome");
	}
  }
}
