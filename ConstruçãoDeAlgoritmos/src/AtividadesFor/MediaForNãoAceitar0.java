package AtividadesFor;
/*
 Elaborar um algoritmo que leia 5 valores inteiros. 
 O algoritmo não poderá aceitar o número zero. Mostrar
a. média dos valores positivos
b. média dos valores negativos
 */
import java.util.Scanner;
public class MediaForNãoAceitar0 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i, numero=0, mediaPos=0, mediaNeg=0, positivo=0, negativo=0, somaPos=0, somaNeg=0;
		
		for	(i=0;i<5;i++) 
		{
			System.out.print("Insira um numero");
			numero = ler.nextInt();
			
			if(numero!=0) 
			{
				if(numero>0) 
				{
					positivo++;
					somaPos+=numero;
					mediaPos=somaPos/positivo;					
				}
				else 
				{
					negativo++;
					somaNeg+=numero;
					mediaNeg=somaNeg/negativo;
				}
	
			}
			else
				--i;
		}
		System.out.println("Numeros Positivo:"+positivo);
		System.out.println("Numeros negativo: "+negativo);
		System.out.println("Media de numeros positivo:"+ mediaPos);
		System.out.println("Media de numeros negativos: "+ mediaNeg);
	}

}
