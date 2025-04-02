import java.util.Scanner; 
public class PrimeNumbers { 
     public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in); 
   
           System.out.print("Enter an integer: "); 
           int n = scanner.nextInt(); 
 

          System.out.println("Prime numbers up to " + n + ":"); 
           for (int i = 2; i <= n; i++) { 
              boolean isPrime = true; 
 
          
            for (int j = 2; j < i; j++) { 
                if (i % j == 0) { 
                    isPrime = false; 
                    break; 
                } 
            } 
 
        
            if (isPrime) { 
                System.out.print(i + " "); 
            } 
        } 
        System.out.println(); 
        scanner.close(); 
    } 
} 
 
