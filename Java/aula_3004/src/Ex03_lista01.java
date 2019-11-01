import java.text.DecimalFormat;
import java.util.Scanner;


public class Ex03_lista01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat formataNota = new DecimalFormat("#0.0");
		
		
		//var
		int contador = 0;
		int matricula = 0;
		int numAulas = 0;
		int contAp = 0;
		int contRep = 0;
		int contRepF = 0;
		
		double nota = 0;
		double somaNota = 0;
		double media = 0;
		
		String situacao;
		
		//repeticao alunos
		
		while(contador < 3) {
			System.out.print("Nº Matrícula:");
			matricula = entrada.nextInt();
			
			// repeticao notas
			for(int c = 0; c < 3; c++) {
				System.out.print((c+1) + "° Nota:");
				nota = entrada.nextDouble();
				somaNota += nota;
			}
			
			media = somaNota / 3;
			
			
			System.out.print("Numero de frenquencia:");
			numAulas = entrada.nextInt();
			
			
			//validaçao
			while(numAulas > 60) {
				System.out.println("Limite máximo de aulas excedido, tente novamente");
				numAulas = entrada.nextInt();
			}
			
			if (media >= 6 && numAulas >= 40) {
				contAp++;
				situacao = "aprovado";
			}
			else {
				contRep++;
				situacao = "reprovado";
			}

			 
			if(numAulas < 40) {
				contRepF++;
				
			}
			
			System.out.println("Matricula:" + matricula +
					" - Média:" + formataNota.format(media) +
					" - Situacao:" + situacao);
			
			somaNota = 0;
			
			contador++;
		
		}
		
		System.out.println("Numero de alunos aprovados:" + contAp);
		System.out.println("Numero de alunos reprovados:" + contRep);
		System.out.println("Numero de alunos retidos por frequencia:" + contRepF);


		
		
	}

}
