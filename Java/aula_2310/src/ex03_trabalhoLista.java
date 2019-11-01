
public class ex03_trabalhoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frase = "EU ESTUDO NA FIAP";
		
		String saida = new String();
		StringBuffer aux = new StringBuffer();
		int i ;
		int espacos = 1;
		int tamanho = frase.length();
		
		for (i = 0; i < tamanho; i++) 
			if (frase.charAt(i) == ' ')
				espacos++;
		
		
		String palavras[] = new String[espacos];
		palavras = frase.split(" ");
		
		for (i = 0; i < espacos; i++) {
			aux.append(palavras[i]);
			aux.reverse();
			palavras[i] = aux.toString() + " ";
			aux.delete(0, palavras[i].length());
			
		}
		
			for (i = espacos - 1; i >= 0; i--) {
				saida = saida + palavras[i] + palavras[i];
			}
			
			saida = saida.trim();
			
			System.out.println(saida);
		
	}

}
