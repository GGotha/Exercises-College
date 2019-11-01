import java.util.Scanner;

public class ex_02_incompleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner (System.in);
		
		int dado[] = new int[10];
		int i, face1, face2, face3, face4, face5, face6;
		
		for (i = 0; i < dado.length; i++) {
			System.out.println("valor do i é:" + i);
			System.out.print("Digite o resultado da " + (i+1) + "º jogada do dado:");
			dado[i] = teclado.nextInt();
			while(dado[i] < 1 || dado[i] > 6) {
			 System.out.println("Valor inválido! Digite novamente da " + (i+1) + "º jogada do dado");
			 dado[i] = teclado.nextInt();
			}
		}
		
		face1 = 0;
		face2 = 0;
		face3 = 0;
		face4 = 0;
		face5 = 0;
		face6 = 0;
		
		for (i = 0; i < dado.length; i++) {
			switch(dado[i]) {
			case 1:
				face1++;
				break;
			case 2:
				face2++;
				break;
			case 3:
				face3++;
				break;
			case 4:
				face4++;
				break;
			case 5:
				face5++;
				break;
			case 6:
				face6++;
				break;
			}
		}
	}

}
