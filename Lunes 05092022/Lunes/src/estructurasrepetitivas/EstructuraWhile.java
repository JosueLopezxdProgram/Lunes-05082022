package estructurasrepetitivas;
import java.util.Scanner;

public class EstructuraWhile {
	public static void main(String[] args) {
		
		//Estructura de prueba
		//estructursWhile
		Scanner lector = new Scanner(System.in);
		int contador = 0;
		int edad = lector.nextInt();
		
		while (contador < 10) {
			System.out.println("Estamos dentro del while\t");
			System.out.println("Contador : " + contador);
			contador ++;
			
			
		}
		System.out.println("Fin del programa");
		

			
		}
	}

