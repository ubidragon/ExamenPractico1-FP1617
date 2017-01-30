package gestionUniversidades;

import java.time.Duration;

public interface Beca {

	String getCodigo();

	Double getCuantiaTotal();

	Duration getDuracion();

	TipoBeca getTipo();

	Double getCuantiaMensual();

	void setCuantia(Double c);

	void setDuracion(Duration d);

}
