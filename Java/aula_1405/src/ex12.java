package aula08_05;

import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);

		int cdvd = 0;
		int cliente = 0;
		String tdvd;
		double locacao = 0;
		char valida;
		String resp;

		for (int i = 1; i < 10; i++) {


				System.out.println(i + "º Locaçao");
				System.out.println("Digite o seu código de cliente:");
				cliente = entrada.nextInt();

				System.out.println("Digite o seu código do DVD:");
				cdvd = entrada.nextInt();

				System.out.println("Digite o tipo do DVD:");
				tdvd = entrada.next().toUpperCase();

				if (cdvd >= 1 && cdvd <= 10) {

					switch (tdvd) {
					case "A":
						locacao = 8;
						break;
					case "C":
						locacao = 8;
						break;
					case "D":
						locacao = 10;
						break;
					}

				}

				else if (cdvd >= 11 && cdvd <= 20) {
					System.out.println("11 até 20");
					switch (tdvd) {
					case "A":
						System.out.println("Entrou na seçao A, meu jovem");
						break;
					case "C":
						System.out.println("Entrou na seçao C, meu jovem");
						break;
					case "D":
						System.out.println("Entrou na seçao D, meu jovem");
						break;
					}
				}
				System.out.println("Deseja continuar? (sim/nao)");
				valida = entrada.next().toUpperCase().charAt(0);
	//			while (!(valida == "S")) {
	//				System.out.println("nao");
	//				break;
	//			}
			}

	}

}
