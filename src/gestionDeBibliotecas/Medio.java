package gestionDeBibliotecas;

import java.time.LocalDate;

public interface Medio {
	
	String getTitulo();
	LocalDate getFechaAdquisicion();
	Double getPrecio();
	TipoPrestamo getPrestamo();

	void setPrestamo(TipoPrestamo prestamo);
	
}
