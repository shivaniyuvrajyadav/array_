
public class ArrayBinary {
public static void main(String[] args) {
	int [] a = {14,3,8,9};
	String bin = " ";
	for (int i = 0; i < a.length; i++) {
		int j = a[i];
		while (j!=0) {
			int d = j %2;
			bin = bin + d;
			j = j/2;
		}
		
				
	}
	System.out.println(bin);
	
	
	}
}
