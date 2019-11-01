import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c;
		int r;
		
		do {
			System.out.println("Digite o valor de A (a > 1):");
			a = teclado.nextInt();
		}while (a <= 1);

		b = teclado.nextInt();
		c = teclado.nextInt();
		
		r = getSoma(a, b, c);
		
		System.out.println(r);
	}

	
	public static int getSoma(int a, int b, int c) {
		int aux, i, soma, resto;
		
		if (b > c) {
			aux = b;
			b = c;
			c = aux;
		}
		soma = 0;
		for (i = b; i <= c; i++) {
			resto = (i % a);
			if (resto == 0) {
				soma = soma + i;
			}

		}
		return soma;
}
	}
