/* EJERCICIO 5: Un obero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera : 
Si trabaja 40 horas o menos se le paga por hora $16 , Si trabaja mas de 40 horas se le paga $16
por cada una de las primeras 40 horas y $20 por cada hora extra*/

import java.util.Scanner;
public class SalarioObrero{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		int hr,salario,extra;

		System.out.println("Horas trabajadas ... "); hr = entrada.nextInt();

		if(hr > 0 && hr <= 40){
			salario = hr * 16 ; 
			System.out.println("Salario total = $" + salario);
		}
		else
		{
			extra = (hr - 40) * 20;
			salario = (40 * 16 ) + extra;
			System.out.println("Salario total = $ " + salario);
		}
	}
}