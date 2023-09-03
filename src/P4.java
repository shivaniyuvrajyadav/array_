
public class P4 {
public static void main(String[] args) {
	int [] a = {2,1,4,3,5};
	int large = a[0];
	for (int i = 0; i < a.length; i++) {
		if(a[i]>large) {
			large = a[i];
		}
	}
	System.out.println(large);
}
}
