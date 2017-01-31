package gestionDeBibliotecas;

import java.time.LocalDate;

public interface Libro extends Comparable<Libro> {

	String getISBN();

	String getAutor();

	Integer getNumPaginas();

	Integer getNumeroCopias();

	Boolean getEsBestSeller();

	Integer getDiasPrestamo(TipoPrestamo prestamo);

	String getTitulo();

	LocalDate getFechaAdquisicion();

	Double getPrecio();

	TipoPrestamo getPrestamo();

	void setPrestamo(TipoPrestamo prestamo);

	void setNumeroCopias(Integer copias);

}
