import java.util.*;
import javax.swing.*;
public class Condicionales_Switch {

	public static void main(String[] args) {
		
		Scanner entrada= new Scanner(System.in);
		
		// "\n" se usa para crear un salto de línea en el mismo print 
		System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
		
		int figura = entrada.nextInt();
		
		switch (figura) {
		
		case 1:
			
			int lado=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El área del cuadrado es: " + Math.pow(lado, 2));
			break;
			
		case 2:
																					
			int lado1=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado 1"));
			int lado2=Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado 2"));
			System.out.println("El área del rectángulo es: " + lado1 * lado2);
			break;
				
		case 3:
		
			int base=Integer.parseInt(JOptionPane.showInputDialog("Introduce base"));
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce altura"));
			System.out.println("El área del rectángulo es: " + (base * altura) / 2);
			break;
		
		case 4:
			
			int radio=Integer.parseInt(JOptionPane.showInputDialog("Introduce radio"));
			System.out.println("El área del círculo es: ");
			System.out.printf("%1.2f", Math.PI * Math.pow(radio, 2));
			break;
			
		default:
					
			System.out.println("Opción incorrecta");	
						
		}
		
		entrada.close();
	}

}
