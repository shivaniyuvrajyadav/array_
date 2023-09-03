
public class PraA2 {
public static void main(String[] args) {
	int a [] = {12,34,45,9,8,90,3};
	int [] b =  new int[a.length];
	int k =0;
	for (int i = 0; i < b.length; i++) {
		if (a[i]%2==0) {
			
			b[k] = a[i];
			
			k++;
						
		} 
	}

		for (int i = 0; i < b.length; i++) {
			if (a[i]%2!=0) {
				b[k] = a[i];
				k++;
			}
		}
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]);
		}
	  }
   }

