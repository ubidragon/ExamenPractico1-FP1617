package fp.aeropuertos;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import fp.utiles.Checkers;

public class VueloImpl implements Vuelo{
	private String codigo;
	private String origen;
	private String destino;
	private LocalDateTime fechaSalida;
	private LocalDateTime fechaLlegada;
	private Integer numeroPlazas;
	private Integer numeroPasajeros;

	public VueloImpl(String codigo, String origen, String destino, LocalDateTime fechaSalida,
			LocalDateTime fechaLlegada, Integer numeroPlazas, Integer numeroPasajeros) {
		//
		Checkers.checkNoNull(codigo, origen, destino, fechaSalida, fechaLlegada, numeroPlazas, numeroPasajeros);
		Checkers.check("VueloImpl: la fecha de llegada debe ser posterior a la fecha de salida", 
				VueloImpl.restriccionFechaSalidaPosteriorAFechaLlegada(fechaSalida, fechaLlegada));
		Checkers.check("VueloImpl: el número de pasajeros debe ser menor o igual que el número de plazas", 
				VueloImpl.restriccionNumeroPasajeros(numeroPasajeros, numeroPlazas));		
		//
		this.codigo = codigo;
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.numeroPlazas = numeroPlazas;
		this.numeroPasajeros = numeroPasajeros;
	}
	//////////
	//R1: la fecha de llegada debe ser posterior a la fecha de salida.
	//R2: el número de pasajeros debe ser menor o igual que el número de plazas.
	private static Boolean restriccionFechaSalidaPosteriorAFechaLlegada(LocalDateTime fechaSalida, LocalDateTime fechaLlegada){
		Boolean res;
		res = fechaSalida.isBefore(fechaLlegada);
		return res;		
	}
	private static Boolean restriccionNumeroPasajeros(Integer numeroPasajeros, Integer numeroPlazas){
		Boolean res;
		res = numeroPasajeros<=numeroPlazas;
		return res;		
	}
	//////////
	public VueloImpl(String codigo, String origen, String destino, LocalDateTime fechaSalida,
			LocalDateTime fechaLlegada, Integer numeroPlazas) {
		this(codigo,origen,destino,fechaSalida,fechaLlegada,numeroPlazas,0);
	}

	public LocalDateTime getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(LocalDateTime fechaSalida) {
		Checkers.checkNoNull(fechaSalida);
		Checkers.check("VueloImpl: la fecha de llegada debe ser posterior a la fecha de salida", 
				VueloImpl.restriccionFechaSalidaPosteriorAFechaLlegada(fechaSalida, this.getFechaLlegada()));
		this.fechaSalida = fechaSalida;
	}

	public LocalDateTime getFechaLlegada() {
		return fechaLlegada;
	}

	public void setFechaLlegada(LocalDateTime fechaLlegada) {
		Checkers.checkNoNull(fechaLlegada);
		Checkers.check("VueloImpl: la fecha de llegada debe ser posterior a la fecha de salida", 
				VueloImpl.restriccionFechaSalidaPosteriorAFechaLlegada(this.getFechaSalida(), fechaLlegada));
		this.fechaLlegada = fechaLlegada;
	}

	public Integer getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(Integer numeroPasajeros) {
		Checkers.checkNoNull(numeroPasajeros);
		Checkers.check("VueloImpl: el número de pasajeros debe ser menor o igual que el número de plazas", 
				VueloImpl.restriccionNumeroPasajeros(numeroPasajeros, numeroPlazas));	
		this.numeroPasajeros = numeroPasajeros;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getOrigen() {
		return origen;
	}

	public String getDestino() {
		return destino;
	}

	public Integer getNumeroPlazas() {
		return numeroPlazas;
	}

	public Duration getDuracion() {
		return Duration.ofMinutes(getFechaSalida().until(getFechaLlegada(), ChronoUnit.MINUTES));
	}

	public Boolean estaCompleto() {
		return getNumeroPlazas().equals(getNumeroPasajeros());
	}

	public String toString(){
		return "("+getCodigo()+") "+getOrigen()+" - "+getDestino()+" "+getFechaSalida().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
	}
	////////////////////////////////////////////////////////////////
	//
	public boolean equals(Object o){
		boolean res = false;
		if(o instanceof Vuelo){
			boolean aux1 = this.getCodigo().equals(((Vuelo) o).getCodigo());
			boolean aux2 = this.getOrigen().equals(((Vuelo) o).getOrigen());
			boolean aux3 = this.getDestino().equals(((Vuelo) o).getDestino());
			boolean aux4 = this.getFechaSalida().equals(((Vuelo) o).getFechaSalida());
			res = aux1 && aux2 && aux3 && aux4;			
		}
		return res;
	}
	public int hashCode(){
		return this.getCodigo().hashCode()+this.getOrigen().hashCode()*31+this.getDestino().hashCode()*31*31+this.getFechaSalida().hashCode()*31*31*31;
	}
	public int compareTo(Vuelo v){
		int res = this.getCodigo().compareTo(v.getCodigo());
		if(res == 0){
			res = this.getOrigen().compareTo(v.getOrigen());
			if(res == 0){
				res = this.getDestino().compareTo(v.getDestino());
				if(res == 0){
					res = this.getFechaSalida().compareTo(v.getFechaSalida());
				}
			}
		}
		return res;
	}
}
