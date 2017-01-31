package movieDatabase;

import java.time.LocalDate;

public interface MiembroStaff {
	String getID();
	String getNombre();
	LocalDate getfechaNacimiento();
	LocalDate getFechaDefuncion();
	Integer getEdad();
	String getLugarNacimiento();
	String getAlias();

	void setNombre(String nombre);
	void setNacimiento(LocalDate nacimiento);
	void setDefuncion(LocalDate defuncion);
	void setLugar(String lugar);
	void setAlias(String alias);
	
}
