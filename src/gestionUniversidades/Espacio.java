package gestionUniversidades;

public interface Espacio {

	TipoEspacio getTipo();

	String getNombre();

	Integer getCapacidad();

	Integer getPlanta();

	void setTipo(TipoEspacio espacio);

	void setNombre(String name);

	void setCapacidad(Integer capacity);

}
