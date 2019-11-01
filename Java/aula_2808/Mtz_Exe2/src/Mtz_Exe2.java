import java.util.Scanner;

public class Mtz_Exe2 {

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
	    int mat[][], soma[];
	    int i, j;

	    mat = new int[3][4];
	    soma = new int[3];

	    for (i=0;i<3;i++)
	    	for (j=0;j<4;j++)
	    	{
	    		System.out.print("Digite o elemento da linha " + (i+1) + " com a coluna " + (j+1) + " da matriz: ");
	    		mat[i][j] = teclado.nextInt();
	    	}

	    System.out.println();
	    for (i=0;i<3;i++)
	    	for (j=0;j<4;j++)
	    		System.out.println("mat[" + i + "][" + j + "]= " + mat[i][j]);

	    for (i=0;i<3;i++)
	    {
	    	soma[i] = 0;
	    	for (j=0;j<4;j++)
	    		soma[i] = soma[i] + mat[i][j];
	    }

	    System.out.println();
	    for (i=0;i<3;i++)
    		System.out.println("soma[" + i + "]= " + soma[i]);

	    for (i=0;i<3;i++)
	    	for (j=0;j<4;j++)
	    		mat[i][j] = mat[i][j] * soma[i];

		System.out.println("\nMatriz Resultante:");
	    for (i=0;i<3;i++)
	    {
	    	for (j=0;j<4;j++)
	    		System.out.print("\t" + mat[i][j] + " ");
	    	System.out.println("");
	    }

	    teclado.close();
	}
}
