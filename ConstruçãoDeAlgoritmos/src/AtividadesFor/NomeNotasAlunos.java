package AtividadesFor;
/*
 Faça um algoritmo que receba o nome e três notas de cada aluno. Serão 10 alunos.
Calcule e imprima:
 a média da classe
 a quantidade de alunos aprovados, isto é, com notas >= 60.0
 a quantidade de alunos reprovados, isto é, com notas < 60.0
 */
import java.util.Scanner;
public class NomeNotasAlunos 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		String nome;
		int i, aprovados=0,  reprovados=0;
		double nota1=0, nota2=0, nota3=0,  somaNotas=0 , mediaNotas=0;
		
		for(i=0;i<2;i++) 
		{
			ler = new Scanner(System.in);
			 
			System.out.println("Insira por gentileza seu nome: ");
			nome = ler.nextLine();
			
			new Scanner(System.in);
			
			System.out.println("Insira suas 3 notas: ");
			nota1 = ler.nextDouble();
			nota2 = ler.nextDouble();
			nota3 = ler.nextDouble();
			
			somaNotas+=nota1+nota2+nota3;
			mediaNotas=somaNotas/2;
			
			if ((nota1+nota2+nota3)>=60) 
			{
				aprovados++;				
			}
			else
			{	
				reprovados++;
			}	
			
			
		}
		System.out.println("Quantidade de alunos aprovados: "+aprovados);
		System.out.println("Quantidade de alunos reprovados: "+reprovados);
		System.out.println("Media das notas finais da turma: "+ mediaNotas);
	}

}
