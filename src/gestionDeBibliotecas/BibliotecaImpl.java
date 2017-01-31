package gestionDeBibliotecas;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.utiles.Checkers;

public class BibliotecaImpl implements Biblioteca {

	private String nombre, direccion, cPostal, localidad, telefono, email;
	private List<Libro> libros;
	private Set<Persona> personas;
	private Set<Prestamo> prestamos;

	public BibliotecaImpl(String nombre, String localidad) {
		Checkers.check("Checkeo de email", checkEmail(email));
		Checkers.checkNoNull(nombre);
		Checkers.checkNoNull(localidad);
		this.nombre = nombre;
		this.direccion = null;
		this.cPostal = null;
		this.localidad = localidad;
		this.telefono = null;
		this.email = null;
		this.libros = new ArrayList<>();
		this.personas = new HashSet<>();
		this.prestamos = new HashSet<>();
	}

	private Boolean checkEmail(String email) {
		return email == null || (email.contains("@") && email.contains("."));
	}

	public String getNombre() {

		return nombre;
	}

	public String getDireccion() {

		return direccion;
	}

	public String getCodigoPostal() {

		return cPostal;
	}

	public String getLocalidad() {

		return localidad;
	}

	public String getTelefono() {

		return telefono;
	}

	public String getEmail() {

		return email;
	}

	public List<Libro> getLibros() {

		return new ArrayList<>(this.libros);
	}

	public Set<Persona> getPersonas() {

		return new HashSet<>(this.personas);
	}

	public Set<Prestamo> getPrestamos() {

		return new HashSet<>(this.prestamos);
	}

	public void setDireccion(String direcion) {

		this.direccion = direcion;
	}

	public void setCodigoPostal(String postal) {

		this.cPostal = postal;
	}

	public void setTelefono(String telefono) {

		this.telefono = telefono;
	}

	public void setEmail(String email) {

		this.email = email;
	}

	public void nuevoLibro(Libro l) {

		libros.add(l);
	}

	public void eliminaLibro(Libro l) {

		Checkers.check("No existe libro a eliminar", checkLibro(l));
		libros.remove(l);
	}

	private Boolean checkLibro(Libro l) {
		return libros.contains(l);
	}

	public void nuevoUsuario(Persona p) {

		personas.add(p);
	}

	public void eliminaUsuario(Persona p) {

		personas.remove(p);
	}

	public void nuevoPrestamo(Libro l, Persona p) {
		Checkers.check("Libro y Persona contenidos en biblioteca", checkPrestamos(l, p));
		prestamos.add(new PrestamoImpl(p, l, LocalDate.now()));
	}

	private Boolean checkPrestamos(Libro l, Persona p) {

		return !(libros.contains(l) && personas.contains(p));

	}

	public Integer cuentaPrestamos(Persona usuario) {

		Integer res = 0;

		for (Prestamo ps : getPrestamos()) {
			if (ps.getUsuario().equals(usuario)) {
				res++;
			}
		}
		return res;
	}

	public Integer cuentaPrestamos(Libro libro) {

		Integer res = 0;

		for (Prestamo ps : getPrestamos()) {
			if (ps.getLibro().getTitulo().equals(libro.getTitulo())) {
				res++;
			}
		}

		return res;
	}

	public Integer cuentaPrestamos(Month mes) {
		Integer res = 0;

		for (Prestamo ps : getPrestamos()) {
			if (ps.getFechaPrestamo().getMonth().equals(mes)) {
				res++;
			}
		}
		return res;
	}

	public Integer[] cuentaPrestamosPorMes() {

		Integer[] res = new Integer[Month.values().length];
		Arrays.fill(res, 0);
		for (Prestamo p : getPrestamos()) {
			res[p.getFechaPrestamo().getMonth().ordinal()]++;
		}
		return res;

	}

	public Month getMesConMasPrestamos() {

		return null;
	}

	public List<Libro> seleccionaLibrosSinPrestamos() {

		return null;
	}

	public Set<Persona> seleccionaUsuariosSinPrestamos() {

		return null;
	}

	public Boolean tienenTodosLosUsuariosPrestamo() {

		return null;
	}

	public boolean equals(Object o) {
		boolean res = false;
		if (o instanceof Biblioteca) {
			Biblioteca c = (Biblioteca) o;
			res = getNombre().equals(c.getNombre()) && getLocalidad().equals(c.getLocalidad());

		}

		return res;
	}

	public int hashCode() {
		return getNombre().hashCode() + getLocalidad().hashCode() * 31;
	}

	public String toString() {

		return getNombre() + " (" + getLocalidad() + ")";

	}

}
