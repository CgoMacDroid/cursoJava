/* Ejercicio 1 : Leer un número y mostrar su cuadrado, 
repetir el proceso hasta que se introduzca un número negativo*/

import java.util.Scanner;
public class CuadradoNum{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);

		int num = 0,cuadradoNum = 0;
		
		System.out.print("Digita el numero... "); num = leer.nextInt();
		
		//Solo numeros positivos
		while(num >= 0)
		{
			cuadradoNum = (int) Math.pow(num,2);
			System.out.println(num + " ^ 2  = " + cuadradoNum );
			System.out.print("Digita otro numero... "); num = leer.nextInt();
		}

		System.out.println(num + " es negativo");0
	}
}