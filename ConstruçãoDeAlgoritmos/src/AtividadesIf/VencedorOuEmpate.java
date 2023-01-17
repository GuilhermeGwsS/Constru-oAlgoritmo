package AtividadesIf;
/*
Ler o nome de 2 times e o número de gols marcados na partida (para cada time). Escrever 
o nome do vencedor. Caso não haja vencedor deverá ser impressa a palavra EMPATE*

 */
import java.util.Scanner;
public class VencedorOuEmpate 
{
	public static void main(String[] args) 
	{
		Scanner ler = new Scanner(System.in);
		
		String casa, visitante;
		int golCasa, golVisitante;
		
		System.out.println("Qual o nome do time da Casa?");
		casa = ler.nextLine();
		System.out.println("Quantos gols o time da Casa marcou?");
		golCasa = ler.nextInt();
		
		ler = new Scanner(System.in);
		
		System.out.println("Qual o nome do time Visitante?");
		visitante = ler.nextLine();
		System.out.println("Quantos gols o time Visitante marcou?");
		golVisitante = ler.nextInt();
		
		if (golCasa > golVisitante)
			System.out.println(casa + " Ganhou");
		else if (golCasa < golVisitante)
			System.out.println(visitante + " Ganhou");
		else 
			System.out.println("Empate");
			

	}

}
