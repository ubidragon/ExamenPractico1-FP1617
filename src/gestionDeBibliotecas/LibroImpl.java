package gestionDeBibliotecas;

import java.time.LocalDate;

import fp.utiles.Checkers;

public class LibroImpl implements Libro {
	private String isbn, autor, titulo;
	private Integer paginas, copias;
	private Double precio;
	private LocalDate adquisicion;
	private TipoPrestamo prestamo;

	public LibroImpl(String isbn, String autor, String titulo, Integer paginas, Integer copias, Double precio,
			LocalDate adquisicion, TipoPrestamo prestamo) {

		Checkers.check("paginas", checkPaginas(paginas));
		Checkers.check("aDQUISICION", checkAdquisicion(adquisicion));
		Checkers.check("COPIAS", checkVentas(copias));

		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
		this.paginas = paginas;
		this.copias = copias;
		this.precio = precio;
		this.adquisicion = adquisicion;
		this.prestamo = prestamo;
	}

	private Boolean checkPaginas(Integer pag) {

		return pag > 0;

	}

	private Boolean checkAdquisicion(LocalDate fecha) {

		return fecha.isBefore(LocalDate.now()) || fecha.equals(LocalDate.now());
	}

	private Boolean checkVentas(Integer c) {
		return c > 0;
	}

	public String getTitulo() {

		return titulo;
	}

	public LocalDate getFechaAdquisicion() {

		return adquisicion;
	}

	public Double getPrecio() {

		return precio;
	}

	public TipoPrestamo getPrestamo() {

		return prestamo;
	}

	public void setPrestamo(TipoPrestamo prestamo) {

		this.prestamo = prestamo;

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

	public boolean equals(Object o) {
		boolean res = false;

		if (o instanceof Libro) {
			Libro l = (Libro) o;
			res = getTitulo().equals(l.getTitulo()) &&
					getISBN().equals(l.getTitulo());
		}

		return res;
	}

	public int hashCode() {
		return getTitulo().hashCode() + getISBN().hashCode() * 31;

	}

	public int compareTo(Libro l) {

		int res = getTitulo().compareTo(l.getTitulo());
		if (res == 0) {
			res = getISBN().compareTo(l.getISBN());
		}
		return res;
	}

	public String toString() {

		return getTitulo() + " (ISBN: " + getISBN() + ")";
	}

}
