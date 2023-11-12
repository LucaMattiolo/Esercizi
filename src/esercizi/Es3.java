package esercizi;

public class Es3 {

	public static void main(String[] args) {
		
		int matrice[][] = new int[10][10];
		
		
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				matrice[i][j] = (int)(Math.random()*10);
			}
		}
		
		int cont = 0;
		for(int i=0;i<10;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(matrice[i][j]+" ");
				if(matrice[i][j] == 0) {
					cont+=1;
				}
		    }
        System.out.println();
        }
		System.out.println("Lo zero è presente nella matrice " + cont + " volte");
		
	}
}
