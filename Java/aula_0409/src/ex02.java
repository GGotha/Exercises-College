import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int a, b;
		int numeros;
		boolean r;
		int i;
		
		System.out.println("Digite o primeiro n�mero:");
			a = teclado.nextInt();
			System.out.println("Digite o segundo n�mero:");
			b = teclado.nextInt();
			
			r = getSoma(a, b);
			
			if (r == true) {
				System.out.println("A soma dos numeros sao:" + a+b);
			}else {
				System.out.println("N�o pode colocar n�meros negativos");
			}		
	}
	
	public static boolean getSoma(int a, int b) {
		if (a >= 0 && b >= 0) {
			return true;
		}else {
			return false;
		}
	}

}
