
public class assArr2 {
public static void main(String[] args) {
	int [] a = {1,4,3,4};
	int large = a[0];
	int small = a[0];
	for (int i = 0; i < a.length; i++) {
		if (a[i]>large) {
			large = a[i];
		}
		if (a[i]<small) {
			small = a[i];
			
		}
	}
	
	float sum = 0,count = 0; 
	for (int i = 0; i < a.length; i++) {
	if (a[i] == large || a[i] == small) {
		sum = sum + a[i];
		count++;
	}	
	}
	System.out.println(sum/count);
   }
}














