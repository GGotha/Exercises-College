public class Mtz_Exe2v2
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
	    int mat[][], soma[];
	    int i, j;

	    mat = new int[3][4];
	    soma = new int[3];
	    
	    
	    for (i=0;i<3;i++)
	    	for (j=0;j<4;j++)
	    	{
	    		mat[i][j] = (int)(Math.ceil(10*Math.random()));
	    		System.out.println("mat["+i+"]["+j+"]= " + mat[i][j]);
	    	}

	    for (i=0;i<mat.length;i++)
	    	for (j=0;j<mat[0].length;j++)
	    		soma[i] = soma[i] + mat[i][j];

	    System.out.println();
	    for (i=0;i<soma.length;i++)
	    		System.out.println("soma["+i+"]= " + soma[i]);
	    
	    for (i=0;i<mat.length;i++)
	    	for (j=0;j<mat[0].length;j++)
	    		mat[i][j] = mat[i][j] * soma[i];

		System.out.println("\nMatriz Resultante:");
	    for (i=0;i<mat.length;i++)
	    {
	    	for (j=0;j<mat[0].length;j++)
	    		System.out.print("\t" + mat[i][j] + " ");
	    	System.out.println("");
	    }
	}
}
