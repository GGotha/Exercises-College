import java.util.Scanner;

public class ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		int nmcrianca = 0;
		int idade = 0;
		double meses = 0;
		char sexo;
		int sxfem = 0;
		int sxmasc = 0;
		double pmasc = 0;
		double pfem = 0;
		int totalsexo = 0;
		
		System.out.println("Digite o número de crianças nascidas no período:");
		nmcrianca = entrada.nextInt();
		
		for (int i = 0; i < nmcrianca; i++) {
		
		System.out.println("Digite seu sexo:");
		sexo = entrada.next().toUpperCase().charAt(0);
		
		switch (sexo) {
			case 'f':
			sxfem++;
			case 'm':
			sxmasc++;
	}

		
		System.out.println("Digite sua idade:");
		idade = entrada.nextInt();
		
		meses = (idade * 365) / 12;
		
		System.out.println("Meses vividos:" + meses);
		totalsexo = sxmasc + sxfem;
		System.out.println("Total de pessoas:" + totalsexo);
		System.out.println("Total de meninas" + sxfem);
		pfem = (double)(sxfem / totalsexo) * 100;
		}
		

		System.out.println("Porcentagem de meninas nascidas:" + pfem);

		System.out.println("Porcentagem de meninos nascidos:" + totalsexo / sxmasc);
	}

}
