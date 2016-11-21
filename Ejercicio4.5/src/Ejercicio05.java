/*Leer una frase por teclado(máximo 80car) y construir otras dos cadenas de forma
que una contenga los caracteres en posicion par y la otra los caracteres en posicion imapar*/
import java.util.Scanner;
public class Ejercicio05 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int contador=0, numeroimpar=0,numeropar=0;
		String frase, contimpar, contpar, cadenaimpar, cadenapar;
		System.out.println("Escriba una frase");
		frase = t.nextLine();
		
		if(frase.length()<=80){
			while(contador<frase.length());


			if(contador==numeroimpar){
				System.out.print(frase.charAt(contador));
			}
			if(contador==numeropar){
				System.out.print(frase.charAt(contador));
			
					contador++;
			}
		}
	}

}
