/*Ejercicio 8: Pedir un número N, y mostrar todos los números
del 1 al N */
import java.util.Scanner;
public class NumeroN
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		int N;

		System.out.print("Ingresa un numero..."); N = leer.nextInt();

		for(int i = 1; i <= N; i++)
		{
			if(i == N)
				System.out.print( i );
			else
			System.out.print(	i + " , " );
			
		}
	}
}