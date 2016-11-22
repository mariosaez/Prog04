
import java.util.Scanner;
public class ejercicio7 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		
String frase;
int contador,mayusculas=0,minusculas=0,numeros=0;

				System.out.println("Introduce una frase");
				frase=t.nextLine();
				
			for (contador=0;contador<frase.length();contador++) {
				
				if (frase.charAt(contador)>='A' || frase.charAt(contador)<='Z') {
					mayusculas++;
					
				}
				if (frase.charAt(contador)>='a' || frase.charAt(contador)<='z') {
					minusculas++;
			}
				if (frase.charAt(contador)=='0' || frase.charAt(contador)=='1' || frase.charAt(contador)=='2' 
				|| frase.charAt(contador)=='3'|| frase.charAt(contador)=='4'|| frase.charAt(contador)=='5'|| frase.charAt(contador)=='6'|| frase.charAt(contador)=='7' 
				|| frase.charAt(contador)=='8' || frase.charAt(contador)=='9') {
					numeros++;
			}

			}
			System.out.println("mayusculas"+mayusculas+"");
			System.out.println("minusculas"+minusculas+"");
			System.out.println("numeros"+numeros+"");
}
}
