import java.text.DecimalFormat;
import java.util.Scanner;

public class GustavoGotha_A {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formatamoeda = new DecimalFormat("R$ ###0.00");

		String resp = "sim";
		String respcomp = "sim";
		String nomecliente;
		String cp;
		int tipocomp = 0;
		int contador = 0;
		int modelo = 0;
		int qtdcomp = 0;
		int vlrmodelo = 0;
		int valortotal = 0;
		int valorfinal = 0;
		int valorfinal2 = 0;
		double agoravai = 0;
		int qtdparcelas = 0;
		int totalparcela = 0;

		while (resp.equalsIgnoreCase("sim")) {

			contador++;
			qtdcomp = 0;
			respcomp = "sim";
			valortotal = 0;

			System.out.println(contador + "º cliente");
			System.out.println("Nome do cliente:");
			nomecliente = entrada.next();

			while (respcomp.equalsIgnoreCase("sim")) {

				System.out.println("Digite o tipo do computador:");
				tipocomp = entrada.nextInt();

				switch (tipocomp) {
				case 0:
					System.out.println("Saindo das vendas...");
					break;
				case 1:

					System.out.println("Digite um modelo de processador:");
					System.out.println("I3 = 1");
					System.out.println("I5 = 2");
					System.out.println("I7 = 3");
					modelo = entrada.nextInt();

					if (modelo == 1) {
						qtdcomp++;
						vlrmodelo = 1801;
						valortotal += vlrmodelo;
						System.out.println("i3 " + vlrmodelo);
						System.out.println("valor total:" + valortotal);
					} else if (modelo == 2) {
						qtdcomp++;
						vlrmodelo = 2429;
						valortotal += vlrmodelo;
						System.out.println("i5 " + vlrmodelo);
						System.out.println("valor total:" + valortotal);
					} else if (modelo == 3) {
						qtdcomp++;
						vlrmodelo = 3150;
						valortotal += vlrmodelo;
						System.out.println("i7 " + vlrmodelo);
						System.out.println("valor total:" + valortotal);
					}
					break;
				case 2:
					System.out.println("Digite um modelo de processador:");
					modelo = entrada.nextInt();

					if (modelo == 1) {
						qtdcomp++;
						vlrmodelo = 1899;
						valortotal += vlrmodelo;
						System.out.println("i3 " + vlrmodelo);
						System.out.println("valor total:" + valortotal);
					} else if (modelo == 2) {
						qtdcomp++;
						vlrmodelo = 2799;
						valortotal += vlrmodelo;
						System.out.println("i5 " + vlrmodelo);
						System.out.println("valor total:" + valortotal);
					} else if (modelo == 3) {
						qtdcomp++;
						vlrmodelo = 3199;
						valortotal += vlrmodelo;
						System.out.println("i7 " + vlrmodelo);
						System.out.println("valor total:" + valortotal);
					}
					break;

				}

				System.out.println("Deseja cadastrar um novo computador?");
				respcomp = entrada.next();

			}

			System.out.println("O valor total de suas comprar foi de:" + "R$" + valortotal);
			System.out.println("Quantidade de computadores comprados:" + qtdcomp);

			System.out.println("Solicite a forma de pagamento 'V a vista' e 'P a prazo':");
			cp = entrada.next().toUpperCase();

			switch (cp) {
			case "V":
				if (qtdcomp >= 2) {
					valorfinal = valortotal;
					System.out.println("Valor final é:" + valorfinal);
					System.out.println(formatamoeda.format(valorfinal * 0.2) + " de desconto");
					agoravai = valorfinal - (valortotal * 0.2);
					System.out.println("Valor total da compra:" + agoravai);
				} else {
					valorfinal = valortotal;
					System.out.println(formatamoeda.format(valortotal * 0.1) + " de desconto");
					agoravai = valorfinal - (valortotal * 0.1);
					System.out.println("Valor total da compra:" + agoravai);

				}
				break;
			case "P":
				valorfinal = valortotal;
				System.out.println("A prazo");
				System.out.println(formatamoeda.format(valorfinal * 1.1) + " de acrescimo");
				agoravai = valorfinal - (valortotal * 1.1);
				System.out.println("Valor total da compra:" + agoravai);
				break;
			}

			System.out.println("Deseja realizar uma nova compra?");
			resp = entrada.next();

		}
	}

}


//Identificar maior e menor venda

//String nomeMaior, nomeMenor;
//double maiorVenda = 0, menorVenda = 0;

//if(maiorVenda == 0 && menorVenda == 0) {
//	maiorVenda = totalGeral;
//	nomeMaior = nome;
//	menorVenda = totalGeral;
//	nomeMenor = nome;
//
//}else {
//	if (totalGeral > maiorVenda) {
//		maiorVenda = totalGeral
//		nomeMaior = nome;
//	}
//	if (total < menorVenda) {
//		menorVenda = totalGeral;
//		nomeMenor = nome;
//	}
//}
//System.out.println("Maior venda" + maiorVenda + "- Cliente:" + nomeMaior);
//System.out.println("Menor venda" + maiorVenda + "- Cliente:" + nomeMenor);
