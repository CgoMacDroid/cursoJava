/*Ejercicio 9: Escribir todos los números del 100 al 0 de 7 en 7 */
import java.util.Scanner;
public class CienCero
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		for(int i = 100; i >= 0 ; i-=7)
		{
			System.out.println( i );
		}

	}
}