package reto6;

import java.util.Scanner;

/**
 * 
 * GUÍA TURÍSTICA DE LA CIUDAD DEL VATICANO
 * 
 * @author Iñigo Valdivia
 * 
 *
 */

public class Guiaturistica {

	/**
	 * 
	 * METODO QUE PIDE AL USUARIO Y VALIDA UN NÚMERO DEL 1 AL 4
	 * 
	 */

	public static int pedirNumValidadoUnoCuatro() {

		Scanner sc = new Scanner(System.in);
		int num;

		do {


			System.out.print("Introduce un número valido: ");

			num = sc.nextInt();

			if (num < 1 || num > 4) { //CONDICION DE MAXIMO Y MINIM0

				System.out.println("El número no es valido!");

			}

		} while (num < 1 || num > 4);

		return num;

	}
	/**
	 * 
	 * METODO QUE PIDE AL USUARIO Y VALIDA UN NÚMERO DEL 0 AL 1
	 * 
	 * 
	 */

	public static int pedirNumValidadoCeroUno() {

		int num;

		do {

			Scanner sc = new Scanner(System.in);

			System.out.print("Para continuar pulsa 1 para salir 0.");

			num = sc.nextInt();

			if (num < 0 || num > 1) { //CONDICION DE MAXIMO Y MINIM0

				System.out.println("El número no es valido, Introduce 1 o 0.");

			}

		} while (num < 1 || num > 0);

		return num;

	}

	/**

	 * 

	 * METODO QUE MUESTRA LAS OPCIONES PARA SELECCIONAR 

	 * 

	 */

	public static void menu() {

		System.out.println();

		System.out.println("Bienvenido a la guia turistica de la Ciudad del Vaticano!");

		String[] menu = new String[4]; //CREACION Y DECLARACION DE MAXIMO ARRAY UNIDIMENSIONAL

		menu[0] = "1.Transporte";

		menu[1] = "2.Gastronomia";

		menu[2] = "3.Hospedaje";

		menu[3] = "4.Monumentos";

		for (int i = 0; i < menu.length; i++) {
			System.out.println(menu[i]);
		}

	}

	/**
	 *
	 * METODO QUE MUESTRA LAS INFORMACION SELECCIONADA 
	 * 
	 */

	public static void seleccionInfo(int opcion) {

		Scanner so = new Scanner(System.in);

		switch (opcion) {

		case 1:

			System.out.println("METRO // El precio del billete de metro es de 1,50€ // Horario de 5:30h a 23:30h ");

			System.out.println();

			System.out.println("PARADAS METRO CERCANAS //");

			System.out.println("- Parada de Cipro");

			System.out.println("- Parada de Ottaviano");

			System.out.println();

			System.out.println("BUS // El precio del billete de metro es de 1,50€ // Horario de 5:30h a 23:30h ");

			System.out.println();

			System.out.println("LINEAS BUS //");

			System.out.println("Bus 64: conecta la estación de Termini con la Ciudad del Vaticano, pasando por Piazza Venezia. Tendréis que bajaros en Ospedale Generale Santo Spirito.\r\n"

        +
        "Bus 62: conecta  Repubblica, Plaza de España, Piazza Venezia… con El Vaticano. Tendréis que bajaros al final de via della conciliazione.\r\n"

        +
        "Bus 40: es un autobús express que para en Termini, Piazza Venezia, Argentina, Piazza Pia (junto al Vaticano).\r\n"

        +
					"Bus 81: conecta el Coliseo, el Circo Massimo, Piazza Venezia, Piazza Colonna, Piazza Imperatore… con el Vaticano. Tendréis que bajar en Piazza Risorgimento");

			break;

		case 2:

			System.out.println("Estos son los platos tradicionales de Italia:");

			System.out.println();

			System.out.println("1 – Spaghetti alla carbonara");

			System.out.println();

			System.out.println("2 – Lasagna");

			System.out.println();

			System.out.println("3 – Pizza Margherita");

			System.out.println();

			System.out.println("4 – Tagliatelle al ragù bolognese");

			System.out.println();

			System.out.println("5 – Risotto alla milanese");

			System.out.println();

			System.out.println("6 – Gelato");

			break;

		case 3:

			System.out.println("En el país de Ciudad de Vaticano no hay hoteles pero estos son los mejores hoteles por los alredores:");

			System.out.println();

			System.out.println("1. Al Ponte Del Papa B&B (Via Aurelia, 62, Vaticano Prati, 00165 Roma, Italia)");

			System.out.println("2. Growel Exclusive Suites San Pietro (Via Ottaviano n°6 piano 2, Vaticano Prati, 00192 Roma, Italia)");

			System.out.println("3. Folia (Via Ottaviano, Vaticano Prati, 00192 Roma, Italia)");

			System.out.println("4. La Porta Rossa di Borgo (Via Cardinal Agliardi 16, Vaticano Prati, 00165 Roma, Italia)");

			System.out.println("5. Cameo B&B (Piazza del Risorgimento, 55, Vaticano Prati, 00192 Roma, Italia)");

			break;

		case 4:

			System.out.println("Estos son los monumentos mas relevantes de Vaticano: ");

			System.out.println();

			System.out.println("1.La Plaza de San Pedro");

			System.out.println();

			System.out.println("2.La Basílica de San Pedro");

			System.out.println();

			System.out.println("3.La Capilla Sixtina");

			System.out.println();

			System.out.println("4.Los doce Museos del Vaticano");

			System.out.println();

			System.out.println("4.Los doce Museos del Vaticano");

			break;

		}

	}

	/**
	 * 
	 * PROGRAMA MAIN QUE EJECUTA TODOS LOS METODOS
	 * 
	 */

	public static void main(String[] args) {

		int ingresado;

		char repetir;

		Scanner sc = new Scanner(System.in);

		do {

			menu();

			System.out.println();

			ingresado = pedirNumValidadoUnoCuatro();

			seleccionInfo(ingresado);

			System.out.println();

			do
			{	
				System.out.println("Inserte 'S' para repetir y 'N' para volver al menu principal.");
				repetir = sc.nextLine().toLowerCase().charAt(0);
				if (repetir != 's' && repetir != 'n')
				{
					System.out.println("Inserte S o N!");
				}
			} while (repetir != 's' && repetir != 'n');


		} while (repetir == 's');
		
		Menu.main(args);

	}

}