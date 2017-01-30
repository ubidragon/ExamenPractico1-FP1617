package gestionDeBibliotecas;

import java.time.LocalDate;

public interface Prestamo {

	Persona getUsuario();
	Libro getLibro();
	LocalDate getFechaPrestamo();
	LocalDate getFechaDevolucion();
	
	void setFechaPrestamo(LocalDate fechaPrestamo);
	
}
