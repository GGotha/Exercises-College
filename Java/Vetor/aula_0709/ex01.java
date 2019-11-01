import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int vetor1[] = new int[2]; //vetor com 10 elementos
		int vetor2[] = new int[2]; //vetor com 10 elementos
		int vetorI[] = new int[4]; //vetor indice intercalação 20 elementos 1 + 2
		int i, j;
		
		j = 0;
		try {
			for (i = 0; i < vetor1.length; i++) {
				System.out.print("Digite o " + (i + 1) + "º número do vetor1: ");
				vetor1[i] = teclado.nextInt();
				vetorI[j] = vetor1[i];
				System.out.print("i vetor1:" + i);
				System.out.print("j vetor2:" + j);
				j++;
				System.out.print("Digite o " + (i + 1) + "º número do vetor2: ");
				vetor2[i] = teclado.nextInt();
				vetorI[j] = vetor2[i];
				j++;
			}
			
			System.out.print("\nvetor1:\t\t");
			for(i = 0; i < vetor1.length; i++) {
				System.out.print(vetor1[i] + ",");
			}
			System.out.print("\nvetor2:\t\t");
			for(i = 0; i < vetor2.length; i++) {
				System.out.print(vetor2[i] + ",");
			}
			System.out.print("\nvetorI:\t\t");
			for(i = 0; i < vetorI.length; i++) {
				System.out.print(vetorI[i] + ",");
			}
		}
		catch (Exception e) {
			System.out.print(e);
		}
		teclado.close();
		
		
	}

}
