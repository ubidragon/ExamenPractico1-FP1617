package gestionDeBibliotecas;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.utiles.Checkers;

public class BibliotecaImpl implements Biblioteca {

	private String nombre, direccion, cPostal, localidad, telefono, email;
	private List<Libro> libros;
	private Set<Persona> personas;
	private Set<Prestamo> prestamos;

	public BibliotecaImpl(String nombre, String localidad, String email, List<Libro> libros, Set<Persona> personas,
			Set<Prestamo> prestamos) {
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
	
	private Boolean checkEmail(String email){
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

		return new ArrayList<>(libros);
	}

	public Set<Persona> getPersonas() {

		return new HashSet<>(personas);
	}

	public Set<Prestamo> getPrestamos() {

		return new HashSet<>(prestamos);
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
	
	@Override
	public void nuevoLibro(Libro l) {
		// TODO Auto-generated method stub
		libros.add(l);
	}

	@Override
	public void eliminaLibro(Libro l) {
		// TODO Auto-generated method stub
		Checkers.check("No existe libro a eliminar", checkLibro(l));
		libros.remove(l);
	}

	private Boolean checkLibro(Libro l){
		return libros.contains(l);
	}
	
	@Override
	public void nuevoUsuario(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminaUsuario(Persona p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuevoPrestamo(Libro l, Persona p) {
		// TODO Auto-generated method stub
		
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
