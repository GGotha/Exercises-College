import java.util.Scanner;

public class nac02_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String CPF;
		char digito_CHAR;
		int digito_INT;
		int DV1i, DV2i, DV1c, DV2c;
		int i;
		int peso, calculo;
		
		System.out.println("Digite seu CPF:");
		CPF = teclado.nextLine();
		CPF = CPF.replaceAll("[.-]", "");
		
		
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
			
			
		}
		int resto;
		resto = calculo % 11;
		if (resto < 2) {
			DV1c = 0;
		}
		else {
			DV1c = 11 - resto;
		}
		
		
		calculo = 0;
		peso = 11;
		
		for (i = 0; i < 10; i++) {
			digito_CHAR = CPF.charAt(i);
			digito_INT = Character.digit(digito_CHAR, 10);
			
		
			calculo = calculo + peso * digito_INT;
			peso--;
			
		}
		

		resto = calculo % 11;
		if (resto < 2) {
			DV2c = 0;
		}
		else {
			DV2c = 11 - resto;
		}

		
		if ((DV1c == DV1i) && (DV2c == Character.digit(CPF.charAt(10), 10))) {
			System.out.println("O CPF " + CPF + " é válido");
		}else {
			System.out.println("O CPF " + CPF + " é inválido");
		}
		
	}

}
