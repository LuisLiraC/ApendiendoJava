import java.util.*;

public class Uso_Tallas {
	
	// Variable ENUM (Variable tipo Objeto)
	
	// Forma 1
	// enum talla {Mini, Mediano, Grande, Muy_Grande};
	
	// Forma 2
	
	enum talla {
		
		mini("S"),mediana("M"),grande("L"),extragrande("XL");
		
		private talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		public String dameTalla() {
			return abreviatura;
		}
		
		private String abreviatura;
	}
	
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla: mini, mediana, grande, extragrande");
		String entrada_datos = entrada.nextLine().toLowerCase();
		
		talla La_talla = Enum.valueOf(talla.class, entrada_datos); 
		
			
		System.out.println("Talla = " + La_talla);
		System.out.println("Abreviatura = " + La_talla.dameTalla());
		
		entrada.close();
		
	}
}
