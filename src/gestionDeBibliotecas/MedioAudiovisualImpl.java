package gestionDeBibliotecas;

import java.time.Duration;
import java.time.LocalDate;

public class MedioAudiovisualImpl extends MedioImpl implements MedioAudiovisual {

	private String codigo;
	private Integer duracion;

	private TipoMedioAudiovisual tipo;
	private Integer discos;


	public MedioAudiovisualImpl(String codigo, String titulo, Integer duracion, LocalDate adquisicion, Double precio,
			TipoMedioAudiovisual tipo, Integer discos, TipoPrestamo prestamo) {
		super(titulo, adquisicion, precio, prestamo);
		this.codigo = codigo;
		
		this.duracion = duracion;
		
		this.tipo = tipo;
		this.discos = discos;
	
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

	public String toString() {

		return getTitulo() + " (" + plataforma(getTipo()) + getCodigo() + ")";

	}

}
