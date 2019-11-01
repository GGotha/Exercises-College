import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado;
		teclado = new Scanner(System.in);
		
		int Perfeitos[], i, soma, contador, N;
		Perfeitos = new int[3];
		
		
		contador = 0;
		N = 6;
		
		do {
			soma = 0;
			for (i = 1; i < N; i++)
				if(N%i == 0)
					soma = soma + i;
			
			if (soma == N )
				Perfeitos[contador] = N;
			
			N++;
		}while (contador < 3);
		System.out.println("Os 3ºs números perfeitos são: ");
		for(i = 0; i < 3; i++)
			System.out.println(Perfeitos[i] + ", ");

	}

}
