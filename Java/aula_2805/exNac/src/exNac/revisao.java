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

		
		//Repeti��o Vendas
		while (respVenda.equalsIgnoreCase("Sim")) {
			
			cont++;
			System.out.println(cont+"� Venda");
			
			System.out.print("Informe o Nome do cliente: ");
			nome = teclado.next();
			
			//carrega vari�vel cod para fazer repeti��o de 
			//produtos funcionar
			System.out.print("Informe o Codigo do cliente: ");
			cod = teclado.nextInt();
			
			//N�o pode esquecer de zerzr vari�vel para pr�xima venda
			valorFinal=0;
			
			//Controla repeti��es produtos
			while (cod != 0) {
				
					System.out.print("Informe o Valor do produto: ");
					valor = teclado.nextDouble();
					
					//acumula os valores dos produtos
					valorFinal += valor;
				
					//solicita o cod para valiada��o da peti��o
					System.out.print("Informe o Codigo do cliente: ");
					cod = teclado.nextInt();
					
			}//fecha repeti��o
			
			System.out.println("valor da Compra:" + moeda.format(valorFinal));

			System.out.println("Qual � a forma de pagamento: ");
			System.out.println("V - A vista");
			System.out.println("P - A Prazo");
			pag = teclado.next().toUpperCase();
			
			//valida��o
			while (!pag.equalsIgnoreCase("v") && !pag.equalsIgnoreCase("p")) {
				System.out.println("Qual � a forma de pagamento: ");
				System.out.println("V - A vista");
				System.out.println("P - A Prazo");
				pag = teclado.next().toUpperCase();
			}

			if (pag.equalsIgnoreCase("v")) {
				valorFinal =  valorFinal * 0.85;
				System.out.println("O valor da compra foi de : " + moeda.format(valorFinal));
			} else {
				System.out.println("Informe o numero de parcelas (M�x. 10):");
				parc = teclado.nextInt();

				while (parc > 10) {
					System.out.println("Informe o numero de parcelas : (M�x. 10 )");
					parc = teclado.nextInt();
				}
				
				//Repeti��o utilizar parc que � uma vari�vel
				//carregada pelo usu�rio
				for (int i = 2; i <= parc; i++) {
					//aplica��o de 3% de juros
					valorFinal = valorFinal + (valorFinal * 0.03);
					//valorFinal *= 1.03;
					System.out.println("Em " + i + " Parcelas: " + moeda.format(valorFinal/ i));

				}
			}

			System.out.println("Deseja cadastrar nova venda? (Sim/N�o)");
			respVenda = teclado.next().toUpperCase();
			
			//valida��o
			while (!respVenda.equalsIgnoreCase("Sim") && !respVenda.equalsIgnoreCase("N�o")){
				System.out.println("Deseja cadastrar uma nova venda?");
				respVenda = teclado.next();
			}
			
		}//Fecha repeti�ao vendas
		
			System.out.println("O numero de vendas realizadas foi de :" + cont);
			
		

	}

}
