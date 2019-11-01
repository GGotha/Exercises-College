import java.util.Scanner;
public class Mtz_Exe1 {
	public static void main(String[] args) 	{
		 Scanner teclado = new Scanner(System.in);
		 int mat[][], resultado[][];
		 int i, j, maiorElemento;

		 mat = new int[2][2];
		 resultado = new int[2][2];

	     for (i=0;i<2;i++)
	    	 for (j=0;j<2;j++)
	    	 {
	    		 System.out.print("Digite o elemento da linha " + (i) + " e coluna " + (j) + ": ");
	    		 mat[i][j] = teclado.nextInt();
	    	 }

	     System.out.println("\nMatriz original (M[]):");
	     for (i=0;i<2;i++)
	     {
	    	 for (j=0;j<2;j++)
	    		 System.out.print("\t" + mat[i][j] + " ");
	    	 System.out.println();
	     }

	     maiorElemento = mat[0][0];
	     for (i=0;i<2;i++)
	    	 for (j=0;j<2;j++)
	    		 if (mat[i][j] > maiorElemento)
	    			 maiorElemento = mat[i][j];

	     System.out.println("\nmaior elemento= " + maiorElemento);

	     for (i=0;i<2;i++)
	    	 for (j=0;j<2;j++)
	    		 resultado[i][j] = maiorElemento * mat[i][j];

	     System.out.println("\nMatriz resultante (R[]):");
	     for (i=0;i<2;i++)
	     {
	    	 for (j=0;j<2;j++)
	    		 System.out.print("\t" + resultado[i][j] + " ");
	    	 System.out.println("");
	     }

	     teclado.close();
	}
}
