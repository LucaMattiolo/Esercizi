package esercizi;
import java.util.*;

public class Es8 {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int matrice[][] = new int[8][8];
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				matrice[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				System.out.print(matrice[i][j]+" ") ;
			}
			System.out.println();
		}
		
		boolean proprietà = true;
	    for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(matrice[i][j]!=(i+j)%2) {
					proprietà = false;
				}
			}
		}
	    
	    if(proprietà) {
	    	System.out.println("La matrice è una scacchiera");
	    }
	    else {
	    	System.out.println("Proprietà non verificata");
	    }

	}

}
