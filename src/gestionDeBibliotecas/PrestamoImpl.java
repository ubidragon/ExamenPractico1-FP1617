package gestionDeBibliotecas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PrestamoImpl implements Prestamo {

	private Persona user;
	private Libro book;
	private LocalDate fechaPrestamo;

	public PrestamoImpl(Persona user, Libro book, LocalDate fechaPrestamo) {
		this.user = user;
		this.book = book;
		this.fechaPrestamo = fechaPrestamo;

	}

	public Persona getUsuario() {

		return user;
	}

	public Libro getLibro() {

		return book;
	}

	public LocalDate getFechaPrestamo() {

		return fechaPrestamo;
	}

	private Integer conversor(TipoPrestamo prestamo) {
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
		}

		return res;
	}

	public LocalDate getFechaDevolucion() {

		return getFechaPrestamo().plusDays(conversor(book.getTipoPrestamo()));

	}

	public void setFechaPrestamo(LocalDate prestamo) {

		this.fechaPrestamo = prestamo;

	}

	private String formateadorFechas(LocalDate fechas) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String res = fechas.format(f);
		return res;

	}

	public String toString() {

		return book.getTitulo() + "(usuario: " + user.getDNI() + ", fecha prestamo: "
				+ formateadorFechas(getFechaPrestamo()) + ", fecha devolucion: "
				+ formateadorFechas(getFechaDevolucion());

	}

}
