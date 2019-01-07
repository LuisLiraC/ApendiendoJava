import java.util.*;
public class Bucles_While2 {
	
	public static void main(String[] args) {
		
		int random = (int)(Math.random() * 100);
				
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		while (numero != random) {

			intentos++;
			System.out.println("Introduce n�mero");
			numero = entrada.nextInt();
			
			if (numero < random) {
				System.out.println("El n�mero es mayor");		
			} 
			
			else {
				System.out.println("El n�mero es menor");
			}
						
		}
		
		// Cerrar Scanner para liberar recursos
		entrada.close();
		System.out.println("Acertaste!");
		System.out.println("Te tom� " + intentos + " intentos");
		
	}
}
