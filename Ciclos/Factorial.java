/* Ejercicio No. 12 Pedir un número 
y calcular su factorial 

Ejemplos: 5! = 1 * 2 * 3 * 4 * 5


*/

import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		long n, factorial = 1 ;

		System.out.print("Digital el factoral que deseas..."); n = leer.nextInt();
	
		if( n == 0)
		{

			System.out.print("No hay factorial");
		}
		else
		{
			System.out.print(n + "! = ");
				for(int i = 1 ; i <=  n ; i ++)
					{
			
						factorial *= i; 


						if( i == n)
							System.out.print(i + " = ");
						else
							System.out.print(i + " * ");
					}
		System.out.print(factorial);
		}

	    	
	}
}