package gestionDeBibliotecas.test;

import java.time.LocalDate;
import java.time.Month;
import gestionDeBibliotecas.Biblioteca;
import gestionDeBibliotecas.BibliotecaImpl;
import gestionDeBibliotecas.Libro;
import gestionDeBibliotecas.LibroImpl;
import gestionDeBibliotecas.Persona;
import gestionDeBibliotecas.PersonaImpl;
import gestionDeBibliotecas.TipoPrestamo;

public class TestBiblioteca {
	
	static String ubidragon = "   	                                    $,  $,     ,             "
			+ "\n     Powered                            ss.$ss. .s'      "
			+ "\n                                ,     .ss$$$$$$$$$$s,               "
			+ "\n              by                $. s$$$$$$$$$$$$$$`$$Ss        "
			+ "\n                                 $$$$$$$$$$$$$$$$$$o$$$       ,        "
			+ "\n                               s$$$$$$$$$$$$$$$$$$$$$$$$s,  ,s   "
			+ "\n                              s$$$$$$$$$'$$$$$$''''$$$$$$'$$$$$,      "
			+ "\n                              s$$$$$$$$$$s''$$$$ssssss'$$$$$$$$'    "
			+ "\n                             s$$$$$$$$$$'         `'''ss'$'$s''       "
			+ "\n                             s$$$$$$$$$$,              `''''$  .s$$s "
			+ "\n                             s$$$$$$$$$$$$s,...               `s$$'  ` "
			+ "\n                         `ssss$$$$$$$$$$$$$$$$$$$$####s.     .$$'$.   , s- "
			+ "\n                           `''''$$$$$$$$$$$$$$$$$$$$#####$$$$$$'     $.$' "
			+ "\n                                 '$$$$$$$$$$$$$$$$$$$$$####s'''     .$$$| "
			+ "\n                                  '$$$$$$$$$$$$$$$$$$$$$$$$##s    .$$' $  "
			+ "\n                                   $$''$$$$$$$$$$$$$$$$$$$$$$$$$$$$$'   ` "
			+ "\n                                  $$'  '$'$$$$$$$$$$$$$$$$$$$$S'''''  "
			+ "\n                             ,   ,'     '  $$$$$$$$$$$$$$$$####s   "
			+ "\n                             $.          .s$$$$$$$$$$$$$$$$$####' "
			+ "\n                 ,           '$s.   ..ssS$$$$$$$$$$$$$$$$$$$####' "
			+ "\n                 $           .$$$S$$$$$$$$$$$$$$$$$$$$$$$$#####' "
			+ "\n                 Ss     ..sS$$$$$$$$$$$$$$$$$$$$$$$$$$$######'' "
			+ "\n                  '$$sS$$$$$$$$$$$$$$$$$$$$$$$$$$$########' "
			+ "\n           ,      s$$$$$$$$$$$$$$$$$$$$$$$$#########''' "
			+ "\n           $    s$$$$$$$$$$$$$$$$$$$$$#######'''      s'         , "
			+ "\n           $$..$$$$$$$$$$$$$$$$$$######''       ....,$$....    ,$ "
			+ "\n            '$$$$$$$$$$$$$$$######'' ,     .sS$$$$$$$$$$$$$$$$s$$ "
			+ "\n              $$$$$$$$$$$$#####'     $, .s$$$$$$$$$$$$$$$$$$$$$$$$s. "
			+ "\n   )          $$$$$$$$$$$#####'      `$$$$$$$$$###########$$$$$$$$$$$. "
			+ "\n  ((          $$$$$$$$$$$#####       $$$$$$$$###'       '####$$$$$$$$$$  "
			+ "\n  ) (         $$$$$$$$$$$$####.     $$$$$$###'             '###$$$$$$$$$   s' "
			+ "\n (   )        $$$$$$$$$$$$$####.   $$$$$###'                ####$$$$$$$$s$$' "
			+ "\n )  ( (       $$'$$$$$$$$$$$#####.$$$$$###'  Ubidragon     .###$$$$$$$$$$' "
			+ "\n (  )  )   _,$'   $$$$$$$$$$$$######.$$##'                .###$$$$$$$$$$ "
			+ "\n ) (  ( ).         '$$$$$$$$$$$$$#######,,,.          ..####$$$$$$$$$$$' "
			+ "\n(   )$ )  )        ,$$$$$$$$$$$$$$$$$$####################$$$$$$$$$$$'         "
			+ "\n(   ($$  ( )     _sS'  `'$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$S$$,        "
			+ "\n )  )$$$s ) )  .      .   `$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$''  `$$    "
			+ "\n  (   $$$Ss/  .$,    .$,,s$$$$$$##S$$$$$$$$$$$$$$$$$$$$$$$$S''        '  "
			+ "\n    ))_$$$$$$$$$$$$$$$$$$$$$$$##'  $$        `$$.        `$$. "
			+ "\n        `'S$$$$$$$$$$$$$$$$$#'      $          `$          `$ "
			+ "\n            `''''''''''''''         '           '           '  ";

