import java.util.Scanner;
public class Ajedrez{
	public static void main(String args[]){
		Scanner leer = new Scanner(System.in);

		//Posicion Inicial del alfil 
		int falfil,calfil;

		//Posicion Actual del alfil
		int fila,columna;


		//Solicitar Posicion INICIAL
		System.out.print(" Fila : "); falfil = leer.nextInt();
		System.out.print(" Columna : "); calfil = leer.nextInt();


		//Pintar el tablero de B = BLANCO ; N = NEGRO ; * CASILLAS DEL ALFIL 

		for( fila = 1 ; fila <= 8 ; fila ++ ) // Empezando desde fila 1 hasta la 8
		{
			for (columna = 1 ; columna <= 8; columna ++ ) // Empezando de columna 1 hasta la 8
			{
				
				if ((fila + columna == falfil + calfil) ||  (fila - columna == falfil - calfil))
				{
					System.out.print("* ");
				}

				else if((fila + columna) % 2 == 0)
				{
					System.out.print("B ");
				}

				else
				{
					System.out.print("N ");
				}
			}
			System.out.println(); //cambiar de fila
		}
	}
}