package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class revisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		DecimalFormat moeda = new DecimalFormat("R$ ###0.00");
		
		double valor = 0, desc, valorFinal = 0;
		int v, cod = 1, parc=0, cont = 0;
		String nome, pag, respVenda = "Sim";

		
		//Repetição Vendas
		while (respVenda.equalsIgnoreCase("Sim")) {
			
			cont++;
			System.out.println(cont+"º Venda");
			
			System.out.print("Informe o Nome do cliente: ");
			nome = teclado.next();
			
			//carrega variável cod para fazer repetição de 
			//produtos funcionar
			System.out.print("Informe o Codigo do cliente: ");
			cod = teclado.nextInt();
			
			//Não pode esquecer de zerzr variável para próxima venda
			valorFinal=0;
			
			//Controla repetições produtos
			while (cod != 0) {
				
					System.out.print("Informe o Valor do produto: ");
					valor = teclado.nextDouble();
					
					//acumula os valores dos produtos
					valorFinal += valor;
				
					//solicita o cod para valiadação da petição
					System.out.print("Informe o Codigo do cliente: ");
					cod = teclado.nextInt();
					
			}//fecha repetição
			
			System.out.println("valor da Compra:" + moeda.format(valorFinal));

			System.out.println("Qual é a forma de pagamento: ");
			System.out.println("V - A vista");
			System.out.println("P - A Prazo");
			pag = teclado.next().toUpperCase();
			
			//validação
			while (!pag.equalsIgnoreCase("v") && !pag.equalsIgnoreCase("p")) {
				System.out.println("Qual é a forma de pagamento: ");
				System.out.println("V - A vista");
				System.out.println("P - A Prazo");
				pag = teclado.next().toUpperCase();
			}

			if (pag.equalsIgnoreCase("v")) {
				valorFinal =  valorFinal * 0.85;
				System.out.println("O valor da compra foi de : " + moeda.format(valorFinal));
			} else {
				System.out.println("Informe o numero de parcelas (Máx. 10):");
				parc = teclado.nextInt();

				while (parc > 10) {
					System.out.println("Informe o numero de parcelas : (Máx. 10 )");
					parc = teclado.nextInt();
				}
				
				//Repetição utilizar parc que é uma variável
				//carregada pelo usuário
				for (int i = 2; i <= parc; i++) {
					//aplicação de 3% de juros
					valorFinal = valorFinal + (valorFinal * 0.03);
					//valorFinal *= 1.03;
					System.out.println("Em " + i + " Parcelas: " + moeda.format(valorFinal/ i));

				}
			}

			System.out.println("Deseja cadastrar nova venda? (Sim/Não)");
			respVenda = teclado.next().toUpperCase();
			
			//validação
			while (!respVenda.equalsIgnoreCase("Sim") && !respVenda.equalsIgnoreCase("Não")){
				System.out.println("Deseja cadastrar uma nova venda?");
				respVenda = teclado.next();
			}
			
		}//Fecha repetiçao vendas
		
			System.out.println("O numero de vendas realizadas foi de :" + cont);
			
		

	}

}
