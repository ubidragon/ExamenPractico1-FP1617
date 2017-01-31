package fp.musica;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.musica.Album;
import fp.musica.Cancion;
import fp.utiles.Checkers;
import fp.utiles.Imagenes;

public class ListaReproduccionImpl implements ListaReproduccion {
	private String nombre;
	private List<Cancion> canciones;

	public ListaReproduccionImpl(String nombre) {
		this.nombre = nombre;
		this.canciones = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Cancion> getCanciones() {
		return new ArrayList<>(canciones);
	}

	public Integer getNumeroCanciones() {
		return canciones.size();
	}

	public void aleatoriza() {
		Collections.shuffle(canciones);
	}

	public void incorpora(Cancion c) {
		canciones.add(c);
	}

	public void incorpora(Album a) {
		canciones.addAll(a.getCanciones());
	}

	public void incorpora(List<Cancion> canciones) {
		this.canciones.addAll(canciones);
	}

	public void eliminaPrimera(Cancion c) {
		Checkers.check("La canción que se pretende eliminar no pertenece a la lista de reproducción",
				canciones.contains(c));
		canciones.remove(c);
	}

	public void eliminaUltima(Cancion c) {
		Checkers.check("La canción que se pretende eliminar no pertenece a la lista de reproducción",
				canciones.contains(c));
		canciones.remove(canciones.lastIndexOf(c));
	}

	public void eliminaTrozo(int primeraPosicion, int ultimaPosicion) {
		Checkers.check("La primera posición no es un valor válido.",
				primeraPosicion >= 0 && ultimaPosicion < getNumeroCanciones() && primeraPosicion <= ultimaPosicion);
		canciones.subList(primeraPosicion, ultimaPosicion + 1).clear();
	}

	public String toString() {
		return getNombre() + " (" + getNumeroCanciones() + " canciones)";
	}

	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof ListaReproduccion) {
			ListaReproduccion l = (ListaReproduccion) o;
			res = canciones.equals(l.getCanciones());
		}
		return res;
	}

	public int hashCode() {
		return canciones.hashCode();
	}

	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve true si todas las canciones de la lista de reproducción
	 *         son del artista especificado.
	 */
	public Boolean esAntologia(String artista) {
		// TODO: Se resolverá en clase
		return false;
	}

	/**
	 * @return Devuelve la duración total de la lista de reproducción
	 */
	public Duration getDuracion() {
		// TODO: Se resolverá en clase
		return Duration.ZERO;
	}

	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve true si existe alguna canción en la lista de
	 *         reproducción del artista dado como parámetro.
	 */
	public Boolean contieneArtista(String artista) {
		// TODO: Se resolverá en clase
		return false;
	}

	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve una nueva lista de reproducción que contenga todas las
	 *         canciones del artista dado como parámetro.
	 */
	public ListaReproduccion getSublistaArtista(String artista) {
		// TODO: Se resolverá en clase
		return null;
	}

	/**
	 * @return Devuelve el conjunto de artistas de la lista de reproducción.
	 */
	public Set<Artista> getArtistas() {
		// TODO: Se resolverá en clase
		return new HashSet<Artista>();
	}

	/**
	 * Muestra las fotos de los artistas que aparecen en la lista
	 */
	public void muestraFotosArtistas() {
		// TODO: Se resolverá en clase
	}

	// A partir de aquí, para resolver en casa

	/**
	 * @param tituloCancion
	 *            Titulo de una canción.
	 * @return Devuelve la posición (índice) que ocupa en la lista de
	 *         reproducción la primera canción cuyo título se especifica. Si la
	 *         canción no está en la lista de reproducción, devuelve -1.
	 * 
	 */
	public int getPosicionCancion(String tituloCancion) {
		// TODO: Hacer en casa
		return -1;
	}

	/**
	 * @return Devuelve la canción con mayor duración de la lista de
	 *         reproducción. Si no hay ninguna canción en la lista, devuelve
	 *         null.
	 */
	public Cancion getCancionMasLarga() {
		// TODO: Hacer en casa
		return null;
	}

	/**
	 * @return Devuelve la canción con menor duración de la lista de
	 *         reproducción. Si no hay ninguna canción en la lista, devuelve
	 *         null.
	 */
	public Cancion getCancionMasCorta() {
		// TODO: Hacer en casa
		return null;
	}
}
