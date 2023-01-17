package AtividadesWhile;
/*
 ) Desenvolva um algoritmo que receba 5 números reais (double), calcule e mostre: a soma
total de todos os números digitados; a média de todos os números digitados; o dobro de
todos os números digitados.
 */
import java.util.Scanner;
public class SomaMediaDobroWhile 
{
	public static void main(String[] args) 
	{	
		Scanner ler = new Scanner(System.in);
		
		double soma=0, media, dobro, numero;
		int i = 0;
		
		while(i<5)
		{
			System.out.println("digite um numero real");
			numero = ler.nextDouble();	
			
			soma += numero;
			
			i++;
		}
		media = soma/5;
		dobro = soma*2;
		
		System.out.println("SOMA: "+soma);
		System.out.println("MEDIA: "+media);
		System.out.println("DOBRO: "+dobro);

	}

}
