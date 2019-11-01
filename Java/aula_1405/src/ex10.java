package aula08_05;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		DecimalFormat fM = new DecimalFormat ("R$ ###0.00");
		
		
		String resp = "sim";
		double pe = 0, total = 0, valorFinal = 0, totalGeral = 0;
		int cp = 0, cont = 1, qtdItens = 0;
		
		
		while (resp.equalsIgnoreCase("sim")) {
			total = 0;
			qtdItens = 0;
			System.out.println(cont + "º Compra");
			
			
			System.out.println("Digite Preço Etiqueta:");
			pe = entrada.nextDouble();
			
			while (pe != 0) {
				//somar qtd
				qtdItens++;
				
				//soma o valor das etiquetas
				total += pe;
				
				System.out.println("Digite Preço Etiqueta:");
				pe = entrada.nextDouble();
				
				
			}
			System.out.println("Valor da Compra:" + fM.format(total));
			System.out.println("Quantidade de Itens:" + qtdItens);
			
			System.out.println("Digite a forma de pagamento:");
			cp = entrada.nextInt();
			
			while (cp < 1 || cp > 4) {
				System.out.println("Digite a forma de pagamento:");
				cp = entrada.nextInt();
			}
			
			if (cp == 1) {
				valorFinal = total * 0.9;
				System.out.println("Pagamento:" + fM.format(valorFinal));
			} 
			else if (cp == 2) {
				valorFinal = total * 0.95;
				System.out.println("Pagamento:" + fM.format(valorFinal));
			}
			else if (cp == 3) {
				valorFinal = total /2;
				System.out.println("Pagamento 2X:" + fM.format(valorFinal));
			}
			else {
				valorFinal = (total *1.1) / 3;
				System.out.println("Pagamento 3X:" + fM.format(valorFinal));
			}
			
			
			
			System.out.println("Deseja cadastrar nova compra?");
			resp = entrada.next();
			
			//Liçao de casa / CRIAR VALIDAÇÃO SIM OU NÃO
			
			cont++;
		}
		
		
	}

}