package gestionDeBibliotecas;

import java.time.Duration;
import java.time.LocalDate;

public class MedioAudiovisualImpl implements MedioAudiovisual {

	private String codigo, titulo;
	private Duration duracion;
	private Double precio;
	private TipoMedioAudiovisual tipo;
	private Integer discos;
	private LocalDate adquisicion;
	private TipoPrestamo prestamo;

	public MedioAudiovisualImpl(String codigo, String titulo, Duration duracion, LocalDate adquisicion, Double precio,
			TipoMedioAudiovisual tipo, Integer discos) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.duracion = duracion;
		this.precio = precio;
		this.tipo = tipo;
		this.discos = discos;
		this.adquisicion = adquisicion;
	}

	public String getCodigo() {

		return codigo;
	}

	public String getTitulo() {

		return titulo;
	}

	public Duration getDuracion() {

		return duracion;
	}

	public LocalDate getFechaAdquisicion() {

		return adquisicion;
	}

	public Double getPrecio() {

		return precio;
	}

	public TipoMedioAudiovisual getTipo() {

		return tipo;
	}

	public Integer getNumeroDisco() {

		return discos;
	}

	public TipoPrestamo getPrestamo() {

		return prestamo;

	}

	public void setPrestamo(TipoPrestamo prestamo) {

		this.prestamo = prestamo;

	}

	private String plataforma(TipoMedioAudiovisual medio) {
		String formato;
		switch (medio) {
		case VIDEO:
			formato = "DVD";
			break;
		default:
			formato = "CD";
			break;

		}
		return formato;
	}

	public String toString() {

		return getTitulo() + " (" + plataforma(getTipo()) + getCodigo() + ")";

	}

}
