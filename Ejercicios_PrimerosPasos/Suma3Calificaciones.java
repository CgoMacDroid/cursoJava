 /*Ejercicio 1 : Hacer un programa que calcule e imprima la suma de tres calificaciones*/
 
 import java.util.Scanner;

 public class Suma3Calificaciones{
 	public static void main(String args[]){

 		Scanner entrada = new Scanner(System.in);
 		//Declaracion de las variables 
 			float a,b,c;
 			float resultado;

 		//Solicitud de Datos 	
 			System.out.println("Ingresa las 3 calificaciones");

 			a = entrada.nextFloat();
 			b = entrada.nextFloat();
 			c = entrada.nextFloat();

 			System.out.println(a + b + c);
 	}
 }