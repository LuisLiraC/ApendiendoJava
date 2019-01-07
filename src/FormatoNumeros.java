
public class FormatoNumeros {

	public static void main(String[] args) {
		
		double x = 1000.0;
		
		/* Se cambia a printf para indicar que imprimirá con formato
		 * "%1.2f" es el formato, donde 2 indica el número de decimales que quieres mostrar
		 */
		
		System.out.printf("%1.2f", x/3);
		
		// Resultado: 333.33
	}
}