	public static void main(String[] args) throws InterruptedException {

		noPlagio();
		
		Biblioteca b1 = new BibliotecaImpl("Biblioteca Provincial", "Sevilla");
		Biblioteca b2 = new BibliotecaImpl("Biblioteca de Mordor", "Cordoba");

		Libro l = new LibroImpl("7878997981", "Angie Sage", "Septimus", 1012, 12, 25.0, LocalDate.of(2014, 4, 15),
				TipoPrestamo.DIARIO);

		Libro l2 = new LibroImpl("156+4894789", "C.S. Lewis", "Narnia", 1045, 125689, 25.0, LocalDate.of(2010, 5, 16),
				TipoPrestamo.SEMANAL);

		Libro l3 = new LibroImpl("56156189156159", "Patrick Rothfuss", "El nombre del viento", 104, 120000, 25.0,
				LocalDate.of(2016, 9, 28), TipoPrestamo.MENSUAL);

		Persona p = new PersonaImpl("63732810V", "demoUser", "Hidalgo Perez", LocalDate.of(1990, 5, 25));

		Persona p2 = new PersonaImpl("85903355B", "demoUser2", "Hidalgo Perez", LocalDate.of(2016, 9, 18));

		Persona p3 = new PersonaImpl("52751668H", "demoUser3", "Hidalgo Perez", LocalDate.of(2002, 10, 8));

		agregarUsuariosYLibros(b1, l, p);
		agregarUsuariosYLibros(b1, l2, p2);
		agregarUsuariosYLibros(b1, l3, p3);
		System.out.println("\n\n******** Fin de Adiccion de elementos a la Biblioteca b1");

		agregarUsuariosYLibros(b2, l, p);
		agregarUsuariosYLibros(b2, l2, p2);
		creacionPrestamos(b2, l, p);

		creacionPrestamos(b1, l3, p);
		// creacionPrestamos(b1, l2, p);
		creacionPrestamos(b1, l, p);
		creacionPrestamos(b1, l3, p2);
		// creacionPrestamos(b1, l2, p2);
		creacionPrestamos(b1, l, p2);
		creacionPrestamos(b1, l3, p3);
		// creacionPrestamos(b1, l2, p3);
		creacionPrestamos(b1, l, p3);
		System.out.println(b1.getPrestamos());
		cuentaPrestamos(b1, l3, p2, Month.JANUARY);
		cuentaPrestamos(b1, l, p3, Month.DECEMBER);

		muestraBiblioteca(b1);

		System.out.println("\n testeo de operaciones ");
		mesConMasPrestamos(b1);
		mesConMasPrestamos(b2);
		librosNuncaPrestados(b1);
		librosNuncaPrestados(b2);
		usuariosNuncaPrestados(b1);
		usuariosNuncaPrestados(b2);

		System.out.println("\n testeo de excepciones ");
		testeoExcepciones();

	}
	
	private static void noPlagio() throws InterruptedException {

		for (int i = 0; i < ubidragon.length(); i++) {
			Thread.sleep(2);
			System.out.print(ubidragon.charAt(i));
		}

	}

