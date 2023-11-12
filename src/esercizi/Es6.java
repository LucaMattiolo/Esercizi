package esercizi;

public class Es6 {

	public static void main(String[] args) {


		int matrice[][] = new int[4][4];
		int array_righe[] = new int[4];
		int array_colonne[] = new int[4];
		int sum_colonne = 0;
		int sum_righe = 0;
		int max = 0;
		int cont = 0;
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				matrice[i][j] = (int)(Math.random()*10+1);
			}
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				sum_colonne += matrice[j][i];
				array_colonne[i] = sum_colonne;
			}
			sum_colonne = 0;
		}
		
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				sum_righe += matrice[i][j];
				array_righe[i] = sum_righe;
            }
			sum_righe = 0;
        }
		
		for(int i=0;i<array_colonne.length;i++) {
			System.out.println(array_colonne[i]+" ");
		}
		
		for(int i=0;i<array_righe.length;i++) {
			System.out.println(array_righe[i]+" ");
		}
		
	   
		
	   max = array_colonne[0];
	   for(int i=1;i<array_colonne.length;i++) {
		   if(array_colonne[i]>max) {
			   max = array_colonne[i];
			   cont = i;
		   }	 
	
	   }
	   System.out.println("La colonna con la somma più alta è quella con indice " +(cont));
	   
	   max = array_righe[0];
	   for(int i=1;i<array_righe.length;i++) {
		   if(array_righe[i]>max) {
			   max = array_righe[i];
			   cont = i;
		   }
		}
	   
	   if(max == array_righe[0]) {
		   System.out.println("La riga con la somma più alta è quella con indice 0");
	   }
	   else {
		   System.out.println("La riga con la somma più alta è quella con indice " +(cont));
		   
	   }
	   
	   }
}
