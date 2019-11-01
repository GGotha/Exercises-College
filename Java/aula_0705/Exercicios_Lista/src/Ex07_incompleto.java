import java.util.Scanner;

public class Ex07_incompleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner(System.in);
		
		
		double altura = 0;
		double peso = 0;
		int idade = 0;
		char olhos = 0;
		char cabelo = 0;
		int somaIdade = 0;
		int mediaIdade = 0;
		int qtdAzul = 0;
		
		
		for(int c = 1; c < 3; c++) {
		
			System.out.println(c + "º Pessoa");
			
			System.out.println("Digite sua altura:");
			altura = entrada.nextDouble();
				
			/* if (altura < 1.50) {
				mediaIdade++;
				System.out.println("Media das " + c / mediaIdade);
			}
			
			*/
			
			System.out.println("Digite sua peso:");
			peso = entrada.nextDouble();
			
			System.out.println("Digite sua idade:");
			idade = entrada.nextInt();
			
			if ((idade > 50) && (peso < 60)) {
				somaIdade++;
				System.out.println("Pessoas com idade superior a 50:" + somaIdade);
			}
			
			
			
			System.out.println("Digite a cor dos seus olhos:");
			olhos = entrada.next().toUpperCase().charAt(0);
			
			switch (olhos) {
			case 'A':
				System.out.println("Cor dos olhos a");
				qtdAzul++;
				break;
			case 'P':
				System.out.println("Cor dos olhos p");
				break;
			case 'V':
				System.out.println("Cor dos olhos v");
				break;
			case 'C':
				System.out.println("Cor dos olhos c");
				break;
		}
			
			System.out.println("Digite a cor do seu cabelo:");
			cabelo = entrada.next().toUpperCase().charAt(0);
			
			switch (cabelo) {
			case 'P':
				System.out.println("Cor do cabelo p");
				break;
			case 'C':
				System.out.println("Cor do cabelo c");
				break;
			case 'L':
				System.out.println("Cor do cabelo l");
				break;
			case 'R':
				System.out.println("Cor do cabelo r");
				break;
		}
		

			
			
			

		}
	}

}
