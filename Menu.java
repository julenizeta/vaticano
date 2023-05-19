package reto6;
import java.util.Scanner;

public class Menu {

	/**
	 * El método principal que se ejecuta al iniciar el programa.
	 *
	 * @param args los argumentos de línea de comandos
	 */
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    final int OPCIONES = 4;
	    int categoriaElegida;

	    System.out.println("// -------------------------------------------- //");

	    System.out.println("Bienvenido al programa sobre la Ciudad del Vaticano.");

	    do {
	        System.out.println("Inserta un numero para seleccionar una opcion:");
	        System.out.println("1. Calendario");
	        System.out.println("2. Guía turística");
	        System.out.println("3. Historia");
	        System.out.println("4. Quiz");

	        categoriaElegida = pedirNumero(OPCIONES);

	        System.out.println("-------------");

	        switch (categoriaElegida) {
	            case 1:
	                Calendario.main(args);
	                break;
	            case 2:
	                Guiaturistica.main(args);
	                break;
	            case 3:
	                Historia.main(args);
	                break;
	            case 4:
	                Quiz.main(args);
	                break;
	        }

	        if (categoriaElegida < 1 || categoriaElegida > OPCIONES) {
	            System.out.println("El numero insertado no está en el rango permitido!");
	        }

	    } while (categoriaElegida < 1 || categoriaElegida > OPCIONES);
	}

	/**
	 * Método que solicita al usuario un número entre 1 y un número máximo.
	 *
	 * @param max el número máximo permitido
	 * @return el número ingresado por el usuario
	 */
	public static int pedirNumero(int max) {
	    Scanner sc = new Scanner(System.in);
	    int num;

	    do {
	        System.out.print("Introduce un número entre 1 y " + max + ": ");
	        num = sc.nextInt();
	        if (num < 1 || num > max) {
	            System.out.println();
	            System.out.println("El número no es válido!");
	            System.out.println();
	        }

	    } while (num < 1 || num > max);
	    return num;
	}


}
