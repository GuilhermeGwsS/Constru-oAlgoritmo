package AtividadesSwitchCase;
/*
 Faça um algoritmo que receba o número correspondente a uma das opções abaixo e 
informe o valor do novo salário. Use: O switch – case.

Id da função Descrição da função Aumento
1 Gerente 30%
2 Vendedor 40%
3 Programador 50%
4 Motorista 60%
5 Vereador 0%
6 Deputado 0
 */

import java.util.Scanner;
public class NovoSalarioSwitch 
{

	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero;
		double salario, novoSalario;
		
		System.out.println("Escolha o numero conforme seu cargo:\r\n"
				+ "1 Gerente 30%\r\n"
				+ "2 Vendedor 40%\r\n"
				+ "3 Programador 50%\r\n"
				+ "4 Motorista 60%\r\n"
				+ "5 Vereador 0%\r\n"
				+ "6 Deputado 0"
				);		
		numero = ler.nextInt();
		System.out.println("Insira o valor do salario atual:");
		salario = ler.nextDouble();
	
		switch(numero) 
		{
			case 1:
				System.out.println((novoSalario = salario*0.30)+(salario));
			break;
			case 2:
				System.out.println((novoSalario = salario*0.40)+(salario));
				break;
			case 3:
				System.out.println((novoSalario = salario*0.50)+(salario));
				break;
			case 4:
				System.out.println((novoSalario = salario*0.60)+(salario));
				break;
			case 5:
				System.out.println((novoSalario = salario*1));
				break;
			case 6:
				System.out.println((novoSalario = salario*1));
				break;
			default:
				System.out.println("Esse Cargo não existe");
				break;
				
		}	
	}
}	