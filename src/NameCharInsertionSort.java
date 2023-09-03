import java.util.Arrays;

public class NameCharInsertionSort {
public static void main(String[] args) {
	char [] c = {'s','h','i','v','a','n','i'};
	for (char i = 0; i < c.length; i++) {
		char j = i,temp= c[i];
		while (j>0 && c[j-1]>temp) {
			c[j] = c[j-1];
			j--;
		}
		c[j] = temp;
		
	}
	System.out.println(Arrays.toString(c));
}
}
