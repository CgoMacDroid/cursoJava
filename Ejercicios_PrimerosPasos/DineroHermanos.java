/* Guillermo tiene N dólares. Luis tiene la mitad de lo que posee Guillermo. 
Juan tiene la mitad de lo que poseen Luis y guillermo juntos.
Hacer un programa que calcule e imprima la cantidad que tienen entre los 3. */

import java.util.Scanner;

public class DineroHermanos{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		int dineroG, dineroL, dineroJ, total;

		//Guillermo tiene N dólares
		System.out.println("Ingresa el dinero que tiene Guillermo");
		dineroG = entrada.nextInt();

		//Luis tiene la mitad de guillermo
		dineroL = dineroG / 2;

		//Juan tiene la mitad de lo que poseen Luis y guillermo juntos.
		dineroJ = (dineroG + dineroL) / 2;
		total = dineroG + dineroL + dineroJ;

		System.out.println("Gillermo = $ " + dineroG + "\nLuis = $ " + dineroL + "\nJuan = $ " + dineroJ);

		System.out.println("Total juntos = $ " + total);


	}
}