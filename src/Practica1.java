import clases.Alumno;
import clases.Entrada;

public class Practica1 {
	public static final int numeroAlumnos = 5; //informacion a nivel de clase
	
	//metodo principal, aqui se ejecuta el programa
	public static void main(String args[]) {
		Alumno alumnos[] = new Alumno[ numeroAlumnos ]; //arreglo para almacenar nombres y calificaciones
		boolean flag = true; //variable para determinar si el ciclo continua o no
		
		for( int i = 0; i < alumnos.length; i++ ) {
			alumnos[i] = new Alumno(); 
		}
		
		do {
			System.out.println( "1) Capurar nombre y calificaciones." );
			System.out.println( "2) Imprimir calificaciones y promedio de calificaciones." );
			System.out.println( "3) Imprimir calificaciones y calificacion mas baja." );
			System.out.println( "4) Imprimir calificaciones y calificacion mas alta." );
			System.out.println( "5) Salir." );
			
			int opcion = Entrada.entero( "Seleccione una opcion y preciones ENTER: ");
			
			//ejecuta una de las 5 opciones
			switch( opcion ) {
				case 1:
					capturarNombreCalificaciones( alumnos );
					break;
				case 2: 
					calificacionesPromedio( alumnos );
					break;
				case 3:
					calificacionesMasBaja( alumnos );
					break;
				case 4:
					calificacionesMasAlta( alumnos );
					break;
				case 5:
					flag = false; //ya no se continua con el ciclo
					break;
				default:
					System.out.println("Selecciones una opcion valida\n.");
			}
		}while( flag ); //continua hasta que flag sea false
	}
	
	//opciones del menu
	
	//imprime todas las calificaciones y el promedio
	private static void calificacionesPromedio( Alumno alumnos[] ) {
		imprimirCalificaciones( alumnos );
		promedio( alumnos );
	}
	
	//imprime todas las calificaciones y la calificacion mas baja
	private static void calificacionesMasBaja( Alumno alumnos[] ) {
		imprimirCalificaciones( alumnos );
		masBaja( alumnos );
	}
	
	//imprime tadas las calificaciones y la calificacion mas alta
	private static void calificacionesMasAlta( Alumno alumnos[] ) {
		imprimirCalificaciones( alumnos );
		masAlta( alumnos );
	}
	
	//captura los nombres y calificaciones de cada alumno y los almacena en 
	//en el arreglo
	private static void capturarNombreCalificaciones( Alumno alumnos[] ) {
		for( int i = 0; i < alumnos.length; i++ ) {
			System.out.print( "\nAlumno " + ( i + 1 ) + ":\n" );
			alumnos[i].establecerNombre( Entrada.cadena( "Nombre: " ) );
			
			//verifica que la calificacion este entre 0 y 10
			//si no es valida, sigue preguntando por una calificacion valida
			//si la calificacion es valida, no entra en el ciclo
			int calificacion = Entrada.entero( "Calificacion: " );
			while( calificacion < 0 || calificacion > 10 ) {
				System.out.println("Escriba una calificacion valida.\n");
				calificacion = Entrada.entero("Calificacion: " );
			}
			
			alumnos[i].establecerCalificacion( calificacion );
		}
		System.out.println(); //linea en blanco
	}
	
	//funciones auxiliares
	
	//metodo que imprime todas las calificaciones del arreglo
	private static void imprimirCalificaciones( Alumno alumnos[] ) {
		for( int i = 0; i < alumnos.length; i++ ) {
			System.out.print( "Alumno " + ( i + 1 ) + ": " );
			System.out.println( alumnos[i].obtenerCalificacion() );
		}
	}
	
	//recorre todo el arreglo y obtiene el promedio
	private static void promedio( Alumno alumnos[] ) {
		double promedio = 0;
		
		for( int i = 0; i < alumnos.length; i++ ) {
			promedio += alumnos[i].obtenerCalificacion();
		}
		System.out.println( "Promedio: " + promedio/alumnos.length + "\n" );
	}
	
	//recorre todo el arreglo e identifica la calificacion mas baja
	private static void masBaja( Alumno alumnos[] ) {
		int minimo = alumnos[0].obtenerCalificacion();
		
		for( int i = 1; i < alumnos.length; i++ ) {
			if( alumnos[i].obtenerCalificacion() < minimo )
				minimo = alumnos[i].obtenerCalificacion();
		}
		
		System.out.println( "La calificacion mas baja fue: " + minimo + "\n" );
	}
	
	//recorre todo el arreglo e identifica la calificacion mas alta
	private static void masAlta( Alumno alumnos[] ) {
		int maximo = alumnos[0].obtenerCalificacion();
		
		for( int i = 1; i < alumnos.length; i++ ) {
			if( alumnos[i].obtenerCalificacion() > maximo )
				maximo = alumnos[i].obtenerCalificacion();
		}
		
		System.out.println( "La calificacion mas alta fue: " + maximo + "\n" );
	}
}
