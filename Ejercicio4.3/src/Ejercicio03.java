/*Programa que lea una frase y una palabra y que nos diga la posicion de dicha palabra
en la frase y si no la encuentra devuelva cero*/
import java.util.Scanner;
public class Ejercicio03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);

		String frase, palabra;
			System.out.println("Escriba una frase y una palabra");
			frase = t.nextLine();
			palabra = t.nextLine();
			if(frase.indexOf(palabra)>=0){
				System.out.println(frase.indexOf(palabra));
			}else{
					System.out.println("No se encuentra la palabra");
				}
			
		
	}
}
