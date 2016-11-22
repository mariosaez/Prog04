/*Dada una frase de no más de 80 caracteres hacer un programa que 
 * busque cuántas mayúsculas y minúsculas tiene y lo imprima
 */
//For para ir caracter a caracter
import java.util.Scanner;
public class Ejercicio06 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner t= new Scanner (System.in);
		
			String caracter;
			int contador,numeros=0, vocales=0,consonantes=0,hola;
			
					System.out.println("Introduce tu frase");
					caracter=t.nextLine();
	
				if(caracter.length()<=80) {

				for (contador=0;contador<caracter.length();contador++) {
					if (caracter.charAt(contador)=='0' || caracter.charAt(contador)=='1' || caracter.charAt(contador)=='2' 
							|| caracter.charAt(contador)=='3'|| caracter.charAt(contador)=='4'|| caracter.charAt(contador)=='5'|| caracter.charAt(contador)=='6'|| caracter.charAt(contador)=='7' 
							|| caracter.charAt(contador)=='8' || caracter.charAt(contador)=='9') {
						numeros++;

					}
				if(caracter.charAt(contador)!='a' && caracter.charAt(contador)!='e' 
					&& caracter.charAt(contador)!='i' && caracter.charAt(contador)!='o' && caracter.charAt(contador)!='u'&& caracter.charAt(contador)!='A' 
					&& caracter.charAt(contador)!='E' && caracter.charAt(contador)!='I' && caracter.charAt(contador)!='O' && caracter.charAt(contador)!='U' ){
					consonantes++;
					}else{
						vocales++;
					}
				}
					System.out.println("Los numeros son "+numeros+"");
					System.out.println("Las vocales son "+vocales+"");
					System.out.print("Las consonantes son "+consonantes+"");
				
				}
				
				
	}
}