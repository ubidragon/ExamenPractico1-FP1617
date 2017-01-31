package fp.aeropuertos.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import fp.aeropuertos.Persona;
import fp.aeropuertos.PersonaImpl;
import fp.aeropuertos.Vuelo;
import fp.aeropuertos.VueloImpl;

public class TestVuelo {

	public static void main(String[] args) {
		// TODO
	}
	
	private static void muestraPasajerosSoloEnPrimerVuelo(Vuelo v1, Vuelo v2) {
		// TODO
	}

	private static void muestraPasajerosComunes(Vuelo v1, Vuelo v2) {
		// TODO		
	}

	private static void muestraPasajerosEnCualquierVuelo(Vuelo v1, Vuelo v2) {
		// TODO
	}

	private static Vuelo creaVuelo1(){
		Vuelo res = new VueloImpl("IB1234","Sevilla","Madrid",LocalDateTime.of(2016, 12, 20,12,0),LocalDateTime.of(2016, 12, 20,13,35),120);
		res.nuevoPasajero(new PersonaImpl("56565656A", "Juan", "Sin Miedo",	LocalDate.of(1981, 1, 31)));
		res.nuevoPasajero(new PersonaImpl("57535656B", "Miguel", "Sin Miedo",	LocalDate.of(1982, 2, 1)));
		res.nuevoPasajero(new PersonaImpl("56563256C", "Alberto", "Sin Miedo",	LocalDate.of(1983, 3, 2)));
		res.nuevoPasajero(new PersonaImpl("12345656D", "Ana", "Sin Miedo",	LocalDate.of(1984, 4, 3)));
		res.nuevoPasajero(new PersonaImpl("55565436E", "María", "Sin Miedo",	LocalDate.of(1985, 5, 4)));
		res.nuevoPasajero(new PersonaImpl("43346446F", "Isabel", "Sin Miedo",	LocalDate.of(1986, 6, 5)));
		res.nuevoPasajero(new PersonaImpl("57775657G", "Alejandro", "Sin Miedo",	LocalDate.of(1987, 7, 6)));
		res.nuevoPasajero(new PersonaImpl("53535356H", "Susana", "Sin Miedo",	LocalDate.of(1988, 8, 7)));
		
		return res;
	}


	private static Vuelo creaVuelo2(){
		Vuelo res = new VueloImpl("IB3536","Madrid","Barcelona",LocalDateTime.of(2016, 12, 20,15,0),LocalDateTime.of(2016, 12, 20,17,5),120);
		res.nuevoPasajero(new PersonaImpl("56565656A", "Juan", "Sin Miedo",	LocalDate.of(1981, 1, 31)));
		res.nuevoPasajero(new PersonaImpl("57535656B", "Miguel", "Sin Miedo",	LocalDate.of(1982, 2, 1)));
		res.nuevoPasajero(new PersonaImpl("56563256C", "Alberto", "Sin Miedo",	LocalDate.of(1983, 3, 2)));
		res.nuevoPasajero(new PersonaImpl("12345656D", "Ana", "Sin Miedo",	LocalDate.of(1984, 4, 3)));
		res.nuevoPasajero(new PersonaImpl("75345436E", "Jimena", "Sin Miedo",	LocalDate.of(1985, 5, 4)));
		res.nuevoPasajero(new PersonaImpl("97426446F", "Darío", "Sin Miedo",	LocalDate.of(1986, 6, 5)));
		res.nuevoPasajero(new PersonaImpl("66665657G", "Pedro", "Sin Miedo",	LocalDate.of(1987, 7, 6)));
		res.nuevoPasajero(new PersonaImpl("88425356H", "Lola", "Sin Miedo",	LocalDate.of(1988, 8, 7)));
		
		return res;
	}
}
