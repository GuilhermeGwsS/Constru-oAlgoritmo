package AtividadesIf;

/*
 Entrar com um número e informar se ele é ou não divisível por 5.
 */
import java.util.Scanner;
public class DivisivelOuNão 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um número:");
		numero = ler.nextInt();
		
		if (numero % 5 == 0)
			System.out.println("Divisivel por 5");
		else 
			System.out.println("Numero Não é divisivel por 5");
		
	}

}
