package aula08_05;

import java.util.Scanner;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner (System.in);
		
		int num = 0;
		int numMenor = 0;
		int numMaior = 0;
		String nomeMaior, nomeMenor, nome;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite um número:");
			num = entrada.nextInt();		
		
		if (num > numMaior) {
			numMaior = num;
		}
		
		if (num < numMaior) {
			numMaior = num;
		}
		
	}
		
		System.out.println("Maior Número:" + numMaior);
		System.out.println("Menor Número:" + numMenor);
		
		
	}

}
