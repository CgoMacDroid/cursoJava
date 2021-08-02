/*Ejercio 2 : Hacer un programa que calcule e imprima el salario semanal de 
un empleado a partir de sus horas trabajadas y de su salario por hora*/

import java.util.Scanner;

public class SalarioEmpleado{
	public static void main(String args[]){

		Scanner entrada = new Scanner(System.in);

		final float salarioHora = 170f;
		float salarioSemanal; 
		int horasTrabajadas;

		System.out.println("Ingresa las horas trabajadas");
		horasTrabajadas = entrada.nextInt();
		
		salarioSemanal = horasTrabajadas * salarioHora;

		System.out.println("Tu salario semanal es = $ " + salarioSemanal );


	}
}