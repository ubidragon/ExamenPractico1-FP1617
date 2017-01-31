package fp.aeropuertos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import fp.utiles.Checkers;

public class PersonaImpl implements Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private LocalDate fechaNacimiento;
	private String email;

	public PersonaImpl(String dni, String nombre, String apellidos,
			LocalDate fechaNacimiento, String email) {
		//
		Checkers.checkNoNull(dni,nombre,apellidos,fechaNacimiento,email);
		Checkers.check("PersonaImpl: el dni debe tener ocho digitos y una letral final",
				PersonaImpl.restriccionDni(dni));
		Checkers.check("PersonaImpl: la fecha de nacimiento debe ser anterior a la fecha actual",
				PersonaImpl.restriccionFechaNacimiento(fechaNacimiento));
		Checkers.check("PersonaImpl: el email debe contener el caracter arroba��",
				PersonaImpl.restriccionEmail(email));
		//
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
	}

	public PersonaImpl(String dni, String nombre, String apellidos,
			LocalDate fechaNacimiento) {
		//
		Checkers.checkNoNull(dni,nombre,apellidos,fechaNacimiento);
		Checkers.check("PersonaImpl: el dni debe tener ocho digitos y una letral final",
				PersonaImpl.restriccionDni(dni));
		Checkers.check("PersonaImpl: la fecha de nacimiento debe ser anterior a la fecha actual",
				PersonaImpl.restriccionFechaNacimiento(fechaNacimiento));
		//
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.fechaNacimiento = fechaNacimiento;
		this.email = null;
	}
	//////////
	//	R1: el dni debe tener ocho dígitos y una letral final.
	//	R2: la fecha de nacimiento debe ser anterior a la fecha actual.
	//	R3: el email debe contener el carácter ‘@’. 
	private static Boolean restriccionDni(String dni){
		Boolean res;
		res = (dni.length() == 9) && Character.isLetter(dni.charAt(8));
		return res;
	}
	private static Boolean restriccionFechaNacimiento(LocalDate fechaNacimiento){
		Boolean res;
		res = fechaNacimiento.isBefore(LocalDate.now());
		return res;
	}
	private static Boolean restriccionEmail(String email){
		Boolean res;
		res = email.contains("@");
		return res;
	}
	//////////
	public Integer getEdad() {
		return (int) getFechaNacimiento().until(LocalDate.now(),
				ChronoUnit.YEARS);
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getDNI() {
		return dni;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setNombre(String nombre) {
		Checkers.checkNoNull(nombre);
		this.nombre = nombre;
	}

	public void setApellidos(String apellidos) {
		Checkers.checkNoNull(apellidos);
		this.apellidos = apellidos;
	}

	public void setDNI(String dni) {
		Checkers.checkNoNull(dni);
		Checkers.check("PersonaImpl: el dni debe tener ocho dígitos y una letral final",
				PersonaImpl.restriccionDni(dni));
		//
		this.dni = dni;
	}

	public void setFechaNacimiento(LocalDate fecha) {
		Checkers.checkNoNull(fecha);
		Checkers.check("PersonaImpl: la fecha de nacimiento debe ser anterior a la fecha actual",
				PersonaImpl.restriccionFechaNacimiento(fechaNacimiento));
		//
		this.fechaNacimiento = fecha;
	}

	public void setEmail(String email) {
		Checkers.checkNoNull(email);
		Checkers.check("PersonaImpl: el email debe contener el caracter arroba",
				PersonaImpl.restriccionEmail(email));
		//
		this.email = email;
	}

	public String toString() {
		return getDNI()
				+ " - "
				+ getApellidos()
				+ ", "
				+ getNombre()
				+ " - "
				+ getFechaNacimiento().format(
						DateTimeFormatter.ofPattern("dd/MM/yyyy"));
	}
	////////////////////////////////////////////////////////////////
	//
	public boolean equals(Object o){
		boolean res = false;
		if(o instanceof Persona){
			res = this.getDNI().equals(((Persona) o).getDNI());
		}
		return res;
	}
	public int hashCode(){
		return this.getDNI().hashCode();
	}
	public int compareTo(Persona p){
		return this.getDNI().compareTo(p.getDNI());
	}
}

