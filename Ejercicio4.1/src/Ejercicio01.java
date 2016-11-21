/*Leer una frase de máximo 80 caracteres y escribirla progresivamente es decir si la frase es:

“ciervo”, el programa debe imprimir
c
ci
cie
cier
cierv
ciervo*/
import java.util.Scanner;
public class Ejercicio01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		int  x,a;
		String frase;
			System.out.println("Escriba su frase de como maximo 80 caracteres");
			frase = t.nextLine();
	
	if(frase.length()<=80){
		for(x=0;x<frase.length();x++){
			for(a=0;a<=x;a++){
				
			System.out.print(frase.charAt(a));
			}
			System.out.println("");
		}
		
	}
	else{
		System.out.println("Su frase es de 80 caracteres");
	}
	}
}
