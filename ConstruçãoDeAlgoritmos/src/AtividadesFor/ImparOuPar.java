package AtividadesFor;
/*
 Elaborar um algoritmo que leia 10 valores inteiros. 
 O algoritmo não poderá aceitar o número zero. Mostrar:
a. quantidade de números pares
b. quantidade de números impares
c. soma de todos os valores pares
d. soma de todos os valores impares
 */
import java.util.Scanner;
public class ImparOuPar 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i, numero=0, somaImpares=0,somaPares=0, pares = 0, impares=0;
		
		for(i=0;i<10;i++)
		{
			System.out.println("Insira 10 numeros, diferente de 0: ");
			numero=ler.nextInt();  
			
			if(numero!=0) 
			{
				if(numero%2 !=0)
				{
					impares++;
					somaImpares +=numero;
					
				}
					else
					{
						pares++;
						somaPares +=numero;
						
					}
			}	
			else 
				--i;
		}
			System.out.println("Numeros impares:"+impares);
			System.out.println("Numeros Pares: "+pares);
			System.out.println("Soma de numeros impares:"+somaImpares);
			System.out.println("Soma de numeros Pares: "+somaPares);
			
	}
}