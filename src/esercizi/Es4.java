package esercizi;

public class Es4 {

	public static void main(String[] args) {
		
		int matrice[][] = new int[5][5];
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(i==j) {
					matrice[i][j] = 1;
				}
				else {
					matrice[i][j] = 0;
				}
			}
		}
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				System.out.print(matrice[i][j]+" ");
				}
			System.out.println();
		}

	}

}
