import javax.swing.*;
public class Bucles_For2 {

	public static void main(String[] args) {
		
		int arroba = 0;
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce un correo");
		
		
		for (int i=0; i<mail.length(); i++) {
			
			if (mail.charAt(i) == '@') {
				
				arroba++;
			}
			
			if (mail.charAt(i) == '.') {
				
				punto = true;
			}
			
		}

		if (arroba == 1 && punto == true) {
			System.out.println("Correo v�lido");
		}
		else {
			System.out.println("Correo no v�lido");
		}
	}

}
