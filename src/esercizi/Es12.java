package esercizi;
import java.util.*;

public class Es12 {

	public static void main(String[] args) {
		
		int matrice[][] = new int[6][6];
		
		Scanner input = new Scanner(System.in);
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.println("["+i+","+j+"]"+":");
				matrice[i][j] = input.nextInt();
			}
		}
		
		boolean proprietà = false;
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				if(matrice[i][j]==0&i!=j || matrice[i][j]==1&i==j) {
					proprietà = true;
				}
			}
		}
		if(proprietà) {
			System.out.println("Proprietà verificata");
		}
		else {
			System.out.println("Proprietà non verificata");
		}
	

	}

}
