package gestionDeBibliotecas;

import java.time.LocalDate;

public interface Prestamo extends Comparable<Prestamo>{

	Persona getUsuario();

	Libro getLibro();

	LocalDate getFechaPrestamo();

	LocalDate getFechaDevolucion();

	void setFechaPrestamo(LocalDate fechaPrestamo);

}
