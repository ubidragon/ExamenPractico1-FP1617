package movieDatabase;

import java.time.Duration;
import java.time.LocalDate;

public interface Pelicula {
	
	Integer getID();
	String getTitulo();
	String getTituloOriginal();
	String getIdioma();
	LocalDate getEstreno();
	Duration getDuracion();
	TipoMetraje getTipo();
	String getGenero();
	String getProductora();
	String getPais();
	MiembroStaff getDirector();
	
	void setTituloOriginal(String original);
	void setIdioma(String idioma);
	void setEstreno(LocalDate estreno);
	void setDuracion(Duration duracion);
	void setGenero(String genero);
	void setProductora(String productora);
	void setPais(String pais);
	void setDirector(MiembroStaff director);
	

}
