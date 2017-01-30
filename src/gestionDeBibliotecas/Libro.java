package gestionDeBibliotecas;

import java.time.LocalDate;



public interface Libro {
	
	String getISBN();
	String getTitutlo();
	String getAutor();
	Integer getNumPaginas();
	LocalDate getFechaAdquisicion();
	Double getPrecio();
	Integer getNumeroCopias();
	Boolean getEsBestSeller();
	TipoPrestamo getTipoPrestamo();
	
	void diasPrestamo(TipoPrestamo prestamo);
	void setNumeroCopias(Integer copias);
	void cambioPrestamo(TipoPrestamo prestamo);
	
	

}
