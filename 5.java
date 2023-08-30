import java.util.Scanner; 
  
 public class ejer5 { 
  
         public static void main(String[] args) { 
                 // TODO Auto-generated method stub 
                 Scanner scanner = new Scanner(System.in); 
                 System.out.println("Ingrese DOS numeros para chequear si son anagramas. \n(NOTA: Este programa solamente acepta DOS numeros. Si lo intenta con mas de dos el programa solo comparará los primeros dos numeros)"); 
                 String linea = scanner.nextLine(); 
                 String[] array = linea.split(" "); 
                 String elemento1 = array[0]; 
                 String elemento2 = array[1]; 
                 if(elemento1.length() != elemento2.length() ) { 
                         System.out.println("No son anagramas"); 
                         return; 
                 } 
                 int charCheck = 0; 
                 int esAnagrama = elemento1.length(); 
                 for(int i = 0; i < elemento1.length(); i++) {  
                         for(int j = 0; j < elemento2.length(); j++) { 
                                 if(elemento1.charAt(i) == elemento2.charAt(j)) charCheck = 1; 
                         } 
                         if(charCheck == 1) esAnagrama--; 
                         charCheck = 0; 
                         if (esAnagrama == 0) { 
                                 System.out.println("Son anagramas"); 
                                 return; 
                         } 
                 } 
                 System.out.println("No son anagramas"); 
  
                 scanner.close(); 
         } 
  
 }
