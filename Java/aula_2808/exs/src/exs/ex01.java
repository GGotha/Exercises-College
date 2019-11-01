package exs;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int matriz[][];
		int matrizResultado[][];
		int i, j;
		int maiorElemento;
		
		matriz = new int[2][2];
		matrizResultado = new int[2][2];
		
		
		
		for (i = 0; i < 2; i++) {
			for (j = 0; j < 2; j++) {
				System.out.println("Digite a " + i + "º Linha e a " + j +  "º coluna");
				matriz[i][j] = teclado.nextInt();	
			}
		}
			

			System.out.println("\nMatriz original (M[]):");
		     for (i=0;i<2;i++)
		     {
		    	 for (j=0;j<2;j++)
		    		 System.out.print("\t" + matriz[i][j] + " ");
		    	 System.out.println();
		     }
		     
		     maiorElemento = matriz[0][0];
		     for (i = 0; i < 2; i++) {
		    	 for (j = 0; j < 2; j++) {
		    		 if (matriz[i][j] > maiorElemento) {
		    			 maiorElemento = matriz[i][j];
		    		 }
		    	 }
		     }
			System.out.println("\nMaior elemento:" + maiorElemento);
			System.out.println("\nMatriz Resultado (M[]):");
			 
			 for (i = 0; i < 2; i++) {
				 for (j = 0; j < 2; j++) {
					 matrizResultado[i][j] = maiorElemento * matriz[i][j];

					 System.out.print("\t" + matrizResultado[i][j] + " ");	 
					 
				 }
				 System.out.println();

			 }

	}
}
