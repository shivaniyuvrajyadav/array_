import java.util.Arrays;

public class MergeTwoArray {
public static void main(String[] args) {
int a[]	 = {10,20,30,40,50};
int b [] = {9,18,27,36,45};
int c [] = new int[a.length+ b.length];
for (int i = 0; i < a.length; i++) {
	c[i] = a[i];
	
}
for (int i = a.length;  i<c.length; i++) {
	c[i] = b[i-a.length];
}
System.out.println(Arrays.toString(c));
}
}
