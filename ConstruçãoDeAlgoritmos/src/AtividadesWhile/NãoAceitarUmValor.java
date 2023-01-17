package AtividadesWhile;
/*
Elaborar um algoritmo que leia 15 valores inteiros. O algoritmo não poderá aceitar o numero
zero. Mostrar:
a. quantidade de números positivos
b. quantidade de números negativos
c. soma de todos os valores positivos
d. soma de todos os valores negativos
 */
import java.util.Scanner;
public class NãoAceitarUmValor {

		public static void main(String[] args) 
		{
			Scanner ler = new Scanner(System.in);
			
			int i=0;
			int numero=0, positivo=0, negativo=0, somapos=0, somaneg=0;
			
			while(i<5) 
			{
					System.out.print("Insira um numero diferente de 0:");
					numero = ler.nextInt();
					
					if(numero != 0) 
					{			
						if(numero>0)
							positivo++;
							else
							negativo++;
						
						somapos += numero;
						somaneg += numero;
					}
					
					i++;
				
			}
			System.out.println("Positivo: "+positivo);
			System.out.println("Negativo: "+negativo);
			System.out.println("Soma Positivos: "+somapos);
			System.out.println("Soma de Impares: "+somaneg);
		}
			
	}
