/* Dado un entero N, dibujar con asteriscos
la mitad derecha de una pirámide. Como sabes, las pirámides tienen la parte más pequeña en la punta y la más extensa en la base. */

import java.util.Scanner;
public class Piramide
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		//Numero de filas por mostrar
		int n,ast=1;

		System.out.print("Digita el numero de filas... "); n = leer.nextInt();
		

		for(int i = 1 ; i <= n; i++)//Encargado de los espacios y modificar la variable ast
		{	
			for(int j = 1; j <= ast; j++)
			{

				System.out.print("*");
			}
			
			System.out.println();
			ast += 1;	
		}
		
		
	}
}