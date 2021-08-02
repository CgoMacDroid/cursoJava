/* Ejercicio 17 Resumen de ventas de una empresa */
import java.util.Scanner;
public class ResumenVentas
{
	public static void main(String args[])
	{
		Scanner leer = new Scanner(System.in);

		String codigo; 
		float lit,precLit,importeFactura = 0 ,litrosT = 0, facturacionT=0, litrosArti1 = 0;
		int cont600 = 0 ;

		for( int i = 1 ; i <= 5 ; i++)
		{
			System.out.print("\nCodigo del articulo " + i +  " : " ); codigo = leer.nextLine();
			System.out.print("\nLitros vendidos ... " + i +  " : "); lit = leer.nextFloat();
			System.out.print("\nPrecio X Litro ... " + i +  " : "); precLit = leer.nextFloat();

			importeFactura = lit * precLit; //Importe por factura

			//Suma total de todas las facturas 
			facturacionT += importeFactura; 

			//Litros totales del articulo 1
			if(codigo == "1"){
				litrosArti1 += lit;
			}

			//conteo de facturas con mas de 600
			if(importeFactura >= 600){
				cont600++;
			}
		}

		System.out.print("\n Resumen de ventas: " + facturacionT);
		System.out.print("\n  Litros del articulo 1: " + litrosArti1);
		System.out.print("\n Ventas mayores a $600:  " + cont600);
	}
}