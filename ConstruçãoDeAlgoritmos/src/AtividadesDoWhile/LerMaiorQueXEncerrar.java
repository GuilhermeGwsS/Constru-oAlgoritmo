package AtividadesDoWhile;
/*
 Faça um programa que leia X números e faça a soma de todos os números maiores que 5 
e imprima a mesma. A leitura se encerra quando o usuário digitar 0 (zero)
 */
import java.util.Scanner;
public class LerMaiorQueXEncerrar 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero=0, somaTotal=0, contNum=0;
		double media=0;
		
		do
		{	
			System.out.println("Insira um valor acima de 5 para soma. Para Encerrar digite 0 ");
			numero = ler.nextInt();
			
			if(numero>5)
			{
				somaTotal+=numero;
				contNum++;
			}
		}
		while (numero!= 0);
		
		System.out.println("A Soma dos numeros inseridos são: " +somaTotal);
	}

}

