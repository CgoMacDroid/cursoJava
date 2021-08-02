/* Ejercicio 4 : En MegaPlaza se hace un 20% de descuento a los clientes
cuya compra supere los $300. ¿Cuál será la cantidad que pagará una persona 
por su compra ? */

import java.util.Scanner;
public class Descuento{
	public static void main(String args[]){
		Scanner entrada = new Scanner(System.in);
		float compra,totalC,descuento;

		System.out.print("Total de compra... $"); compra = entrada.nextFloat();


		if(compra > 300){
			descuento = compra * 0.20f;
			totalC = compra - descuento;
			System.out.println("Descuento aplicado, su total es de ... $" + totalC);
		}
		else if(compra >= 0 && compra < 300){
			totalC = compra ; 
			System.out.println("No aplica descuento, su total es de .. $" + totalC);
		}
		


	}
}