package esercizi;
import java.util.*;
import java.math.*;

public class Es0 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int matrice[][] = new int[9][9];
		
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				matrice[i][j] = (int)(Math.random()*100+1);
			}
		}
		
		System.out.print("Inserisci un numero:");
		int n = input.nextInt();
		
		int cont = 0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(matrice[i][j]==n) {
					cont+=1;
				}
				
			}
		}
		if(cont>=1) {
			System.out.println("Il numero è presente nella matrice");
		}
		else {
			System.out.println("Il numero non è presente nella matrice");
		}

	}

}
