/*Leer una cadena de hasta 80 caracteres y pasarla en funcion de una variable de opcion 
 * a mayusculas o a minusculas e imprimir la cadena resultante */
import java.util.Scanner;
public class Ejercicio04 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int minusculas,mayusculas;
		String frase, frasem, frasemi;
			System.out.println("Escriba una frase y una palabra");
			frase = t.nextLine();
			System.out.println("Eliga Si quiere la frase en Mayusculas pulse 1 si las quiere en minusculas 2");
			minusculas= t.nextInt();
			mayusculas= t.nextInt();
			
			if(frase.length()<=80){
				if(mayusculas==1){
					frasem=frase.toUpperCase();
					System.out.println(frasem);
				}
				if(minusculas==2){
					frasemi=frase.toLowerCase();
					System.out.println(frasemi);
				}
			
			}	
	}
}
