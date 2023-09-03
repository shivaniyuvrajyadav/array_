
public class SecondLarge {
public static void main(String[] args) {
	int [] a = {11,5,4,7,11,3,2};
	int large = Integer.MIN_VALUE;
	int slarge = Integer.MAX_VALUE;
	for (int i = 0; i < a.length; i++) {
		if (a[i]>large) {
			slarge = large;
			large = a[i];
		} else if(a[i]>slarge && large!= a[i]) {
			slarge = a[i];
			

		}
	}
	System.out.println("largest"+" " +large );
	System.out.println("second largest"+" " + slarge);
}
}
