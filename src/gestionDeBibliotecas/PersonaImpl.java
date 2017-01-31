package gestionDeBibliotecas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fp.utiles.Checkers;

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
		Checkers.check("Checkeo dni", checkDNI(dni));
		Checkers.check("Checkeo de fecha", checkFecha(fecha));
		Checkers.check("Checkeo de email", email.contains("@"));
		Checkers.checkNoNull(dni);
		Checkers.checkNoNull(nombre);
		Checkers.checkNoNull(apellidos);
		Checkers.checkNoNull(fecha);
		Checkers.checkNoNull(email);
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
		Checkers.check("Checkeo dni", checkDNI(dni));
		Checkers.check("Checkeo de fecha", checkFecha(fecha));
		Checkers.checkNoNull(dni);
		Checkers.checkNoNull(nombre);
		Checkers.checkNoNull(apellidos);
		Checkers.checkNoNull(fecha);

		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = null;
		this.fecha = fecha;
	}

	private Boolean checkDNI(String dni) {

		return dni.length() == 9 && Character.isDigit(dni.charAt(0)) && Character.isDigit(dni.charAt(1))
				&& Character.isDigit(dni.charAt(2)) && Character.isDigit(dni.charAt(3))
				&& Character.isDigit(dni.charAt(4)) && Character.isDigit(dni.charAt(5))
				&& Character.isDigit(dni.charAt(6)) && Character.isDigit(dni.charAt(7))
				&& Character.isLetter(dni.charAt(8));

	}

	private Boolean checkFecha(LocalDate fecha) {

		Boolean res = fecha.isBefore(LocalDate.now());

		return res;
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

		return LocalDate.now().until(getFecha()).getYears();
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
		DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String res = fechas.format(f);
		return res;

	}

	@Override
	public boolean equals(Object obj) {
		Boolean res = false;
		if (obj instanceof Persona) {
			Persona p = (Persona) obj;
			res = getDNI().equals(p.getDNI());

		}
		return res;
	}

	public int hashCode() {
		return getDNI().hashCode();
	}

	public int compareTo(Persona p) {
		int res = getDNI().compareTo(p.getDNI());

		return res;

	}

	public String toString() {

		return getDNI() + " - " + getApellidos() + ", " + getNombre() + " - " + formateadorFechas(getFecha());

	}

}
