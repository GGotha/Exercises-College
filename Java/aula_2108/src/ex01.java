import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado;
		teclado = new Scanner(System.in);
		int CPF[], i, multiplicador, soma, calculoSoma, restoDiv, DV1, DV2;
		CPF = new int[11];
		
		for(i = 0; i < 11; i++) {
			System.out.println("Informe o " + (i+1) + "º digito do CPF");
			CPF[i] = teclado.nextInt();
		}
		
		multiplicador = 10;
		soma = 0;
		
		for (i = 0; i < 9; i++) {
			soma = soma + multiplicador * CPF[i];
			multiplicador--;
			
		}
		
		restoDiv = soma % 11;
		System.out.println("restodiv:" + restoDiv);
		
		if(restoDiv < 2)
			DV1 = 0;
		else
			DV1 = 11 - restoDiv;
		
		
		for (i = 0; i < 10; i++) {
			soma = soma + multiplicador * CPF[i];
			multiplicador--;
			
		}
		
		restoDiv = soma % 11;
		
		
		if(restoDiv < 2)
			DV2 = 0;
		else
			DV2 = 11 - restoDiv;
		
		System.out.println(DV1);
		System.out.println(DV2);
		
		if ((DV1 == CPF[9]) && (DV2 == CPF[10]))
			System.out.println("CPF VÁLIDO!");
		else
			System.out.println("CPF INVÁLIDO!");

		System.out.print("O CPF ");
		for (i = 1; i < 12; i++)
		{
			System.out.print(CPF[i-1]);
			if (i % 9 == 0)
				System.out.print("-");
			else
				if (i % 3 == 0)
					System.out.print(".");
		}

		if ((DV1 == CPF[9]) && (DV2 == CPF[10]))
			System.out.print(" é VÁLIDO!");
		else
			System.out.print(" é INVÁLIDO!");

		teclado.close();
	}

}
