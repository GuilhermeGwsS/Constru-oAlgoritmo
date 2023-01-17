package AtividadesWhile;
/*
Entrar com a idade de ´10 pessoas e imprimir:
a. O total de pessoas com menos de 21 anos;
b. O total de pessoas com mais de 50 anos.
 */
import java.util.Scanner;
public class IdadeMaiorOuMenor 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int i=0;
		int idade, idade21=0, idade50=0, nula=0;
		
		while(i<0) 
		{
			System.out.print("Insira um numero");
			idade = ler.nextInt();
						
			if(idade<21)
				idade21++;
			else if(idade>50)
				idade50 ++;
			else
				nula++;
				
			i++;
				
		}
		System.out.println("Menores de 21 anos: "+idade21);
		System.out.println("Maiores de 50 anos: "+idade21);
		System.out.println("Idades entre 21 e 50: "+nula);
	}

}
