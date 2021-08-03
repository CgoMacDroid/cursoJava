/* Los arreglos son colecciones de datos del mismo tipo 
Podemos decir que es un tren con varios espacios de memoria. */

public class Arreglos1
{
	public static void main(String args[])
	{
		/* Sintaxis de un arreglo 
		Tipo_de_variable[] nombre_de_variable = new Tipo_de_Variable[Tamaño de arreglo]; */
		int[] edades  = new int[3];


		/* Dar valores posición por posicion */

		edades [0] = 5 ;
		edades [1] = 7 ;
		edades [2] = 9 ;

		/*Definición de arreglo ya con valores */

		int[] numeros = {50,70,90};

		/*Imprimir valores */
		for(int i = 0; i < 3; i++ )
		{
			System.out.println(edades[i]);
		}

		/* Imprimir valores posicion por posicion */
		System.out.println("Imprimiendo valores posicion por posicion: ");
		System.out.println(edades[0]);
		System.out.println(edades[1]);
		System.out.println(edades[2]);

		/* Imprimir valores utilizando el ciclo for*/
		System.out.println("Imprimiendo valores utilizando el ciclo for: ");
		for(int i = 0; i < 3; i++)
		{
			System.out.println(edades[i]);
		}


	}
}