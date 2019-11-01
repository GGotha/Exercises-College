package aula_1610;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		String jacare;
		
		System.out.println("Digite seu nome:");
		jacare = teclado.next();
		
		System.out.println("Charat:" + jacare.charAt(0));
		System.out.println("Charat:" + jacare.length());
	}

}
