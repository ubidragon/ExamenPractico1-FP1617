package gestionDeBibliotecas;

import java.time.LocalDate;

public class LibroImpl implements Libro {
	private String isbn, titulo, autor;
	private Integer paginas, copias;
	private LocalDate fechaAdquisicion;
	private Double precio;
	private TipoPrestamo prestamo;

	public LibroImpl(String isbn, String titulo, String autor, Integer paginas, LocalDate fechaAdquisicion,
			Double precio, Integer copias, TipoPrestamo prestamo) {
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
		this.copias = copias;
		this.fechaAdquisicion = fechaAdquisicion;
		this.precio = precio;
		this.prestamo = prestamo;
	}

	public String getISBN() {

		return isbn;
	}

	public String getTitulo() {

		return titulo;
	}

	public String getAutor() {

		return autor;
	}

	public Integer getNumPaginas() {

		return paginas;
	}

	public LocalDate getFechaAdquisicion() {

		return fechaAdquisicion;
	}

	public Double getPrecio() {

		return precio;
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

	public TipoPrestamo getTipoPrestamo() {

		return prestamo;
	}

	public String diasPrestamo(TipoPrestamo prestamo) {
		String res = null;
		switch (prestamo) {
		case DIARIO:
			res = "1 dia";
			break;
		case SEMANAL:
			res = "7 dias";
			break;
		case MENSUAL:
			res = "30 dias";
			break;
		default:
			res = null;
		}

		return res;

	}

	public void setNumeroCopias(Integer copias) {

		this.copias = copias;

	}

	public void cambioPrestamo(TipoPrestamo prestamo) {

		this.prestamo = prestamo;

	}

	public String toString() {

		return getTitulo() + " (ISBN: " + getISBN() + ")";
	}
}
