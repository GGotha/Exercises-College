package aula_1610;

import java.util.Scanner;

public class ex01_trabalhoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String CPF;
		char digito_CHAR;
		int digito_INT;
		int DV1i, DV2i, DV1c, DV2c;
		int i;
		int peso, calculo, somatorio, jacare;
		
		System.out.println("Digite seu CPF:");
		CPF = teclado.nextLine();
		
		digito_CHAR = CPF.charAt(9);
		DV1i = Character.digit(digito_CHAR, 10);
		digito_CHAR = CPF.charAt(10);
		DV2i = Character.digit(digito_CHAR, 10);
			
		
		peso = 10;
		calculo = 0;
		
		for (i = 0; i < 9; i++) {
		
			digito_CHAR = CPF.charAt(i);
			digito_INT = Character.digit(digito_CHAR, 10);
			
			
			calculo = calculo + peso * digito_INT;
			peso--;
			
			System.out.println("Calculo:" + calculo);
		}
		
		DV1c = calculo % 11;
		if (DV1c < 2) {
			DV1c = 0;
		}
		else {
			DV1c = 11 - DV1c;
		}
		
		calculo = 0;
		peso = 11;
		
		for (i = 0; i < 9; i++) {
			digito_CHAR = CPF.charAt(i);
			digito_INT = Character.digit(digito_CHAR, 10);
			calculo = calculo + peso * digito_INT;
			peso--;
		}
		
	}

}
