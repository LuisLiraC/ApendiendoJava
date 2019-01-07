package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		
		Persona [] LasPersonas = new Persona [2];
		
		LasPersonas[0] = new Empleado2 ("Luis", 10000, 2018, 12, 20);
		LasPersonas[1] = new Alumno ("Lira", "Programación");
		
		for(Persona p: LasPersonas) {
			System.out.println("Nombre: " + p.dameNombre() + " | " + p.dameDescripcion());
		}
	}

}


//---------------------------- Clase Persona ----------------------------//

abstract class Persona {
	 
	// Constructor
	public Persona (String nom) {
		nombre = nom;
	}
	
	// Métodos
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	// Declaración de variables de clase
		private String nombre;
	
}

//---------------------------- Clase Empleado 2----------------------------//

class Empleado2 extends Persona {
	
	public Empleado2 (String nom, double sue, int year, int month, int day) {
		
		super(nom);
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
		altaContrato = calendario.getTime();
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	
	// Métodos
	public String dameDescripcion() {
		return "ID de empleado - " + id + " | Sueldo de $ " + sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void aumentoSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	public int dameId() {
		return id;
	}
	
	
	// Declaración de variables de clase
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;

}


//---------------------------- Clase Alumno 2----------------------------//

class Alumno extends Persona {
	
	public Alumno (String nom, String car) {
		super(nom);
		carrera=car;
	}
	
	// Métodos
	
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera;
	}
	
	
	// Declaración de variables de clase
	private String carrera;
}