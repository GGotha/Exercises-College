import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		
		double precofinal = 0;
		int qtdparcela = 0;
		double vlrparcela = 0;
		double vlrcarro = 0;
		String pagamento;
		
		
		while (qtdparcela == 0) {
			
			System.out.println("1- Crédito");
			System.out.println("2- A vista");
			pagamento = entrada.next();
			
			switch (pagamento) {
				case "1":
					System.out.println("Pagamento no credito");
					break;
				case "2":
					System.out.println("Pagamento a vista");
					break;
			}
			
			System.out.println("Digite o valor do carro:");
			vlrcarro = entrada.nextDouble();
			
			System.out.println("-----TABELA-----");
			System.out.println("QUANTIDADE DE PARCELAS / PERCENTUAL DE ACRÉSCIMO SOBRE O PREÇO FINAL");
			System.out.println("----------6-----------//-----------3%-----------");
			System.out.println("----------12----------//-----------6%-----------");
			System.out.println("----------18----------//-----------9%-----------");
			System.out.println("----------24----------//-----------12%----------");
			System.out.println("----------30----------//-----------15%----------");
			System.out.println("----------36----------//-----------18%----------");
			System.out.println("----------42----------//-----------21%----------");
			System.out.println("----------48----------//-----------24%----------");
			System.out.println("----------54----------//-----------27%----------");
			System.out.println("----------60----------//-----------30%----------");
			
		}
		
	}

}
