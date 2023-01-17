package AtividadesWhile;
/*
 Criar um algoritmo que leia 10 números. Imprima quantos números são pares e quantos são
ímpares. O valor 0 (zero) deve ser desconsiderado.
 */
import java.util.Scanner;
public class QuantosParesOuImpares 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i=0;
		int numero, pares=0, impares=0, nula=0;
		
		while(i<10) 
		{
			System.out.print("Insira um numero");
			numero = ler.nextInt();
						
			if(numero % 2 != 0)
				impares++;
			else if(numero == 0)
				nula ++;
			else
				pares++;
				
			i++;
		}
		System.out.println("Pares: "+pares);
		System.out.println("Impares: "+impares);
		System.out.println("Nulos: "+nula);

	}
		
}
