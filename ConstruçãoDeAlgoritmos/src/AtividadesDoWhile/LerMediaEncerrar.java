package AtividadesDoWhile;
/*
Faça um programa que leia X números e imprima a média destes números. A leitura se 
encerra quando o usuário digitar 0 (zero).
 */
import java.util.Scanner;
public class LerMediaEncerrar 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero=0, somaTotal=0, contNum=0;
		float media=0;
		
		do
		{	
			System.out.println("Insira um valor. Para Encerrar digite 0 ");
			numero = ler.nextInt();
			
			if(numero>0)
			{
				somaTotal+=numero;
				contNum++;
			}
		}
		while (numero!= 0);
				
		if(contNum>0)			
		media=(float)somaTotal/(float)contNum; //corrigir 
		
		System.out.println("A media dos numeros inseridos são: " +media);
	}

}
