import java.util.Scanner;
public class numerosPrimos {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, resto0=0, a[];
		a = new int[5];
		
		for (int j=0; j<5; j++) {
			resto0=0;
			
			System.out.println("Entre com um numero inteiro");
			a[j] = in.nextInt();
		
			for (i=1; i<=a[j]; i++) {
				if (a[j]%i == 0) {
					resto0++;
				}
			}

			if (resto0 > 2) {
				System.out.println("Não é primo");
			}else {
				System.out.println("É primo");
			}
		} 
	}
}
