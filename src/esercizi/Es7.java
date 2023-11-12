package esercizi;
import java.util.*;

public class Es7 {

	public static void main(String[] args) {
		
		
		int matrice[][] = new int[5][5];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci due numeri interi(il secondo > del primo):");
		int n = input.nextInt();
		int m = input.nextInt();
		while(m<n) {
			System.out.println("Riprova");
			n = input.nextInt();
			m = input.nextInt();
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				matrice[i][j] = (int)(Math.random()*100+1);
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		
		int cont = 0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if((matrice[i][j]>n) & (matrice[i][j]<m)) {
					cont += 1;
				}
	        }
		}
		if (cont==0) {
			System.out.println("Proprietà non verificata");
		}
		else {
			System.out.println("Proprietà verificata");
		}

	}

}
