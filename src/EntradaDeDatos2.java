import javax.swing.*;
public class EntradaDeDatos2 {

	public static void main(String[] args) {
		
		String nombre=JOptionPane.showInputDialog("Introduce tu nombre");
		String edad= JOptionPane.showInputDialog("Introduce tu edad");
		
		/* showInputDialog siempre devuelve un dato de tipo String
		 * por lo que necesitamos convertirlo a un valor num�rico 
		 */
		
		int edad_numero = Integer.parseInt(edad);
		edad_numero++;
				
		System.out.println("Hola " + nombre + "!");
		System.out.println("Cumplir�s " + edad_numero + " a�os");

	}

}
