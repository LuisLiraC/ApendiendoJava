import java.util.*;
public class Bucles_DoWhile {

	public static void main(String[] args) {
				
		int random = (int)(Math.random() * 100);
		
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		int intentos = 0;
		
		do {

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
		
		while (numero != random);
		
		entrada.close();
		System.out.println("Acertaste!");
		System.out.println("Te tom� " + intentos + " intentos");

	}

}
