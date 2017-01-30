package gestionUniversidades;

import java.time.LocalDate;

public interface Persona {

	String getDNI();

	String getNombre();

	String getApellidos();

	LocalDate getFecha();

	Integer getEdad();

	String getEmail();

	void setDNI(String dni);

	void setNombre(String nombre);

	void setApellidos(String apellidos);

	void setFecha(LocalDate fecha);

	void setEmail(String email);
	// No se añade un set de edad ya que es una propiedad derivada de la fecha
	// de nacimiento

}
