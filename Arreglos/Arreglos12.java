/* Ejercicio 12 : 
Leer por teclado una tabla de 10 elementos númericos enteros y una posición (0-9).
Eliminar los elementos situados en la posición dada sin dejar huecos */

import java.util.Scanner;
public class Arreglos12{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);

		int [] n1 = new int[10];
		int posicion;
		boolean rango;

		//Números aleatorios en un arreglo
		for(int i = 0 ; i < n1.length; i++)
		{
			n1[i] = (int) (Math.random() * 50) + 1;
		}

		//Mostramos el arreglo n1 

		System.out.print("\nn1[] = \n" );

		for(int i = 0; i < n1.length ; i++){
			System.out.println( (i ) + ".- " + n1[i]);
		}

		do{

			System.out.print("\nDigita la posicion que desees eliminar -->");
			posicion = leer.nextInt();

			if(posicion>=0 && posicion<10)
			{
				rango = true;

			}

			else{
				rango = false;
				System.out.println("\nRango no valido, vuelve a intentarlo:");
			}

		}while(rango == false);


		//Eliminar los elementos , desplazandolos a la izquierda

		for(int i = posicion ; i < n1.length-1; i++){
			n1[i] = n1[ i + 1];

		}

		//Volvemos a mostrar el número arreglo 

		System.out.print("\nn1[] = \n" );

		for(int i = 0 ; i<9; i++){
			System.out.print( n1[i] + " ");
		}
	}
}