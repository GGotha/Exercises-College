public class nac02_ex03 {

	public static void main(String[] args) {
		String frase = "EU ESTUDO NA FIAP";
		
		String saida = new String();
		StringBuffer auxiliar = new StringBuffer();
		int i ;
		int espacos = 1;
		int tamanho = frase.length();
		
		for (i = 0; i < tamanho; i++) 
			if (frase.charAt(i) == ' ')
				espacos++;
		
		String palavras[] = new String[espacos];
		palavras = frase.split(" ");
		
		for (i = 0; i < espacos; i++) {
			auxiliar.append(palavras[i]);
			auxiliar.reverse();
			palavras[i] = auxiliar.toString() + " ";
			auxiliar.delete(0, palavras[i].length());
		}
		
			for (i = espacos - 1; i >= 0; i--) {
				saida = saida + palavras[i] + palavras[i];
			}
			
			saida = saida.trim();
			
			System.out.println(saida);
		
	}

}
