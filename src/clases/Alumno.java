package clases;

public class Alumno {
	private String nombre;
	private int calificacion;
	
	public String obtenerNombre() {
		return nombre;
	}
	
	public void establecerNombre( String nombre ) {
		this.nombre = nombre;
	}
	
	public int obtenerCalificacion() {
		return calificacion;
	}
	
	public void establecerCalificacion( int calificacion ) {
		if( calificacion >= 0 && calificacion <= 10 )
			this.calificacion = calificacion;
		else {
			this.calificacion = 0;
			System.out.println("Calificacion invalida.\n");
		}
	}
}