	private static void agregarUsuariosYLibros(Biblioteca b, Libro l, Persona p) {

		System.out.println("\n\t ***Agregando Usuario --> " + p.getNombre());
		b.nuevoUsuario(p);
		System.out.println("Usuario agregado satisfactoriamente");
		System.out.println("\t ***Agregando Libro --> " + l.getTitulo());
		b.nuevoLibro(l);
		System.out.println("Libro agregado satisfactoriamente");

	}

	private static void creacionPrestamos(Biblioteca b, Libro l, Persona p) {

		System.out.println("\n\t ***Usuario Solicitante --> " + p.getNombre());
		System.out.println("\t ***Libro Solicitado --> " + l.getTitulo());
		b.nuevoPrestamo(l, p);
		System.out.println("Libro prestado satisfactoriamente");
	}

	private static void mesConMasPrestamos(Biblioteca b) {

		System.out.println("Mes con mas prestamos de la " + b.getNombre() + ": " + b.getMesConMasPrestamos());

	}

	private static void cuentaPrestamos(Biblioteca b, Libro l, Persona p, Month m) {

		System.out.println("\nPrestamos del Usuario: " + p.getNombre());
		System.out.println(b.cuentaPrestamos(p));
		System.out.println("\nPrestamos del Libro: " + l.getTitulo());
		System.out.println(b.cuentaPrestamos(l));
		System.out.println("\nPrestamos del Mes: " + m);
		System.out.println(b.cuentaPrestamos(m));
		System.out.println("\n\n******** Fin del Informe de Prestamos de " + b + " en el mes de " + m);

	}

	private static void librosNuncaPrestados(Biblioteca b) {

		System.out.println("Libros nunca prestados: " + b.seleccionaLibrosSinPrestamos());

	}

	private static void usuariosNuncaPrestados(Biblioteca b) {

		System.out.println("Usuarios sin prestamos: " + b.seleccionaUsuariosSinPrestamos());

	}

	private static void testeoExcepciones() {
		System.out.println("\n Añadiendo nuevos elementos y sus parametros para testear");
		System.out.println("Biblioteca nula");
		testExcepciones(null, null);
		System.out.println("Eliminar libro no existente");
		testExcepciones2("Biblioteca de Mordor", "Cordoba");

	}

	private static void testExcepciones2(String nombre, String localidad) {

		try {

			Biblioteca b = new BibliotecaImpl(nombre, localidad);
			Libro l = new LibroImpl("561561891561459", "Patrick Rothfuss", "Musica del viento", 104, 120000, 25.0,
					LocalDate.of(2016, 9, 28), TipoPrestamo.MENSUAL);
			b.eliminaLibro(l);

		} catch (IllegalArgumentException e) {

			System.out.println("\n\t\t Ha devuelto correctamente la excepcion");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(
					"\n ERROR!!!! \nERROR!!!  \nERROR!!!  \nERROR!!! \nLA EXCEPCION LANZADA NO ES LA REGISTRADA \n GILIPOLLAS REVISA EL CODIGO");

		}

	}

	private static void testExcepciones(String nombre, String localidad) {

		try {

			Biblioteca b = new BibliotecaImpl(nombre, localidad);

			muestraBiblioteca(b);

		} catch (IllegalArgumentException e) {

			System.out.println("\n\t\t Ha devuelto correctamente la excepcion");

		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(
					"\n ERROR!!!! \nERROR!!!  \nERROR!!!  \nERROR!!! \nLA EXCEPCION LANZADA NO ES LA REGISTRADA \n GILIPOLLAS REVISA EL CODIGO");

		}

	}

	private static void muestraBiblioteca(Biblioteca b) {

		System.out.println("Motrando Informacion del Elemento: " + b);
		System.out.println("Listado completo de Libros: " + b.getLibros());
		System.out.println("\nListado Completo de Usuarios: " + b.getPersonas());
		System.out.println("\nListado de Libros en Prestamo: " + b.getPrestamos());
		System.out.println();

	}

}
