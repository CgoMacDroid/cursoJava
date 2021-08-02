/*Realizar un programa que lea una fecha representada por dos enteros , mes y año y dé como resultado los días correspondientes del mes*/

import java.util.Scanner;

public class DiasAnio{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		int mes = 0 ,anio= 0, dias = 0;

		System.out.println("Mes (##): ");mes = entrada.nextInt();
		System.out.println("Anio (###) :"); anio = entrada.nextInt();

		//Inicio del Switch para elección de días segun el mes
		switch(mes)
		{
			case 1: //Enero
			case 3: //Marzo
			case 5: //Mayo
			case 8: //Agosto
			case 10: //Octubre
			case 12: //Diciembre
			dias = 31 ; //Enero
			break;

			case 4: //Abril
			case 6: //Enero
			case 9: //Junio
			case 11: //Noviembre
			dias= 30;
			break;

			case 2: // Febrero 
			//Año bisieto
				if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
					dias = 29;
				else
					dias = 28;
			break;


			default:
				System.out.println("Mes no valido...");
				break;
		}

			System.out.println("El mes " + mes + " del anio " + anio + " tiene " + dias + " dias");

	}
}