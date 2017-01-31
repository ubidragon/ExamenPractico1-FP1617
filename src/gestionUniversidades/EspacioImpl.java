package gestionUniversidades;

public class EspacioImpl implements Espacio {

	private TipoEspacio tipo;
	private String nombre;
	private Integer capacidad;
	private Integer planta;

	@Override
	public TipoEspacio getTipo() {

		return tipo;
	}

	@Override
	public String getNombre() {

		return nombre;
	}

	@Override
	public Integer getCapacidad() {

		return capacidad;
	}

	@Override
	public Integer getPlanta() {

		return planta;
	}

	@Override
	public void setTipo(TipoEspacio espacio) {

		this.tipo = espacio;

	}

	@Override
	public void setNombre(String name) {

		this.nombre = name;
	}

	@Override
	public void setCapacidad(Integer capacity) {

		this.capacidad = capacity;
	}

}
