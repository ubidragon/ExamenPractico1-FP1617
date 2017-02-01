package gestionDeBibliotecas;

import java.time.LocalDate;

import fp.utiles.Checkers;

public class MedioAudiovisualImpl implements MedioAudiovisual {

	private String codigo, titulo;
	private Integer duracion;
	private Double precio;
	private TipoMedioAudiovisual tipo;
	private Integer discos;
	private LocalDate adquisicion;
	private TipoPrestamo prestamo;

	public MedioAudiovisualImpl(String codigo, String titulo, Integer duracion, Double precio,
			TipoMedioAudiovisual tipo, Integer discos, LocalDate adquisicion, TipoPrestamo prestamo) {
		Checkers.check("Duracion", checkMayorQueZero(duracion));
		Checkers.check("Duracion", checkMayorQueZero(discos));
		this.codigo = codigo;
		this.titulo = titulo;
		this.duracion = duracion;
		this.precio = precio;
		this.tipo = tipo;
		this.discos = discos;
		this.adquisicion = adquisicion;
		this.prestamo = prestamo;
	}

	private Boolean checkMayorQueZero(Integer d) {
		return d > 0;
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

	public String getCodigo() {

		return codigo;
	}

	public Integer getDuracion() {

		return duracion;
	}

	public TipoMedioAudiovisual getTipo() {

		return tipo;
	}

	public Integer getNumeroDisco() {

		return discos;
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

	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof MedioAudiovisual) {
			MedioAudiovisual m = (MedioAudiovisual) o;
			res = getTitulo().equals(m.getTitulo()) && getCodigo().equals(m.getCodigo());

		}
		return res;
	}

	public int hashCode() {
		return getTitulo().hashCode() + getCodigo().hashCode() * 31;
	}

	public int compareTo(MedioAudiovisual m) {
		int res = getTitulo().compareTo(m.getTitulo());
		if (res == 0) {
			res = getCodigo().compareTo(m.getCodigo());
		}
		return res;
	}

	public String toString() {

		return getTitulo() + " (" + plataforma(getTipo()) + getCodigo() + ")";

	}

}
