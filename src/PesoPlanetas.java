import java.util.*;

public class PesoPlanetas {
	
	public static void main(String[] args) {
		
		Scanner peso_usuario=new Scanner(System.in);
		
		System.out.println("Introduce tu peso");
		double peso = peso_usuario.nextDouble();
		
		double g_tierra= 9.8;
		double g_marte = 3.7;
		double g_jupiter= 24.8;
		
		System.out.println("Tu peso en Marte es de: " + peso * g_marte / g_tierra + " kilogramos");
		System.out.println("Tu peso en J�piter es de " + peso * g_jupiter / g_tierra + " kilogramos");
		
		peso_usuario.close();
		
	}
	
}
