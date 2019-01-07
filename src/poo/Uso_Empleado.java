package poo;

import java.util.*;

public class Uso_Empleado {

	public static void main(String[] args) {
		
		Jefatura jefeRRHH = new Jefatura ("Teemo", 15000, 2000, 12, 10);
		
		jefeRRHH.establece_incentivo(3000);
		
		Empleado [] Empleados = new Empleado [6];
		
		Empleados[0]=new Empleado("Luis", 6500, 2016, 12, 3);
		Empleados[1]=new Empleado("Lira", 7000, 2018, 8, 27);
		Empleados[2]=new Empleado("Arturo", 8000, 2010, 1, 1);
		Empleados[3]=new Empleado("Juan");

		// Polimorfismo - Principio de sustitución
		Empleados[4]=jefeRRHH;
		Empleados[5]= new Jefatura("Tristana", 20000, 1999, 5, 19); 
		
		Jefatura jefaFinanzas=(Jefatura) Empleados[5];
		jefaFinanzas.establece_incentivo(5000);
		
		System.out.println(jefaFinanzas.tomar_decisiones("Dar más días de vacaciones" + "\n"));
		
		for (Empleado e: Empleados) {
			e.aumentoSueldo(5);
		}

		
		Arrays.sort(Empleados);
		
		
		for (Empleado e: Empleados) {
			System.out.println("ID " + e.dameId() + " - " + 
					" Nombre " + e.dameNombre() + 
					/* Polimorfismo - Java sabe cuándo ir a dameSueldo() de Empleado
					 * y cuando ir a dameSueldo() de Jefatura 
					 */
					" | Sueldo $ " + e.dameSueldo() +
					" | Fecha Alta " + e.dameFechaContrato());
		}
	}

}

//------------------------ Clase Empleado ------------------------//

						// Incluyendo interfaz

class Empleado implements Comparable {
	
	public Empleado (String nom, double sue, int year, int month, int day) {
		
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario = new GregorianCalendar(year, month-1, day);
		altaContrato = calendario.getTime();
		id = idSiguiente;
		idSiguiente++;
		
	}
	
	public Empleado (String nom) {
		this(nom, 30000, 2000, 01, 01);
	}
	
	
	
	// Métodos
	public String dameNombre() {
		return nombre;
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
	
	// Construir CompareTo
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado = (Empleado) miObjeto;
		if (this.id < otroEmpleado.id) {
			return -1;
		}
		if (this.id > otroEmpleado.id ) {
			return 1;
		}
		
		return 0;
	}
	
	// Declaración de variable de clase
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private int id;
	private static int idSiguiente = 1;

}


//------------------------ Clase Jefatura ------------------------//

class Jefatura extends Empleado implements Jefes {
	
	public Jefatura (String nom, double sue, int year, int month, int day) {
		super(nom, sue, year, month, day);	
	}
	
	// Métodos
	public void establece_incentivo(double b) {
		incentivo=b;
	}
	
	public double dameSueldo () {
		double sueldoJefe = super.dameSueldo();
		return sueldoJefe + incentivo	; 
	}
	
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección ha tomado la decisión de: " + decision;
	}
	
	// Declaración de variable de clase
	private double incentivo;
	
}