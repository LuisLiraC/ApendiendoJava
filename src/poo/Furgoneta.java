package poo;

public class Furgoneta extends Auto {
	
	private int capacidad_carga;
	private int capacidad_personas;
	
	public Furgoneta(int capacidad_carga, int capacidad_personas) {
		
		super(); // Llamar al constructo de la clase Padre
		
		this.capacidad_carga = capacidad_carga;
		this.capacidad_personas = capacidad_personas;
	}
	
	// Getter
	
	public String dime_datos_furgoneta() {
		return "La capacidad de carga: " + capacidad_carga +
				". Capacidad de pesonas: " + capacidad_personas;
	}
}
