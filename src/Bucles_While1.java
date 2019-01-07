import javax.swing.*;
public class Bucles_While1 {

	public static void main(String[] args) {
		
		String clave="Luis";
		String pass="";
		
		while (clave.equals(pass) == false) {
			
			pass=JOptionPane.showInputDialog("Introduce nombre");
			
			if (clave.equals(pass) == false) {
				
				System.out.println("Contraseña incorrecta");
			}
			
		}
		
		System.out.println("Bievenido");
					
	}

}
