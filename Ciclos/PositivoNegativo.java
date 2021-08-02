/* Ejercicio 2 : Leer un número e
indicar si es positivo o negativo .
El proceso se reptirá hasta que se introduzca un */

import java.util.Scanner;

public class PositivoNegativo
{
	public static void main(String args[])
	{
		Scanner entrada = new Scanner(System.in);
		
		int num;
		System.out.print("Digita un numero: "); num = entrada.nextInt();

		//USO DEL WHILE
		while(num != 0)
		{
			if(num > 0)
			{
				System.out.println(num + " es positivo");
				System.out.print("Digita otro numero: "); num = entrada.nextInt();
			}

			else
			{

				System.out.println(num + " es negativo ");
				System.out.print("Digita otro numero: "); num = entrada.nextInt();
			}
		}

		System.out.println(num + " es numero no permitido ");
	}
}