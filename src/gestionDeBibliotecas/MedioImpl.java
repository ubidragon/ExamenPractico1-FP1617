package gestionDeBibliotecas;

import java.time.LocalDate;

public class MedioImpl implements Medio{
	private String titulo;
	private Double precio;
	private LocalDate adquisicion;
	private TipoPrestamo prestamo;
	
	

	public MedioImpl(String titulo,LocalDate adquisicion, Double precio,  TipoPrestamo prestamo) {
		this.titulo = titulo;
		this.precio = precio;
		this.adquisicion = adquisicion;
		this.prestamo = prestamo;
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
		
		this.prestamo=prestamo;
		
	}
	
	public String toString(){
		
		return getTitulo();
		
	}

}
