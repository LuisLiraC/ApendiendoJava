import javax.swing.*;
public class Matriz2 {

	public static void main(String[] args) {
		
		String [] paises = new String [8];
		
		for (int i = 0; i<8; i++) {
			
			paises[i] = JOptionPane.showInputDialog("Ingresa un pa�s");
			
		}

		for (String elemento:paises) {
			
			System.out.println("Pa�s " + elemento);
			
		}
	}
}