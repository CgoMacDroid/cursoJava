/* Ingresar por consola el numero de la tabla que queremos imprimir
utilizar ciclos */

import java.util.Scanner;
public class TablasMul
{
	public static void main(String args[])
	{

		Scanner leer = new Scanner(System.in);
		int num;
				System.out.print("Ingresa la tabla que quieres -->"); num = leer.nextInt();

				for(int i = 1 ; i <= 10 ; i++)
				{
					System.out.println(num + " x " + i + " = " + (num * i));
				}
		
	}
}