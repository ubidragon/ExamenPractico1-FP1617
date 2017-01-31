package appStreaming;

public interface Artista {

	String getID();

	String getNombre();

	String getGenero();

	Integer getPopularidad();

	String getURL();

	void setPopularidad(Integer popularidad);

	void serURL(String url);

}
