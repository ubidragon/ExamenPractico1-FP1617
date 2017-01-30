package appStreaming;

import java.time.Duration;

public interface Cancion {

	String getID();
	String getNombre();
	Artista getArtista();
	Duration getDuracion();
	Integer getNumeroPista();
	Integer getPopularidad();
	
	void setPopularidad(Integer popu);

}
