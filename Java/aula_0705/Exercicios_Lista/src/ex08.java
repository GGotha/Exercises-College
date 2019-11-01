import java.text.DecimalFormat;
import java.util.Scanner;

public class ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		DecimalFormat fM = new DecimalFormat("R$ ###0.00");
		
		int numParc = 0;
		double valInicial = 0, juros = 0, valParc = 0, total = 0, valJuros = 0;
		
		
		System.out.print("Informe o valor da dívida:");
		valInicial = entrada.nextDouble();
		
		numParc = 1;
		total = valInicial;
		valParc = valInicial;
		
		System.out.println("Total:" + fM.format(total) + " Juros" + juros + " Nº de parcelas:" + 
		numParc + " Valor da Parcela:" + fM.format(valParc));
		
		juros += 10;
		numParc += 2;
		
		for(int cont = 0; cont < 4; cont++) {
			
			valJuros = ((valInicial * juros) / 100);
			total = valInicial + valJuros;
			valParc = total / numParc;
			
						
			System.out.println("Total:"+fM.format(total)+ " Juros:" + juros + " Nº de parcelas:" + 
			numParc + " Valor da Parcela:" + fM.format(valParc));
			
			numParc += 3;
			juros += 5;
			
		}
	}

}
