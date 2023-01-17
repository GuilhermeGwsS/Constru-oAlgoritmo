package AtividadesFor;
/*
Elaborar um algoritmo que mostre:
 a. quantidade de alunos com nota final acima de 70 pontos.
 b. quantidade de alunos com idade superior a 20 anos.
 c. média das notas finais da turma.
 Sabe-se que nessa turma há 30 pessoas. 
 */
import java.util.Scanner;
public class NotaIdadeMedia 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
	
		int i, idade=0, alunos70 = 0, idade20=0;
		double nota=0, mediaNotas=0, notasTotais=0;
		for	(i=0;i<30;i++) 
		{
			System.out.println("Insira sua idade:");
			idade = ler.nextInt();
			System.out.println("Insira sua nota:");
			nota = ler.nextDouble();
			
			if(nota>70) 
			{
				alunos70++;
			}
			if(idade>20)
			{
				idade20++;
			}
			notasTotais+=nota;
			mediaNotas=notasTotais/5;
		}
		System.out.println("Alunos com notas acima de 70 pontos: "+alunos70);
		System.out.println("Alunos com idade acima de 20 anos: "+idade20);
		System.out.println("Media das notas finais da turma: "+ mediaNotas);

	}
}