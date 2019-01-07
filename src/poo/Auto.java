package poo;

public class Auto {
	
	// Encapsulamiento
	private int ruedas;
	private int largo;
	private double ancho;
	private int motor;
	private int peso_plataforma;
	
	private String color;
	private int peso_total;
	private boolean asientos_cuero, aire_acondicionado; 
	
	// Iniciación de propiedades
	public Auto () {
	
		ruedas=4;
		largo=3000;
		ancho=1500;
		motor=1600;
		peso_plataforma=500;
		
	}
	
	// Getter
	public String datos_generales() {
		return "La plataforma tiene " + ruedas + " ruedas. " +
				"Mide " + largo/1000 + " metros de largo. " + 
				"Su ancho es de " + ancho/1000 + " metros. " +
				"Su motor es de " + motor + " centímetros cúbicos. " + 
				"Pesa " + peso_plataforma + " kilos.";
	}
	
	// Setter
	public void poner_color(String color_auto) {
		color = color_auto;
	}
	
	// Getter
	
	public String dime_color() {
		return "El color del auto es " + color;
	}
	
	// Setter
	public void escoge_asientos (String asientos_cuero) {
		
		if (asientos_cuero.equals("Sí")) {
			this.asientos_cuero = true;
		}
		else {
			this.asientos_cuero = false;
		}	
	}
	
	// Getter
	
	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "El auto tiene asientos de cuero";
		}
		else {
			return "El auto no tiene asientos de cuero";
		}
	}
	
	// Setter
	
	public void tiene_aire (String aire_acondicionado) {
		if (aire_acondicionado.equals("Sí")) {
			this.aire_acondicionado = true;
		}
		else {
			this.aire_acondicionado = false;
		}
	}
	
	// Getter
	
	public String dime_aire () {
		if (aire_acondicionado == true) {
			return "El auto tiene aire acondicionado";
		}
		else {
			return "El auto no tiene aire acondicionado";
		}
		
	}
	
	// Métodos Getter y Setter (no es lo recomendable)
	
	public String dime_peso_auto () {
		
		int peso_carroceria=500;
		peso_total = peso_plataforma + peso_carroceria;
		
		if (asientos_cuero == true) {
			peso_total += 50;
		}
		
		if (aire_acondicionado == true) {
			peso_total += 20;
		}
		
		return "El peso total del auto es " + peso_total + " kilos";
	}
		
	public int precio_auto() {
		int precio_final=100000;
		
		if (asientos_cuero == true) {
			precio_final += 5000;
		}
		
		if (aire_acondicionado == true) {
			precio_final += 2000;
		}
		
		return precio_final;
		
	}
}
