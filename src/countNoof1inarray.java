//wap to count how many 1 are present in all the elements of array.
public class countNoof1inarray {
public static void main(String[] args) {
	int [] a = {5,15,3,21,114,61};
	int totalOneCount = 0;
	
	for (int i = 0; i < a.length; i++) {
		
        int count = 0;
		while(a[i]!=0) {
			 int d = a[i] % 10;
             if (d == 1) {
                 count++;
             }
             a[i] /= 10;
         }
		totalOneCount += count;
		
	}
	System.out.println("Total count of digit 1 in the array: " + totalOneCount);
	
	
}
}
