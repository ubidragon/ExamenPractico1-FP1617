package gestionDeBibliotecas;

import java.time.LocalDate;

public class LibroElectronicoImpl extends LibroImpl implements LibroElectronico {

	private String eISBn;
	private FormatoLibroE formato;
	
	

	public LibroElectronicoImpl(String isbn, String titulo, String autor, Integer paginas, LocalDate fechaAdquisicion,
			Double precio, Integer copias, TipoPrestamo prestamo, String eISBn, FormatoLibroE formato) {
		super(isbn, titulo, autor, paginas, fechaAdquisicion, precio, copias, prestamo);
		this.eISBn = eISBn;
		this.formato = formato;
	}


	public String getEISBN() {
		
		return eISBn;
	}


	public FormatoLibroE getFormato() {
		
		return formato;
	}
	
	public String toString(){
		
		return super.toString()+"-eISBN";
		
	}
}
