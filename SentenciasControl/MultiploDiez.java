/* Ejercicio 1 : Hacer un programa que lea un número entero y muestre si el número es multiplo de
10 */

import java.util.Scanner;
public class MultiploDiez
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);

		int num;
		System.out.print("Digita el numero...\t");
		num = entrada.nextInt();

		//Si divides cualquier numero entre 10 y el residuo es 0, entonces el numero es multiplo
		if( num % 10 == 0 )
			System.out.println(num + " es multiplo de 10");
		//Si el residuo es diferente de 0 , entonces no es multiplo
		else
			System.out.println(num + " no es multiplo de 10");
	}

}