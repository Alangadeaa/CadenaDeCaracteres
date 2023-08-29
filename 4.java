package nashei;
import java.util.Scanner;

public class jose {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Escribir la palabra: ");
        String jose = scanner.nextLine();
        System.out.print("Escribir la letra que quiere vetar: ");
        String raul = scanner.nextLine();
        System.out.print("Escribir la letra por la que vas a cambiar: ");
        String manuel = scanner.nextLine();
        
        System.out.println(formateaDatos(jose, raul, manuel));
	}
	
	public static String formateaDatos(String dato, String dato2, String dato3){
		
		for(int i = 0; i < dato.length(); i++) {
			if(dato.charAt(i) == dato2.charAt(0)) {
				dato = dato.replace(dato.charAt(i), dato3.charAt(0)); 
			}
		}
		 
		return dato;
		}

}
