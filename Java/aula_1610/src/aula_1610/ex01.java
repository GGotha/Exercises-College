package aula_1610;

import java.io.File;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		File arq = new File("C:\\R\\dados.txt");
		File dest = new File("D:\\dados2.txt"); 
		
		if (arq.renameTo(dest))
			System.out.println("Arquivo alterado com sucesso");
		else
			System.out.println("Erro na altera��o");
	}

}

//� colocado duas barras no path para n�o ser entendido como um caractere especial
//como \n, \t, mas na verdade o java ler� essas duas barras como apenas uma barra
