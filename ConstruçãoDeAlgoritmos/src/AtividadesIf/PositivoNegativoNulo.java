package AtividadesIf;

/*
 Ler um número e imprimir se ele é positivo, negativo ou nulo.
 */

import java.util.Scanner;
public class PositivoNegativoNulo 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira um número:");
		numero = ler.nextInt();
		
		if (numero>0)
			System.out.println("POSITIVO:");	
		else if (numero==0)
			System.out.println("NULO:");
		else 
			System.out.println("NEGATIVO:");

	}

}
