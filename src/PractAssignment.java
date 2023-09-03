
public class PractAssignment {
public static void main(String[] args) {
	int [] a = {11,25,66,-4,77,55,-1 ,0};
	int count = 0;
	int num = -5;
	for (int i = 0; i < a.length; i++) {
		if (a[i]<num) {
			count++;
		}
		
	}
	System.out.println(count);
}
}
