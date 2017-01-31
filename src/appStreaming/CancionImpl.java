package appStreaming;

import java.time.Duration;

public class CancionImpl implements Cancion {

	private String id, nombre;
	Artista artist;
	private Integer pistas, popularidad;
	private Duration duracion;

	public CancionImpl(String id, String nombre, Artista artist, Integer pistas, Integer popularidad,
			Duration duracion) {
		this.id = id;
		this.nombre = nombre;
		this.artist = artist;
		this.pistas = pistas;
		this.popularidad = popularidad;
		this.duracion = duracion;
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
	public Artista getArtista() {

		return artist;
	}

	@Override
	public Duration getDuracion() {

		return duracion;
	}

	@Override
	public Integer getNumeroPista() {

		return pistas;
	}

	@Override
	public Integer getPopularidad() {

		return popularidad;
	}

	@Override
	public void setPopularidad(Integer popu) {

		this.popularidad = popu;
	}

	public String toString() {
		return getNombre() + " (" + getArtista().toString() + ")";
	}

}
