import java.util.Scanner;

public class nac02_ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		String nome = "Gustavo Henrique Gotha Ferrer";	//Ferrer, G. H. G.
		StringBuffer aux = new StringBuffer();
		String saida;
		
		int i;
		int tamanho = nome.length();
		int espacos = 1;
		
		for (i = 0; i < tamanho; i++) {
			if (nome.charAt(i) == ' ')
				espacos++;
		}
		
		String palavras[] = new String[espacos];
		palavras = nome.split(" ");
		
		saida = palavras[palavras.length-1] + ", ";
		
		for (i = 0; i < palavras.length - 1; i++) {
			saida = saida + palavras[i].charAt(0) + ". ";
		}

		saida = saida.trim();
		System.out.println(saida);
		
	
	}

}
