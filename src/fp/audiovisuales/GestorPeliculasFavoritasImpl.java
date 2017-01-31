package fp.audiovisuales;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import fp.utiles.Checkers;

public class GestorPeliculasFavoritasImpl implements GestorPeliculasFavoritas {
	private String id, nombre;
	private Set<Pelicula> peliculas;

	public GestorPeliculasFavoritasImpl(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
		this.peliculas = new HashSet<>();
	}

	public GestorPeliculasFavoritasImpl(String id, String nombre, Set<Pelicula> peliculas) {
		this.id = id;
		this.nombre = nombre;
		this.peliculas = new HashSet<>(peliculas);
	}

	public String getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public Set<Pelicula> getPeliculas() {
		return new HashSet<>(this.peliculas);
	}

	public void nuevaPelicula(Pelicula pelicula) {
		Checkers.checkNoNull(pelicula);
		this.peliculas.add(pelicula);
	}

	public void nuevasPeliculas(Collection<Pelicula> peliculas) {
		Checkers.checkNoNull(peliculas);
		this.peliculas.addAll(peliculas);
	}

	public void eliminaPelicula(Pelicula pelicula) {
		Checkers.checkNoNull(pelicula);
		this.peliculas.remove(pelicula);
	}

	public Integer cuentaPeliculas(String nombreActor) {

		Integer res = 0;

		for (Pelicula m : getPeliculas()) {
			if (m.esActor(nombreActor)) {
				res++;
			}
		}

		return res;
	}

	private Set<MiembroStaff> getActores() {
		Set<MiembroStaff> res = new HashSet<>();
		for (Pelicula p : getPeliculas()) {
			res.addAll(p.getActores());
		}
		return res;
	}

	public MiembroStaff getActorMasPeliculas() {

		MiembroStaff res = null;

		for (MiembroStaff m : getActores()) {
			if (res == null || cuentaPeliculas(res.getNombre()) < cuentaPeliculas(m.getNombre())) {
				res = m;
			}
		}

		return res;
	}

	public Boolean hayAlgunaPeliculaDirigidaPor(String nombreDirector) {

		Boolean res = false;
		for (Pelicula p : getPeliculas()) {
			if (p.esDirector(nombreDirector)) {
				res = true;
			}
		}
		return res;
	}

	public Pelicula getPeliculaMasActores() {

		Pelicula res = null;

		for (Pelicula p : getPeliculas()) {
			if (res == null || p.getActores().size() > res.getActores().size())
				res = p;
		}

		return null;
	}

	public Set<String> getGeneros() {

		Set<String> res = new HashSet<>();

		for (Pelicula p : getPeliculas()) {
			res.addAll(p.getGeneros());
		}

		return res;
	}

	// A partir de aquí, para resolver en casa

	public Set<MiembroStaff> seleccionaActoresParticipantesTodas() {
		// TODO: Hacer en casa
		return null;
	}

	public Set<Pelicula> getPeliculasDirigidasPor(String nombreDirector) {
		// TODO: Hacer en casa
		return null;
	}

	public Set<Pelicula> getPeliculasAnyo(Integer anyo) {
		// TODO: Hacer en casa
		return null;
	}

	public Set<Pelicula> getPeliculasDeActor(String nombreActor) {
		// TODO: Hacer en casa
		return null;
	}

	public Set<String> getPaises() {
		// TODO: Hacer en casa
		return null;
	}

	public boolean equals(Object obj) {
		boolean res = false;
		if (obj instanceof GestorPeliculasFavoritas) {
			GestorPeliculasFavoritas gestor = (GestorPeliculasFavoritas) obj;
			res = this.getId().equals(gestor.getId());
		}
		return res;
	}

	public int hashCode() {
		return this.getId().hashCode();
	}

	public String toString() {
		return getNombre() + " [" + getId() + "]";
	}

}
