package AtividadesIf;
/*
 Ler dois valores inteiros A e B. Se os valores forem iguais deverá se somar os dois, caso 
contrário multiplique A por B. Ao final do cálculo atribuir o valor à variável C e imprimir os 
valores das variáveis A, B e C.
 */
import java.util.Scanner;
public class MultiplicarOuSomar 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, soma, mult;
		
		System.out.println("Insira Dois numeros abaixo:");
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		
		soma = numero1 + numero2;
		mult = numero1 * numero2;
		
		if(numero1 == numero2) 
		{
			System.out.println("Primeiro numero inserido: " + numero1);
			System.out.println("Segundo numero inserido: " + numero2);
			System.out.println("Resultado da soma: " + soma);
		}
		else
		{
			System.out.println("Primeiro numero inserido: " + numero1);
			System.out.println("Segundo numero inserido: " + numero2);
			System.out.println("Resultado da multiplicação: " + soma);
		}
	

	}

}
