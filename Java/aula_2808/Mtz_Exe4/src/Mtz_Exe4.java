public class Mtz_Exe4
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int mat[][];
		int i, j, menorElemento, linhaMINMAX, colunaMINMAX, MINMAX;

		mat = new int[4][5];

		for (i=0;i<4;i++)
			for (j=0;j<5;j++)
				mat[i][j] = (int)(Math.floor(10*Math.random()));

	     System.out.println("\nMatriz MINMAX:");
	     for (i=0;i<4;i++)
	     {
	    	 for (j=0;j<5;j++)
	    		 System.out.print("\t" + mat[i][j] + " ");
	    	 System.out.println("");
	     }

	     menorElemento = mat[0][0];
	     linhaMINMAX = 0;
	     for (i=0;i<4;i++)
	    	 for (j=0;j<5;j++)
	    		 if (mat[i][j] < menorElemento)
	    		 {
	    			 menorElemento = mat[i][j];
	    			 linhaMINMAX = i;
	    		 }

	     MINMAX = mat[linhaMINMAX][0];
	     colunaMINMAX = 0;
	     for (j=0;j<5;j++)
	    	 if (mat[linhaMINMAX][j] > MINMAX)
	    	 {
	    		 MINMAX = mat[linhaMINMAX][j];
	    		 colunaMINMAX = j;
	    	 }

	     System.out.println("\nMINMAX = " + MINMAX + " (linha " + (linhaMINMAX+1) + " , coluna " + (colunaMINMAX+1) + ")");
	}
}
