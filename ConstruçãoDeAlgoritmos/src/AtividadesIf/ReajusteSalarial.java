package AtividadesIf;
/*
Escreva um algoritmo que considere o reajuste salarial em determinada empresa de acordo 
com as condições abaixo:

-Salário inferior a 500,00 o reajuste será de 15%
-Salário igual ou acima de R$ 500,00 e até R$1000,00 o reajuste será de 10% 
-Salário acima de R$1000, 00 o reajuste será de 5%

Imprima o valor do reajuste e o valor do novo salário
 */
import java.util.Scanner;
public class ReajusteSalarial 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		 
		double salario;
		double reajuste1, reajuste2, reajuste3;
		double salarioNovo1, salarioNovo2,salarioNovo3; 
		
		System.out.println("Insira o salario:");
		salario = ler.nextDouble();
		
		reajuste1 = salario*0.15;
		reajuste2 = salario*0.10;
		reajuste3 = salario*0.05;
		
		salarioNovo1 = salario+reajuste1;
		salarioNovo2 = salario+reajuste2;
		salarioNovo3 = salario+reajuste3;
		
		if(salario<500)
			System.out.println("Valor do reajuste é de: " +reajuste1+" Salario: " + salarioNovo1);
		else if (salario>=500 && salario<=1000)
			System.out.println("Valor do reajuste é de: " + reajuste2+ " Salario: " + salarioNovo2);
		else 
			System.out.println("Valor do reajuste é de: " + reajuste3+ " Salario: " + salarioNovo3);


	}

}
