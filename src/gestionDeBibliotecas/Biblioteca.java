package gestionDeBibliotecas;

import java.util.List;
import java.util.Set;

public interface Biblioteca {

	String getNombre();

	String getDireccion();

	String getCodigoPostal();

	String getLocalidad();

	String getTelefono();

	String getEmail();

	List<Libro> getLibros();

	Set<Persona> getPersonas();

	Set<Prestamo> getPrestamos();

	void setDireccion(String direcion);

	void setCodigoPostal(String postal);

	void setTelefono(String telefono);

	void setEmail(String email);

	void nuevoLibro(Libro l);

	void eliminaLibro(Libro l);

	void nuevoUsuario(Persona p);

	void eliminaUsuario(Persona p);

	void nuevoPrestamo(Libro l, Persona p);
}