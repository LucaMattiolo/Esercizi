package esercizi;
import java.util.*;

public class Es13 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int matrice[][] = new int[5][5];
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.println("["+i+","+j+"]"+":");
				matrice[i][j] = input.nextInt();
			}
		}
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		
		boolean proprietà = false;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(matrice[i][j]==i*j) {
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
