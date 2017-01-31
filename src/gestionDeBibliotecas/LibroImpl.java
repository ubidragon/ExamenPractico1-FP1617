package gestionDeBibliotecas;

import java.time.LocalDate;

public class LibroImpl extends MedioImpl implements Libro {
	private String isbn, autor;
	private Integer paginas, copias;


	public LibroImpl(String isbn, String titulo, String autor, Integer paginas, LocalDate fechaAdquisicion,
			Double precio, Integer copias, TipoPrestamo prestamo) {
		super(titulo, fechaAdquisicion, precio, prestamo);
		this.isbn = isbn;
		
		this.autor = autor;
		this.paginas = paginas;
		this.copias = copias;
	
	
	}

	public String getISBN() {

		return isbn;
	}

	public String getAutor() {

		return autor;
	}

	public Integer getNumPaginas() {

		return paginas;
	}


	public Integer getNumeroCopias() {

		return copias;
	}

	public Boolean getEsBestSeller() {

		Boolean res = false;

		if (copias >= 500000) {
			res = true;
		}

		return res;
	}


	public Integer getDiasPrestamo(TipoPrestamo prestamo) {
		Integer res = 0;
		switch (prestamo) {
		case DIARIO:
			res = 1;
			break;
		case SEMANAL:
			res = 7;
			break;
		case MENSUAL:
			res = 30;
			break;
		default:
			res = null;
		}

		return res;

	}

	public void setNumeroCopias(Integer copias) {

		this.copias = copias;

	}


	public String toString() {

		return getTitulo() + " (ISBN: " + getISBN() + ")";
	}
}
