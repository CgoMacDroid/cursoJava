/* Ejercicio 8: Diseñar una aplicación que declare una tabla
de 10 elementos eneteros.
Leer mediante el teclado 8 números. 
Despues se debe pedir un número y una posición , insertarlo en la
posición indicada desplazandolos una posición  */

import java.util.Scanner;
public class Ejercicio7{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		int n[] = new int[10];
		int numero,posicion;

		for(int i = 0; i<8;i++){
			System.out.print((i) + ".- Ingresa un numero -->");
			n[i] = entrada.nextInt();
		}

		//Solicitamos el siguiente número y la posición

		System.out.print("\n Ingresa otro numero--> ");
		numero = entrada.nextInt();
		System.out.print("\n Ingresa la posicion--> ");
		posicion = entrada.nextInt();

		//Desplazamos los números por delante de la posición indicada por el usario
		for(int i = 7 ; i>=posicion ; i--){
			n[i + 1] = n[i];
		}

		//Insertamos el número en la posición
		n[posicion] = numero;

		//Arreglo nuevo 
		System.out.println("El nuevo arreglo es : ");

		for(int i = 0 ; i<9 ; i++){
			System.out.print(n[i]  + " ");
		}


	}
}

