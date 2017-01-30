package gestionDeBibliotecas;

import java.time.LocalDate;



public interface Libro {
	
	String getISBN();
	String getTitulo();
	String getAutor();
	Integer getNumPaginas();
	LocalDate getFechaAdquisicion();
	Double getPrecio();
	Integer getNumeroCopias();
	Boolean getEsBestSeller();
	TipoPrestamo getTipoPrestamo();
	
	String diasPrestamo(TipoPrestamo prestamo);
	void setNumeroCopias(Integer copias);
	void cambioPrestamo(TipoPrestamo prestamo);
	
	

}
