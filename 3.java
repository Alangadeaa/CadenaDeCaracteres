package nashei;
import java.util.Scanner;

public class ola {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa una cadena de caracteres: ");
        String input = scanner.nextLine();
        
        if (espalindromo(input)) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
    
    public static boolean espalindromo(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
	}

}