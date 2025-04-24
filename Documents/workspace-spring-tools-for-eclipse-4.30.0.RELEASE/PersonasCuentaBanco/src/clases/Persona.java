package clases;

public class Persona {
	String nombre;
	int edad;
	
	public Persona(String nombrePersona, int edadPersona){
		this.nombre = nombrePersona;
		this.edad = edadPersona;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setNombre(String nombrePersona) {
		this.nombre = nombrePersona;
	}
	
	public void setEdad(int edadPersona) {
		this.edad = edadPersona;
	}
	
	public void despliegaInformacion() {
		System.out.println("Nombre de la persona: " + this.nombre);
		System.out.println("Edad de la persona: " +this.edad);
	}
	
	
}