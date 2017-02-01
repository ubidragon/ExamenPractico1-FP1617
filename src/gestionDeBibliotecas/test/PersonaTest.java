package gestionDeBibliotecas.test;

import java.time.LocalDate;

import gestionDeBibliotecas.Persona;
import gestionDeBibliotecas.PersonaImpl;

public class PersonaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		casoDePrueba5();
		casoDePrueba6();
		casoDePrueba7();
		casoDePrueba8();
		casoDePrueba9();

	}

	private static void casoDePrueba5() {

		System.out.println(
				"\n\n Caso de prueba <==============> Ubidragon" + "\n D.N.I.: LONGITUD" + "\n demasiado corto");

		System.out.println("\n\t referido al CONSTRUCTOR 1");
		testConstructor("1430995F", "Francisco", "Garzon", LocalDate.of(1990, 9, 15), "ubahidarr@alum.us.es");
		System.out.println("\n\t referido al CONSTRUCTOR 2");
		testConstructor2("8799647K", "Pedro", "Hidalgo", LocalDate.of(1990, 9, 15));

	}

	private static void casoDePrueba6() {

		System.out.println(
				"\n\n Caso de prueba <==============> Ubidragon" + "\n D.N.I.: LONGITUD" + "\n demasiado largo ");

		System.out.println("\n\t referido al CONSTRUCTOR 1");
		testConstructor("145309595F", "Francisco", "Garzon", LocalDate.of(1990, 9, 15), "ubahidarr@alum.us.es");
		System.out.println("\n\t referido al CONSTRUCTOR 2");
		testConstructor2("874939647K", "Pedro", "Hidalgo", LocalDate.of(1990, 9, 15));

	}

	private static void casoDePrueba7() {

		System.out.println("\n\n Caso de prueba <==============> Ubidragon" + "\n D.N.I.: CARACTERES"
				+ "\n mas letras de la cuenta y menos numeros");

		System.out.println("\n\t referido al CONSTRUCTOR 1");
		testConstructor("14309595AF", "Francisco", "Garzon", LocalDate.of(1990, 9, 15), "ubahidarr@alum.us.es");
		System.out.println("\n\t referido al CONSTRUCTOR 2");
		testConstructor2("87939647QK", "Pedro", "Hidalgo", LocalDate.of(1990, 9, 15));
	}

	private static void casoDePrueba8() {

		System.out.println("\n\n Caso de prueba <==============> Ubidragon" + "\n D.N.I.: Letra"
				+ "\n letra introducida erroneamente");

		System.out.println("\n\t referido al CONSTRUCTOR 1");
		testConstructor("14309595P", "Francisco", "Garzon", LocalDate.of(1990, 9, 15), "ubahidarr@alum.us.es");
		System.out.println("\n\t referido al CONSTRUCTOR 2");
		testConstructor2("87939647J", "Pedro", "Hidalgo", LocalDate.of(1990, 9, 15));

	}

	private static void casoDePrueba9() {

		System.out.println(
				"\n\n Caso de prueba <==============> Ubidragon" + "\n D.N.I.: Letra" + "\n letra en lugar no valido");

		System.out.println("\n\t referido al CONSTRUCTOR 1");
		testConstructor("143095F95", "Francisco", "Garzon", LocalDate.of(1990, 9, 15), "ubahidarr@alum.us.es");
		System.out.println("\n\t referido al CONSTRUCTOR 2");
		testConstructor2("87939Q647", "Pedro", "Hidalgo", LocalDate.of(1990, 9, 15));

	}

	private static void testConstructor(String dni, String nombre, String apellidos, LocalDate fechaNacimiento,
			String email) {

		try {

			Persona pers = new PersonaImpl(dni, nombre, apellidos, fechaNacimiento, email);

			// mostrarPersona(pers);

		} catch (IllegalArgumentException e) {

			System.out.println("\n\t\t\t Ha devuelto correctamente la excepcion");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(
					"\n ERROR!!!! \nERROR!!!  \nERROR!!!  \nERROR!!! \nLA EXCEPCION LANZADA NO ES LA REGISTRADA \n GILIPOLLAS REVISA EL CODIGO");

		}

	}

	private static void testConstructor2(String dni, String nombre, String apellidos, LocalDate fechaNacimiento) {

		try {

			Persona pers = new PersonaImpl(dni, nombre, apellidos, fechaNacimiento);

			// mostrarPersona(pers);

		} catch (IllegalArgumentException e) {

			System.out.println("\n\t\t\t Ha devuelto correctamente la excepcion");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(
					"\n ERROR!!!! \nERROR!!!  \nERROR!!!  \nERROR!!! \nLA EXCEPCION LANZADA NO ES LA REGISTRADA \n GILIPOLLAS REVISA EL CODIGO");

		}
	}
}
