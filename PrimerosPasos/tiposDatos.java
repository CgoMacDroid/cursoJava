public class tiposDatos{
	public static void main(String args[]){

		//Tipos primitivos 
			//Tipos ENTEROS 
				byte variableByte = 126;
				short variableShort = 32767;
				int variableInt = 214778;
				long variableLong = 3454656;
				char variableChar = 'a';

				System.out.println("Este es una variable byte: \n" + variableByte);
				System.out.println("Este es una variable short: \n" + variableShort);
				System.out.println("Este es una variable int: \n" + variableInt);
				System.out.println("Este es una variable long: \n" + variableLong);

				System.out.println("La primer letra es " + variableChar);
 
			//Tipos Boolean 
				boolean isActive = false ; 
				System.out.println("Boolean solo tiene dos valores , tales como true and : " + isActive);


			//Tipos REALES 

				float variableFlotante = 3.1415f;

				System.out.println("Este es un flotante " + variableFlotante );

				double variableDouble = 343434.234333333;	
				System.out.println("Este es un double : " + variableDouble);		

	}
}