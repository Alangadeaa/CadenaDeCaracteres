package cadena;
import java.util.Scanner;

public class ejerc2 {

	public static void main(String[] args) {
		System.out.printf("Escriba una palabra.\n");
		Scanner scanner = new Scanner(System.in);
		
		String linea = scanner.nextLine(); 
		
		String[] lineaarray = linea.split(" "); 
		
		String palabra = lineaarray[0];
		
		int count = 0;
		
		for(int i = 0; i < palabra.length(); i++) {
			if(palabra.charAt(i) == 'a' ||
				palabra.charAt(i) == 'e' ||
				palabra.charAt(i) == 'i' ||
				palabra.charAt(i) == 'o' ||
				palabra.charAt(i) == 'u' ||
				palabra.charAt(i) == 'A' ||
				palabra.charAt(i) == 'E' ||
				palabra.charAt(i) == 'I' ||
				palabra.charAt(i) == 'O' ||
				palabra.charAt(i) == 'U') {
				count++;
			}
		}
		
		System.out.println("La palabra " + palabra + " tiene: " + count + " vocales");
		scanner.close();
	}

}