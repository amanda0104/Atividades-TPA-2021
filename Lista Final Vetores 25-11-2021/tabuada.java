import java.util.Scanner;
public class tabuada {
   public static void main(String[] args) {
	   int n = 5;
	   int a[] = new int[n], i, j;
	   
	   for (i=0; i<n; i++) {
		   a[i] = (int)Math.round(Math.random() * 10); 
	   }
	   
	   for (i=0; i<n; i++) {
		   System.out.printf("Imprima a tabuada %n", (i+1), n);
		   
		   for (j=1; j<10; j++) {
			   System.out.printf("%d X %2d = %d\n", a[i], j, (a[i]*j));
		   }
	   }
   }
}
