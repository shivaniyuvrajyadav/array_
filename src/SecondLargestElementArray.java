
public class SecondLargestElementArray {
public static void main(String[] args) {
	int [] a = {5,10,20,4,8};
	int temp = 0;
	int size = a.length;
	for (int i = 0; i <size; i++) {
		for (int j = i+1; j <size; j++) {
			if (a[i]>a[j]) {
				temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				
			} 
		}
	}
	System.out.println(a[size-2]);
}

}
