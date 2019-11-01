import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int numero;
		boolean r;
		boolean positivo;
		
		int i = 0;
		while (i == 10) {
			
		
		numero = teclado.nextInt();
		r = getParEimpar(numero);
		
		
		if (r == true) {
			System.out.println("positivo");
		}else {
			System.out.println("negativo");
		}

		}
	}
	
	public static boolean getParEimpar(int numero) {
		if (numero >= 0) {
			return true;
		}else {
			return false;
		}
	}

}
