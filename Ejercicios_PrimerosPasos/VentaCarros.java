/* Ejercicio No 4. : Una compañía de venta de carros usados, 
paga a su personal de ventas un salario de $1000 mensuales,mas una comisión 
de $150 por cada carro vendido, más el 5% del valor de la venta por carro. 
Cada mes el capturista de la empresa ingresa en la computadora los datos pertinentes. 
Hacer un programa que calcule e imprima el salario mensual de un vendedor dado. */

import java.util.Scanner;
public class VentaCarros{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);

		final int salarioMensual = 1000;
		float costoCarro, salarioTotal;
		int carrosVendidos;

		System.out.println("Ingresa la cantidad de carros vendidos");
		carrosVendidos = entrada.nextInt();

		System.out.println("Ingresa el coste de los carros");
		costoCarro = entrada.nextFloat();

		salarioTotal = salarioMensual + (carrosVendidos * 150) + (0.05f * costoCarro * carrosVendidos);

		System.out.println("Salario Total del empleado " + salarioTotal);	
	}
}