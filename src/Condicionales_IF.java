import java.util.*;
public class Condicionales_IF {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		
		int edad=entrada.nextInt();
		
		if (edad < 18) { 
			System.out.println("Eres adolescente");			
		} 
		
		else if (edad < 30){
			System.out.println("Eres joven");
		}
		
		else if (edad < 65){
			System.out.println("Eres adulto");
		}
		
		else {
			System.out.println("Eres un adulto mayor");
		}
		
		entrada.close();
	}

}
