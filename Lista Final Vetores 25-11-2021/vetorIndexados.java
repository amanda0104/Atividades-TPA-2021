import java.util.Scanner;
public class vetorIndexados {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], b[], i;
		a = new int [11];
		
		System.out.print("\nVetor A [ ");
		for (i=0; i<11; i++) {
		
			a[i] = (int) Math.pow(2,i);
			System.out.print(a[i] + " ");
		}
		System.out.print(" ] ");
		
		}
	}
