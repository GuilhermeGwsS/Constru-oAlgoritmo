package AtividadesIf;

/*
 Escreva um algoritmo que, dada a idade de um nadador, classifique-o em uma das 
seguintes categorias:

5 a 12 Infantil
13 a 17 Juvenil 
18 a 25 Profissional
Demais Fora da Faixa
 */
import java.util.Scanner;
public class IdadeCartegoria 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Insira a idade do nadador:");
		idade = ler.nextInt();
		
		if(idade>=5 && idade<=12)
			System.out.println("Infantil");
		else if (idade>=13 && idade<=17)
			System.out.println("Juvenil");
		else if (idade>=18 && idade<=25)
			System.out.println("Profissional");
		else 
		System.out.println("Fora Da Faixa de Idade");	
	}

}
