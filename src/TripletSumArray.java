
public class TripletSumArray {
public static void main(String[] args) {
int [] a = {2,7,4,0,9,5,1,3};
int sum = 6;

for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		for (int k = j+1; k < a.length; k++) {
			if (a[i]+a[j]+a[k]==sum) {
				System.out.println(a[i] + " " + a[j] + " "+ a[k]);
			}
		}
	}
}
}
}
