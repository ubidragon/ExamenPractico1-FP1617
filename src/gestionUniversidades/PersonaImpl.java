package gestionUniversidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class PersonaImpl implements Persona {

	private String dni, nombre, apellidos, email;// tambien se pueden
													// inicializar en lineas
													// diferentes, pero de esta
													// manera con vistas a un
													// examen logramos un poco
													// de tiempo extra
	private LocalDate fecha;

	/**
	 * CONSTRUCTOR 1 propiedades basicas del tipo
	 **/

	public PersonaImpl(String dni, String nombre, String apellidos, LocalDate fecha, String email) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.fecha = fecha;
	}

	/**
	 * CONSTRUCTOR 2 propiedades basicas sin el email inicializado en null
	 **/

	public PersonaImpl(String dni, String nombre, String apellidos, LocalDate fecha) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = null;
		this.fecha = fecha;
	}

	public String getDNI() {

		return dni;
	}

	public String getNombre() {

		return nombre;
	}

	public String getApellidos() {

		return apellidos;
	}

	public LocalDate getFecha() {

		return fecha;
	}

	public Integer getEdad() {

		return LocalDate.now().until(fecha).getYears();
	}

	public String getEmail() {

		return email;
	}

	public void setDNI(String dni) {

		this.dni = dni;

	}

	public void setNombre(String nombre) {

		this.nombre = nombre;

	}

	public void setApellidos(String apellidos) {

		this.apellidos = apellidos;

	}

	public void setFecha(LocalDate fecha) {

		this.fecha = fecha;

	}

	public void setEmail(String email) {

		this.email = email;

	}

	private String formateadorFechas(LocalDate fechas) {
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/mm/yyyy");
		String res = fechas.format(f);
		return res;

	}

	public String toString() {

		return getDNI() + " - " + getApellidos() + ", " + getNombre() + " - " + formateadorFechas(this.fecha);

	}

}
