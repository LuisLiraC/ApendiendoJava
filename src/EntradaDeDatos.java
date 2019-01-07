import java.util.*;

public class EntradaDeDatos {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu nombre");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce edad, por favor");
		
		int edad=entrada.nextInt();
		
		System.out.println("Tu nombre es " + nombre_usuario + " y tu edad es " + edad + " años");
		
		entrada.close();
		
	}

}
