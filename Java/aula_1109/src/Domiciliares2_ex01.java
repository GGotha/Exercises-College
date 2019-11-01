import java.util.Scanner;

public class Domiciliares2_ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int i, j;
		
		int agenciaConta[] = new int[9];
		int soma = 0;
		int peso = 2;
		int mult;
		int modulo;
		int DV;
		
		for (i = 0; i < 9; i++) {
			System.out.println("Informe o " + (i+1) + "º digito da sua conta");
			
			agenciaConta[i] = teclado.nextInt();
			
			mult = agenciaConta[i] * peso;
			if (mult > 9)
				mult += -9;
			soma += mult;
			
			peso--;
			
			if (peso == 0)
				peso = 2;
			
			System.out.println(mult);
			System.out.println(soma);
			
		}
		

				
		modulo = soma % 10;
		
		System.out.println("Modulo:" + modulo);
		
		if (modulo > 0) {
			DV = 10 - modulo;
		}
		else {
			DV = 0;
		}
		
		System.out.println("Digito verif:" + DV);

		for (i = 0; i < 9; i++) {
			if (DV == agenciaConta[8]) {
				System.out.println("Conta válida");
			}else {
				System.out.println("Conta inválida");
			}
		}
		
	}

}
