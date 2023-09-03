
public class AVgarr2 {
public static void main(String[] args) {
	int a[] = {1,4,3,2};
	int large = a[0];
	int small = a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>large) {
			large = a[i];
			
		}
	}
	for (int i = 0; i < a.length; i++) {
		if (a[i]<small) {
			small = a[i];
		}
	}
	
	float avg = 0F;
	
	for (int i = 0; i < a.length; i++) {
		float sum = large+small;
		avg = sum /2;
	}
	System.out.println(avg);
}
}
