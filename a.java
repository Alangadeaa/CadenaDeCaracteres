package javazzz;
import java.util.Scanner;

public class a {
	public static void main(String[] args) {

		Scanner reader = new Scanner(System.in);
		System.out.print("Escriba su nombre: ");
		String nombre = reader.nextLine();
		
		System.out.println("El nombre ingresado es: " + nombre);		
	}
}
