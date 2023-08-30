package omg;
import java.util.Scanner;

public class jalou {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Escribir 5 palabras para ver cual es mas larga: ");
        String jose = scanner.nextLine();
        String jose1 = scanner.nextLine();
        String jose2 = scanner.nextLine();
        String jose3 = scanner.nextLine();
        String jose4 = scanner.nextLine();
        int ola = 0;
        int max = 0;
        
        String[] js = {jose,jose1,jose2,jose3,jose4};
        int []jse = new int[5];
        
        for(int i = 0; i < 5; i++) {
        	jse[i] = js[i].length();
        	if(max < jse[i]) {
        		max = jse[i];
        		ola = i;
        	}
        }
        System.out.print("La palabra mas larga es: " + js[ola]);
        
	}

}