package AtividadesIf;
/*
 Entrar com dois números e imprimi-los em ordem crescente (suponha números diferentes)
 */
import java.util.Scanner;
public class OrdemCrescente 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2;
		
		System.out.println("Insira Dois numeros abaixo:");
		numero1 = ler.nextInt();
		numero2 = ler.nextInt();
		
		if(numero1<numero2)
			System.out.println(numero1 +","+numero2);
		else if(numero1==numero2)
			System.out.println("Numeros Iguais");
		else
			System.out.println(numero2 +","+numero1);
		
	}

}