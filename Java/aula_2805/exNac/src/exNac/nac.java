package exNac;

import java.util.Scanner;

public class nac {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		int respprodutos = 0;
		String resp = "sim";
		int contador = 0;
		String nome;
		int produto = 0;
		int valor = 0;
		double valortotal = 0;
		char cp = 0;
		int valorfinal = 0;
		double desconto = 0;
		double descontofinal = 0;
		
		
		while (resp.equalsIgnoreCase("sim")) {
			contador++;
			valortotal = 0;
			
			System.out.println(contador + "º Venda");
			
			System.out.println("Digite o nome do cliente:");
			nome = entrada.next();
			
			System.out.println("Digite o código do produto:");
			produto = entrada.nextInt();
			
			while (produto != 0) {
			
			System.out.println("Digite o valor do produto:");
			valor = entrada.nextInt();
			
			System.out.println("Digite o código do produto:");
			produto = entrada.nextInt();
			
			valortotal += valor;
			
			}
			

			System.out.println("valor total da sua compra é:" + valortotal);
			
			
			System.out.println("Digite o tipo de pagamento:");
			cp = entrada.next().toUpperCase().charAt(0);
			
			switch (cp) {
			case 'V':
				desconto = valortotal * 0.07;
				
				System.out.println("Valor total:" + (valortotal - desconto));
				break;
			case 'P':
				System.out.println("P");
				break;
			}
			
			
			System.out.println("Deseja continuar?");
			resp = entrada.next();
		}
		


	}

}
