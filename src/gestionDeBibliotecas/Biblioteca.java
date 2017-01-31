package gestionDeBibliotecas;

import java.util.List;
import java.util.Set;

public interface Biblioteca extends Comparable<Biblioteca>{

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

}
