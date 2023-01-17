package AtividadesFor;
/*
 Elaborar um algoritmo que leia 5 valores inteiros. 
 O algoritmo não poderá aceitar o número zero. Mostrar
a. média dos valores pares
b. média dos valores impares
 */
import java.util.Scanner;
public class MediaForImparOuPar 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i, numero=0, mediaPar=0, mediaImpar=0, par=0, impar=0, somaPar=0, somaImpar=0;
		
		for	(i=0;i<5;i++) 
		{
			System.out.print("Insira um numero");
			numero = ler.nextInt();
			
			if(numero!=0) 
			{
				if(numero % 2 !=0) 
				{
					impar++;
					somaImpar+=numero;
					mediaImpar=somaImpar/impar;			
				}
				else 
				{
					par++;
					somaPar+=numero;
					mediaPar=somaPar/par;	
					
				}
	
			}
			else
				--i;
		}
		System.out.println("Numeros Pares:"+par);
		System.out.println("Numeros Impares: "+impar);
		System.out.println("Media de numeros Pares:"+ mediaPar);
		System.out.println("Media de numeros Impares: "+ mediaImpar);

	}

}
