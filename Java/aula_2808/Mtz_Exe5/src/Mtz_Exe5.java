public class Mtz_Exe5
{
	public static void main(String[] args)
	{
		int i, j, matriz[][], diagonal;
		matriz = new int[4][4];

		// recebe os elementos da matriz
		for (i=0;i<4;i++)
			for (j=0;j<4;j++)
			{
				matriz[i][j] = (int)(Math.floor(10*Math.random()));
				System.out.println("matriz[" + i + "][" + j + "]= " + matriz[i][j]);
			}

		for (i=0;i<4;i++)
		{
			diagonal = matriz[i][i];
			for (j=0;j<4;j++)
				matriz[i][j] = diagonal * matriz[i][j];
		}

		// exibe a nova matriz
		System.out.println("\nnova matriz:\n");
		for (i=0;i<4;i++)
		{
			for (j=0;j<4;j++)
				System.out.print("\t" + matriz[i][j] + " ");
			System.out.print("\n");
		}
	}
}
