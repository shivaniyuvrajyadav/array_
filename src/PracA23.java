  
public class PracA23 {
public static void main(String[] args) {
	int [] a = {12,34,45,9,8,90,3};
	int j = -1;
	for (int i = 0; i < a.length; i++) {
		if (a[i]%2==0) {
			j++;
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i] + " ");
	}
}
}
