package gestionUniversidades;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class BecaImpl implements Beca {

	private String codigo;
	private Double cuantia;
	private Duration duracion;
	private TipoBeca tipo;

	public BecaImpl(String codigo, Double cuantia, Duration duracion, TipoBeca tipo) {
		this.codigo = codigo;
		this.cuantia = cuantia;
		this.duracion = duracion;
		this.tipo = tipo;
	}
	//
	// public BecaImpl(String codigo, Double cuantia {
	// this.codigo = codigo;
	// this.cuantia = 1500.0;
	// this.duracion = Duration.;
	// this.tipo = tipo;
	// }

	public String getCodigo() {

		return codigo;
	}

	public Double getCuantiaTotal() {

		return cuantia;
	}

	public Duration getDuracion() {

		return duracion;
	}

	public TipoBeca getTipo() {

		return tipo;
	}

	public Double getCuantiaMensual() {
		Double res = 0.;
		res = cuantia / duracion.get(ChronoUnit.MONTHS);
		return res;
	}

	public void setCuantia(Double c) {

		this.cuantia = c;

	}

	public void setDuracion(Duration d) {

		this.duracion = d;

	}

}
