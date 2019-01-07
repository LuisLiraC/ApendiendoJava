package poo;

public class Constante {
	
	public static void main(String[] args) {
		
		Empleados trabajador1 = new Empleados ("Luis");
		Empleados trabajador2 = new Empleados ("Lira");
		
		trabajador1.cambiaSeccion("RRHH");
		
		
		System.out.println(trabajador1.dameDatos() + "\n" +
						   trabajador2.dameDatos());

							// Llamado de método Static 				
		System.out.println(Empleados.dameIdSiguiente());
	}

}




class Empleados {
	
	public Empleados (String nom) {
		
		nombre=nom;
		seccion="Administración";
		id = idSiguiente;
		idSiguiente++;
				
	}
	
	// Declaración de variables de clase
	private final String nombre;
	private String seccion;
	private int id;
	private static int idSiguiente = 1;
		
	// Setter
	public void cambiaSeccion(String seccion) {
		
		this.seccion=seccion;
	}
	
	
	// Getter
	public String dameDatos() {
		return "Trabajador número: " + id + " Nombre es " + nombre + " y su sección es " + seccion;
	}
	
	// Declaración de método Static
	public static String dameIdSiguiente() {
		return "El Id siguiente es " + idSiguiente;
	}
}
