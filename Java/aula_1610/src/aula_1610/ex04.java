package aula_1610;

import java.io.File;
import java.io.FileWriter;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cadeia;
		cadeia = "salve rapeize";

		try {
			File arq = new File("D:\\dados2.txt");
			FileWriter escritor = new FileWriter(arq);
			escritor.write(cadeia);
			escritor.close();
		}catch(Exception e) {
			System.out.println("Deu erro");
		}

	}

}
