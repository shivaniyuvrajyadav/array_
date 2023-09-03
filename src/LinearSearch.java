
public class LinearSearch {
public static void main(String[] args) {
	int [] a = {3,1,2,4,5};
	int search = 5;
	boolean flag = false; //element is not present
	for (int i = 0; i < a.length; i++) {
		if (a[i]==search) {
			System.out.println("thee element is  present at" + i);
			flag = true;
			break;
		}
	}
	if (flag==false) {
		System.out.println("the element is not present");
	}
}
}
