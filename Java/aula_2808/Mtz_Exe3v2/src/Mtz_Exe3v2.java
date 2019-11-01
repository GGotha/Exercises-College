
public class Mtz_Exe3v2
{
	public static void main(String[] args)
	{
		int mat1[][], mat2[][];
		int i, j, qtde;

		mat1 = new int[4][3];
		mat2 = new int[4][3];
	  
		for (i=0;i<4;i++)
			for (j=0;j<3;j++)
				mat1[i][j] = (int)(Math.floor(10*Math.random()));

		qtde = 0;
		for (i=0;i<4;i++)
			for (j=0;j<3;j++)
				if (mat1[i][j] > 7)
					qtde++;

		for (i=0;i<4;i++)
			for (j=0;j<3;j++)
				mat2[i][j] = mat1[i][j];

		System.out.println("\nQuantidade de números maiores que 7 = " + qtde);

		System.out.println("\nMatriz Resultante:");
		for (i=0;i<4;i++)
		{
			for (j=0;j<3;j++)
				System.out.print("\t" + mat2[i][j] + " ");
			System.out.print("\n");
		}
	}
}
