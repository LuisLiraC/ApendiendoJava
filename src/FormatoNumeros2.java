import javax.swing.*;
public class FormatoNumeros2 {
	
	public static void main(String[] args) {
		
		String num1=JOptionPane.showInputDialog("Introduce un número");
		
		double num2= Double.parseDouble(num1);
		
		System.out.print("La raíz de " + num2 + " es: ");
		System.out.printf("%1.5f", Math.sqrt(num2));
		
	}
}
