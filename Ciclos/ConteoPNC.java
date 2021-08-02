/* Ejercicio 13 : Pedir 10 números. 
Mostrar la media de los positivos, negativos y la cantidad de ceros */

import java.util.Scanner;
public class ConteoPNC
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);
		//Para solicitud de datos
		int n;

		//Contadores y almacenadores
		int contadorPos = 0 , contadorNeg = 0,contadorCeros = 0;

		float mediaN,mediaP,mediaNeg = 0 , mediaPos = 0;

		//Solicitar 10 números
		for(int i = 1; i<= 10; i++)
		{
			System.out.print( i +".- Digita un numero... "); n = leer.nextInt();

			//Conteo de positivos y media
			if(n > 0)
			{
				contadorPos++;
				mediaPos+=n;
			}

			//Conteo de negativos y media
			else if( n < 0 ){
				contadorNeg++;
				mediaNeg+=n;
			}

			//Conteo de ceros
			else if(n == 0){
				contadorCeros++;
			}
		}

		//Obtenermos la media de todos los numeros positivos almacenados
		mediaP = mediaPos / contadorPos;

		//Obtenermos la media de todos los numeros negativos almacenados
		mediaN = mediaNeg / contadorNeg;

		//Impresión de datos
		System.out.print("\nMedia de Positivos = " + mediaP);
		System.out.print("\nMedia de Negativos = " + mediaN);
		System.out.print("\nCeros ingresados = " + contadorCeros);
	}	
}