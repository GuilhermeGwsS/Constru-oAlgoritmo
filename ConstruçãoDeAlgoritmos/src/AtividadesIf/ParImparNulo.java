package AtividadesIf;
/*
Ler um número e imprimir se ele é par, impar ou nulo. – usar o mod (resto da divisão) - % 
 */

import java.util.Scanner;
public class ParImparNulo 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um número:");
		numero = ler.nextInt();
		
		if (numero == 0)
			System.out.println("NULO");
		else if (numero % 2 == 0)
			System.out.println("PAR");
		else
			System.out.println("Impar");

	}

}
