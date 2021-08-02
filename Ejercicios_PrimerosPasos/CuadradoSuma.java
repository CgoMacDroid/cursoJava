/*Ejercio 6 : Hacer un programa que calcule el cuadrado de una suma 
(a+b)2 = a2 + b2 +2ab */

import java.util.Scanner;
public class CuadradoSuma{
	public static void main(String args[]){
			Scanner entrada = new Scanner(System.in);

			double a,b,resultado;

			System.out.println("Digita el valor de a");
			a = entrada.nextDouble();

			System.out.println("Digita el valor de b");
			b = entrada.nextDouble();

			resultado = Math.pow(a,2) + Math.pow(b,2) + (2*a*b);

			System.out.println("El resultado es " + resultado);
			
	}
}