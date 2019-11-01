
import java.util.Scanner;

public class ex02_trabalhoLista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);

		int i, j;
		
		int matriz[][] = new int[4][4];
		
		
	    for (i = 0; i < 4; i++) {
	    	for (j = 0; j < 4; j++) {
	    		 if (i < j) {
	    			 matriz[i][j] = 2*i + 5*j + 1;
	    		 }
	    		 else if (i == j) {
	    			 matriz[i][j] = 2*i*i - 2;
	    		 }
	    		 else if (i > j) {
	    			 matriz[i][j] = 3*i*i - 2*j*j + 1;
	    		 }
	    	}

	     }
	    
	    for (i = 0; i < 4; i++) {
	    	for (j = 0; j < 4; j++) {
	    		System.out.print("\t" + matriz[i][j]);
	    	}
	    	System.out.print("\n");
	    }
	    
   	 System.out.println("soma elementos:" + somaElementos(matriz));
	}
	
	public static int somaElementos(int matriz[][]) {
		
		int i,j;
		int soma = 0;
		
	    for (i = 0; i < 4; i++) {
	    	for (j = 0; j < 4; j++) {
	    		soma = soma + matriz[i][j];
	    	}
	    }
		
		return (soma);
	}

}
