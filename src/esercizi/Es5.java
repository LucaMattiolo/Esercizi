package esercizi;

public class Es5 {

	public static void main(String[] args) {
		
		int matrice[][] = new int[6][6];
		int array[] = new int[6];
		int sum_righe = 0;
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				matrice[i][j]=(int)(Math.random()*10+1);
			}
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				sum_righe += matrice[i][j];
				array[i] = sum_righe;
			}
			sum_righe = 0;
		}
		
		boolean proprietà = false;
		for(int i=0;i<3;i++) {
			if(array[i]==array[(array.length-1)-i]) {
				proprietà = true;
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
