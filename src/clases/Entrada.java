package clases;

import java.util.Scanner;

public class Entrada {
	public static int entero(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg);
        return sc.nextInt();
    }

    public static float flotante(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg);
        return sc.nextFloat();
    }

    public static double doble(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg);
        return sc.nextDouble();
    }

    public static String cadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg);
        return sc.nextLine();
    }
    
    public static char caracter( String msg ) {
    	Scanner sc = new Scanner( System.in );
    	System.out.println( "" + msg );
    	return sc.next().charAt( 0 ) ;
    }
}
