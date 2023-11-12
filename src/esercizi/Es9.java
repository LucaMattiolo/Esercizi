package esercizi;

public class Es9 {

	public static void main(String[] args) {
		
		
		int matrice[][] = new int[9][9];
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				matrice[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		
		int somma1 = 0;
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(i==j) {
					somma1 += matrice[i][j];
				}
			}
		}
		System.out.println(somma1);
		
		int somma2 = 0;
		for(int i=0;i<9;i++) {
			for(int j=8;j>-1;j--) {
				if(i+j==8) {
					somma2 += matrice[i][j];
				}
			}
		}
		System.out.println(somma2);
		
		if(somma1 == somma2) {
			System.out.println("La somma delle celle delle due diagonali è uguale");
		}
		else {
			System.out.println("La somma delle due diagonali non è uguale");
		}
		
	}

}
