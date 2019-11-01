import java.util.Scanner;

public class ex01 {

	public static class Funcionarios {
		// TODO Auto-generated method stub
		public String nome;
		public String endereco;
		public String telefone;
		public float salario;
		public int idade;
	}
	
	public static void main(String args[]) {
		Scanner teclado = new Scanner(System.in);
		
		int i;
		
		Funcionarios[] colaboradores = new Funcionarios[3];
		
		for (i = 0; i < 2; i++) {
			
			colaboradores[i] = new Funcionarios();
			
			System.out.println((i+1) + "º Funcionario \t");
			System.out.println("Digite seu nome:");
			colaboradores[i].nome = teclado.nextLine(); //evita a duplicação na hora do input
			
			System.out.println("Digite seu endereco:");
			colaboradores[i].endereco = teclado.nextLine(); //evita a duplicação na hora do input
			
			System.out.println("Digite seu telefone:");
			colaboradores[i].telefone = teclado.nextLine(); //evita a duplicação na hora do input
			
			System.out.println("Digite seu salario:");
			colaboradores[i].salario = teclado.nextFloat();
			
			System.out.println("Digite sua idade:");
			colaboradores[i].idade = teclado.nextInt();
			teclado.nextLine(); //evita a duplicação na hora do input quando for rodar o segundo for
		}
		
		for (i = 0; i < 2; i++) {
			System.out.println(colaboradores[i].nome);
			System.out.println(colaboradores[i].endereco);
			System.out.println(colaboradores[i].telefone);
			System.out.println(colaboradores[i].salario);
			System.out.println(colaboradores[i].idade);
		}
		
	}

}

