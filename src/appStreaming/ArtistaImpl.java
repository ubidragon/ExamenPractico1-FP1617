package appStreaming;

public class ArtistaImpl implements Artista {

	private String id, nombre, genero, url;
	private Integer popularidad;

	public ArtistaImpl(String id, String nombre, String genero, String url, Integer popularidad) {
		this.id = id;
		this.nombre = nombre;
		this.genero = genero;
		this.url = url;
		this.popularidad = popularidad;
	}

	@Override
	public String getID() {

		return id;
	}

	@Override
	public String getNombre() {

		return nombre;
	}

	@Override
	public String getGenero() {

		return genero;
	}

	@Override
	public Integer getPopularidad() {

		return popularidad;
	}

	@Override
	public String getURL() {

		return url;
	}

	@Override
	public void setPopularidad(Integer popularidad) {

		this.popularidad = popularidad;

	}

	@Override
	public void serURL(String url) {

		this.url = url;
	}

	public String toString() {

		return getNombre() + " [" + getID() + "]";

	}

}
