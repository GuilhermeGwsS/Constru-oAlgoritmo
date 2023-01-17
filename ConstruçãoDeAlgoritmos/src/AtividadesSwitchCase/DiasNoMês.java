package AtividadesSwitchCase;
/*
 Faça um algoritmo que receba o número do mês e informe (imprima) se o mês informado 
tem:
 28/29 dias
 30 dias
 31 dias
 Mês inválido
Use: O switch – case.
 */
import java.util.Scanner;
public class DiasNoMês 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero;
		
		System.out.println("Insira o numero do mês desejado:");
		numero = ler.nextInt();
		
		switch(numero) 
		{
			case 1:
				System.out.println("Janeiro de 2023 tem 31 dias");
			break;
			case 2:
				System.out.println("Fevereiro de 2023 tem 28 dias");
				break;
			case 3:
				System.out.println("Março de 2023 tem 31 dias");
				break;
			case 4:
				System.out.println("Abril de 2023 tem 30 dias");
				break;
			case 5:
				System.out.println("Maio de 2023 tem 31 dias");
				break;
			case 6:
				System.out.println("Junho de 2023 tem 30 dias");
				break;
			case 7:
				System.out.println("Julho de 2023 tem 31 dias");
				break;
			case 8:
				System.out.println("Agosto de 2023 tem 31 dias");
				break;
			case 9:
				System.out.println("Setembro de 2023 tem 30 dias");
				break;
			case 10:
				System.out.println("Outubro de 2023 tem 31 dias");
				break;
			case 11:
				System.out.println("Novembro de 2023 tem 30 dias");
				break;
			case 12:
				System.out.println("Dezembro de 2023 tem 31 dias");
				break;
			default:
				System.out.println("Esse mês não existe");
				break;
				
		}	
	}

}