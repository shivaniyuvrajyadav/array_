import java.util.Arrays;

public class InsertionSort {
public static void main(String[] args) {
int []	 a = {4,3,1,2,5};
System.out.println("before sorting "+Arrays.toString(a));
for (int i = 0; i < a.length; i++) {
	int j = i,temp= a[i];
	while (j>0 && a[j-1]>temp) {
		a[j] = a[j-1];
		j--;
	}
	a[j] = temp;
	
}
System.out.println("After sorting "+Arrays.toString(a) );
}
}
