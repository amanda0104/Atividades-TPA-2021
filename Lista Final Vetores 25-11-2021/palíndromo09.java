import java.util.Scanner;
public class pal�ndromo09 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a[], c=0;
		a = new int[10];
		boolean pal�ndromo = true;
		
		for (int i=0; i<a.length; i++) {
			System.out.println("Digite o "+(i+1)+"� n�mero");
			a[i] = in.nextInt();
		}
		
		for (int i=a.length-1; i>0;  i--) {
			if(a[i]==a[c]) {
				pal�ndromo = true;
		}
			else {
				pal�ndromo = false;
				break;
			}
			c++;
     }
		
		if (pal�ndromo) {
			System.out.println("O vetor � pal�ndromo.");
		}

		else {
			System.out.println("O vetor n�o � pal�ndromo.");
		}
	}
}