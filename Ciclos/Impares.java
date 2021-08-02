/* Ejercicio No. 11 : Diseñar un programa que muestre el producto de los 
10 primeros numeros imapres 

1  3  5  7 9 11 13 15 17 19 

*/

import java.util.Scanner;
public class Impares
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		int producto = 1;

		for( int i = 1 ; i < 20 ; i+=2 ){

			producto *= i;

			if( i == 19 )
				System.out.print( i );
			else
			System.out.print( i + " ," );


		}

		System.out.println("\n El producto es ... " + producto );
	}
}