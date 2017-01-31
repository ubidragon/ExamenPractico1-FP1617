package gestionDeBibliotecas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BibliotecaImpl implements Biblioteca {

	private String nombre, direccion, cPostal, localidad, telefono, email;
	private List<Libro> libros;
	private Set<Persona> personas;
	private Set<Prestamo> prestamos;

	public BibliotecaImpl(String nombre, String localidad, String email, List<Libro> libros, Set<Persona> personas,
			Set<Prestamo> prestamos) {
		this.nombre = nombre;
		this.direccion = null;
		this.cPostal =null;
		this.localidad = localidad;
		this.telefono = null;
		this.email = null;
		this.libros = new ArrayList<>();
		this.personas = new HashSet<>();
		this.prestamos = new HashSet<>();
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
		
		return libros;
	}


	public Set<Persona> getPersonas() {
		
		return personas;
	}


	public Set<Prestamo> getPrestamos() {
		
		return prestamos;
	}


	public void setDireccion(String direcion) {
		
		this.direccion = direcion;
	}


	public void setCodigoPostal(String postal) {
		
		this.cPostal= postal;
	}


	public void setTelefono(String telefono) {
		
		this.telefono=telefono;
	}


	public void setEmail(String email) {
		
		this.email=email;
	}


	public int compareTo(Biblioteca o) {
		int res = 
		return 0;
	}

}
