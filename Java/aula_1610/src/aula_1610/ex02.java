package aula_1610;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File arq = new File("D:\\dados2.txt");
		long tamanho;
		
		tamanho = arq.length();
		System.out.println("tamanho do arquivo = " + tamanho + " bytes");
		
		long horaARQ = arq.lastModified();
		System.out.println("ultima atualizacao: " + horaARQ);
		
		Date data = new Date(arq.lastModified());
		System.out.println("ultima atualização: " + data);
		
		SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/YYYY HH:MM:SS");
		System.out.println("ultima atualização: " + dataFormatada.format(data));
	}

}
