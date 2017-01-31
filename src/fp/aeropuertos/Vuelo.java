package fp.aeropuertos;

import java.time.Duration;
import java.time.LocalDateTime;

public interface Vuelo extends Comparable<Vuelo> {
	String getCodigo();

	String getOrigen();

	String getDestino();

	LocalDateTime getFechaSalida();

	LocalDateTime getFechaLlegada();

	Duration getDuracion();

	Integer getNumeroPlazas();

	Integer getNumeroPasajeros();

	Boolean estaCompleto();

	void setFechaSalida(LocalDateTime fechaSalida);

	void setFechaLlegada(LocalDateTime fechaLlegada);

	void setNumeroPasajeros(Integer numeroPasajeros);
}