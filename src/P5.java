
public class P5 {
	public static void main(String[] args) {
		int [] a = {2,1,4,3,5};
		int small = a[0];
		for (int i = 0; i < a.length; i++) {
			if(a[i]<small) {
				small = a[i];
			}
		}
		System.out.println(small);
	}
}
