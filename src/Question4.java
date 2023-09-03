
public class Question4 {
public static void main(String[] args) {
	int [] a = {2,3,10,6,4,8,1};
	int max = 0,x = 0,y=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if (a[j]-a[i]>max) {
				max = a[j] - a[i];
				x = a[j];
				y  = a[i];
			}
		}
	}
	System.out.println(max);
	System.out.println(x);
	System.out.println(y);
}
}
