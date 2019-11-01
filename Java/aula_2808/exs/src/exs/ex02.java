package exs;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int matriz[][];
		int soma[];
		
		int i, j;
		
		matriz = new int[4][3];
		
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 3; j++) {
				System.out.println("Digite a " + (i+1) + "º linha e a " + (j+1) + "º coluna");
				matriz[i][j] = teclado.nextInt();
			}
		}
	}

}
