
public class ManipulaCadenas {

	public static void main(String[] args) {
		
		String nombre="Luis";
		
		System.out.println("Mi nombre es " + nombre);
		// Mi nombre es Luis
		System.out.println("Mi nombre tiene " + nombre.length() + " letras");
		// Mi nombre tiene 4 letras
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		// La primera letra de mi nombre es L
		System.out.println("Las primeras dos letras son " + nombre.substring(0, 2));
		// Las primeras dos letras son Lu
		
		int ultima_letra=nombre.length();
		System.out.println("La última letra es la " + nombre.charAt(ultima_letra - 1));
		// La última letra es la s
		
		String nombre2 = "luis";
		System.out.println(nombre.equals(nombre2));
		// Devuelve false
		System.out.println(nombre.equalsIgnoreCase(nombre2));
		// Devuelve true
		
		String frase="Hoy es un estupendo día para aprender a programar en Java";
		String frase_resumen=frase.substring(29, 57) + " y comer pizza";
		System.out.println(frase_resumen);
		// aprender a programar en Java y comer pizza	
			
	}	

}
