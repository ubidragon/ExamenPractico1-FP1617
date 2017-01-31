package gestionDeBibliotecas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fp.utiles.Checkers;

public class PrestamoImpl implements Prestamo {

	private Persona user;
	private Libro book;
	private LocalDate fechaPrestamo;

	public PrestamoImpl(Persona user, Libro book, LocalDate fechaPrestamo) {
		Checkers.check("checkeo fecha", checkFecha(fechaPrestamo));
		this.user = user;
		this.book = book;
		this.fechaPrestamo = fechaPrestamo;

	}
	
	private Boolean checkFecha(LocalDate fecha){
		return fecha.isBefore(LocalDate.now());
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

		return getFechaPrestamo().plusDays(conversor(book.getPrestamo()));

	}

	public void setFechaPrestamo(LocalDate prestamo) {

		this.fechaPrestamo = prestamo;

	}

	private String formateadorFechas(LocalDate fechas) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String res = fechas.format(f);
		return res;

	}

	public boolean equals(Object o) {
		boolean res = false;

		if (o instanceof Prestamo) {
			Prestamo p = (Prestamo) o;
			res = getLibro().equals(p.getLibro()) && getUsuario().equals(p.getUsuario())
					&& getFechaPrestamo().equals(p.getFechaPrestamo());
		}

		return res;
	}

	public int hashCode() {
		return getLibro().hashCode() + getUsuario().hashCode() * 31 + getFechaPrestamo().hashCode() * 31 * 31;
	}

	public int compareTo(Prestamo p) {
		int res = getLibro().compareTo(p.getLibro());
		if (res == 0) {
			res = getUsuario().compareTo(p.getUsuario());
			if (res == 0) {
				res = getFechaPrestamo().compareTo(p.getFechaPrestamo());
			}
		}

		return res;
	}

	public String toString() {

		return book.getTitulo() + "(usuario: " + user.getDNI() + ", fecha prestamo: "
				+ formateadorFechas(getFechaPrestamo()) + ", fecha devolucion: "
				+ formateadorFechas(getFechaDevolucion());

	}

}
