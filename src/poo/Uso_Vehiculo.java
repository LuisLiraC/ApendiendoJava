package poo;
//import javax.swing.*;

public class Uso_Vehiculo {

	public static void main(String[] args) {
		
		/*Auto Renault= new Auto();
		
		Renault.poner_color(JOptionPane.showInputDialog("Escoge el color del auto"));
		Renault.escoge_asientos(JOptionPane.showInputDialog("¿Tendrá asientos de cuero? Sí / No"));
		Renault.tiene_aire(JOptionPane.showInputDialog("¿Tendrá aire acondicionado? Sí / No"));
		
		System.out.println(Renault.datos_generales());
		System.out.println(Renault.dime_color());
		System.out.println(Renault.dime_asientos());
		System.out.println(Renault.dime_aire());
		System.out.println(Renault.dime_peso_auto());
		System.out.println();
		System.out.println("El precio del auto es $ " + Renault.precio_auto() + " pesos");*/
		
		Auto Auto1 = new Auto();
		Auto1.poner_color("Azul");
		
		Furgoneta Furgoneta1 = new Furgoneta(500, 5);
		Furgoneta1.poner_color("Blanco");
		Furgoneta1.tiene_aire("Sí");
		Furgoneta1.escoge_asientos("Sí");
		
		System.out.println(Auto1.datos_generales() + "\n" + Auto1.dime_color());
		System.out.println("");
		System.out.println(Furgoneta1.datos_generales() + "\n" + Furgoneta1.dime_datos_furgoneta());
	}
}

