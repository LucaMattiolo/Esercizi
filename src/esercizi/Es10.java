package esercizi;
import java.util.*;

public class Es10 {

	public static void main(String[] args) {
		
		
		int matrice[][] = new int[6][6];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.println("Inserisci numero nella cella " +"["+i+","+j+"]"+":");
				matrice[i][j] = input.nextInt();
			}
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(matrice[i][j]+ " ");
			}
			System.out.println();
		}
		
		boolean proprietà = true;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(matrice[i][j] != matrice[j][i]) {
					proprietà = false;
				}
			}
		}
		if(proprietà) {
			System.out.println("La matrice è simmetrica rispetto alla diagonale principale");
		}
		else {
			System.out.println("La matrice non è simmetrica rispetto alla diagonale principale");
		}

	}

}
