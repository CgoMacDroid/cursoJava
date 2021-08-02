/*Ejercicio No.5 */

import java.util.Scanner;

public class CalificacionEstudiante{
	public static void main(String args[]){
			Scanner entrada = new Scanner(System.in);
				float participacion , primerE,segundoE,finalE, calificacionF;

				System.out.println("Digita la nota de participacion");
				participacion = entrada.nextFloat();

				System.out.println("Primer Examen: ");
				primerE = entrada.nextFloat();

				System.out.println("Segundo Examen: ");
				segundoE = entrada.nextFloat();

				System.out.println("Examen Final: ");
				finalE = entrada.nextFloat();

				calificacionF = ((participacion * 0.1f) + (primerE *0.25f) + (segundoE * 0.25f) + (finalE * 0.40f));

				System.out.println("Calificacion Final = " + calificacionF);			
	}
}