package Atividades;

/*Faça um algoritmo que solicite três notas de um determinado aluno. Calcule e mostre a média 
das notas desse aluno.* 
 */
import java.util.Scanner;
public class MediaNotas
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		float nota1, nota2, nota3, media;
		
		System.out.println("Digite a nota dos alunos em sequencia");
		nota1 = ler.nextFloat();
		nota2 = ler.nextFloat();
		nota3 = ler.nextFloat();
		
		media = (nota1+nota2+nota3)/3;
		
		System.out.println("A Media desse aluno é: " + media);
		
	}

}
