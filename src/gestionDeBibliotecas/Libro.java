package gestionDeBibliotecas;

import java.time.LocalDate;

public interface Libro extends Medio {

	String getISBN();

	String getAutor();

	Integer getNumPaginas();

	Integer getNumeroCopias();

	Boolean getEsBestSeller();

	Integer getDiasPrestamo(TipoPrestamo prestamo);

	void setNumeroCopias(Integer copias);

}
