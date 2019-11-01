import java.util.Scanner;

public class ex04_trabalhoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String nome = new String();
		String nREF = new String();
		int i, tamanho;
		
		System.out.println("informe seu nome completo:");
		nome = teclado.nextLine();
		nome = nome.replaceAll(" d[aeo]s", "");
		nome = nome.replaceAll(" d[aeo]", "");
		System.out.println("\n" + nome);
		tamanho = nome.length();
		
		for (i = tamanho - 1; i >= 0; i--) {
			
		}
		
	
	}

}
