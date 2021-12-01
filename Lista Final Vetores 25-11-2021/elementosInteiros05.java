import java.util.Scanner;
public class elementosInteiros05 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i, c; 
		
		a = new int [5];
		b = new int [5];
		
		for (i=0; i<5; i++) {
			System.out.println("Digite o "+(i+1)+"° valor do fatorial A");
			a[i] = in.nextInt();
		}
		for (i=0; i<5; i++) {
			b[i] = 1;
			
			for (c=a[i];c>0;c--) {
				b[i] *=c;
			}
			
			if(a[i]==0) { b[i]=1; }
			
			System.out.println(a[i]+"! = "+b[i]);
		    }
		}
	}
