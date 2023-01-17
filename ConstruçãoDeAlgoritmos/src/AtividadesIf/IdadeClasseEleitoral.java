package AtividadesIf;
/*
 Faça um algoritmo que leia a idade de uma pessoa e informe a sua classe eleitoral:
-não eleitor (abaixo de 16 anos)
-eleitor obrigatório ( entre 18 e 65 anos)
-eleitor facultativo ( entre 16 e 18 anos e maior de 65 anos)
 */

import java.util.Scanner;
public class IdadeClasseEleitoral 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Insira a idade abaixo:");
		idade = ler.nextInt();
		
		if(idade<16)
			System.out.println("NÃO ELEITOR");
		else if (idade>=18 && idade<=65)
			System.out.println("ELEITOR OBRIGATORIO");
		else 
			System.out.println("ELEITOR FACULTATIVO");	
		

	}

}
