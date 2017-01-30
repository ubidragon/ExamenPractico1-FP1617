package gestionDeBibliotecas;

import java.time.Duration;
import java.time.LocalDate;

public interface MedioAudiovisual {
	
	String getCodigo();
	String getTitulo();
	Duration getDuracion();
	LocalDate getFechaAdquisicion();
	Double getPrecio();
	TipoMedioAudiovisual getTipo();
	Integer getNumeroDisco();
	Prestamo getPrestamo();
	
	void setPrestamo(TipoPrestamo prestamo);
	
}
