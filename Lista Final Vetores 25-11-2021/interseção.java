import java.util.Scanner;
public class interseção {
	public static void main (String [] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], c[], i, z = 0 , TAM = 10;
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i = 0; i<a .length; i++) {
			System.out.println ("Digite o "+(i+1)+"° elemento do vetor A");
			a [i] = in.nextInt ();
		}
		System.out.println ("  ");
		
		for (i = 0; i<b .length; i++) {
			System.out.println ("Digite o " +(i+1)+ "° elemento do vetor B");
			b [i] = in.nextInt ();
		}
		
		System.out.print (" A  B = { ");
		for (i = 0; i<TAM; i++) {
			for (int j = 0; j<TAM; j++) {
				if (a [i] == b [j]) {
					c[z] = b [j];
					System.out.println(c [z] + "  ");
					z ++;
				}
			}
		}
		System.out.println (" } ");
	}
}
