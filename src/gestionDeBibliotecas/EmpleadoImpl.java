package gestionDeBibliotecas;

import java.time.LocalDate;

public class EmpleadoImpl extends PersonaImpl implements Empleado {
	private String puesto;
	private TipoContrato contrato;
	
	public EmpleadoImpl(String dni, String nombre, String apellidos, LocalDate fecha, String email, String puesto,
			TipoContrato contrato) {
		super(dni, nombre, apellidos, fecha, email);
		this.puesto = puesto;
		this.contrato = contrato;
	}


	public String getPuesto() {
		
		return puesto;
	}


	public TipoContrato getContrato() {
		
		return contrato;
	}
	
	public String toString(){
		 
		return super.toString()+" - puesto: " + getPuesto();
	}
	
}
