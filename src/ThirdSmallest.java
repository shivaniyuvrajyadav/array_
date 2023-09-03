
public class ThirdSmallest {
public static void main(String[] args) {
	int [] a = {1,2,3,4,5};
	int small = Integer.MIN_VALUE;
	int tsmall = Integer.MAX_VALUE;
	for (int i = 0; i < a.length; i++) {
		if (a[i]<small) {
			tsmall = small;
			small = a[i];
			
		}
		else if (a[i] < tsmall && a[i] != small) {
            tsmall = a[i]; // Update tsmall with a new second smallest value
        }
				
	}
System.out.println(tsmall);
}
}
