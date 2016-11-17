/*Dada una frase de no más de 80 caracteres hacer un programa que 
 * busque cuántas mayúsculas y minúsculas tiene y lo imprima
 */

import java.util.Scanner;
public class Ejercicio02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int  contadormayusculas,contadorminusculas,x,y ;
		String f;
			System.out.println("Escriba su frase de como maximo 80 caracteres");
			f = t.nextLine();
	
	contadormayusculas=0;
	contadorminusculas=0;
	
	if(f.length()<=80){
		for(x=0;x<=f.toLowerCase();x++){
		contadormayusculas++;	
		}
		for(y=0;y>=f.length();y++){
			contadorminusculas++;
		}
	
	
}
	System.out.println(contadormayusculas);
	System.out.println("");
	System.out.println(contadorminusculas);

	

		//System.out.println("Su frase es de 80 caracteres");
	
	}
}
