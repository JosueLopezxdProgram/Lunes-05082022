package estructurasrepetitivas;
import java.util.*;

public class Adivinansa {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
	   int cont = 1;
		
		long num = Math.round(Math.random() * 5);
		System.out.println("Adivine un numero entre 0 y 5:");
		int resp = lector.nextInt();
		
		while (num != resp) {
			System.out.println("Lo siento numero incorrecto ,vuelva a intentarlo");
			System.out.println("Adivine un numero entre 0 y 5");		
			resp= lector.nextInt();
			cont ++;
			
			if (cont == 3) {
				 System.out.println("Ha perdido todos sus intentos :" +  cont);
			 System.exit(resp);
				

            }  
			
		}
		System.out.println("Felicidades has adivinado,El numero es " +  num);

	   
		
		 
		System.out.println("Fin del juego");
		
	}

}
