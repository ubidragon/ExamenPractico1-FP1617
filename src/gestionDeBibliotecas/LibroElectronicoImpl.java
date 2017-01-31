package gestionDeBibliotecas;

import java.time.LocalDate;

public class LibroElectronicoImpl extends LibroImpl implements LibroElectronico {

	private String eISBn;
	private FormatoLibroE formato;



	public LibroElectronicoImpl(String isbn, String autor, String titulo, Integer paginas, Integer copias,
			Double precio, LocalDate adquisicion, TipoPrestamo prestamo, String eISBn, FormatoLibroE formato) {
		super(isbn, autor, titulo, paginas, copias, precio, adquisicion, prestamo);
		this.eISBn = eISBn;
		this.formato = formato;
	}

	public String getEISBN() {

		return eISBn;
	}

	public FormatoLibroE getFormato() {

		return formato;
	}

	public String toString() {

		return super.toString() + "-eISBN";

	}
}
