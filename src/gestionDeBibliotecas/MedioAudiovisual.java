package gestionDeBibliotecas;

import java.time.LocalDate;

public interface MedioAudiovisual extends Comparable<MedioAudiovisual> {

	String getCodigo();

	Integer getDuracion();

	TipoMedioAudiovisual getTipo();

	Integer getNumeroDisco();

	String getTitulo();

	LocalDate getFechaAdquisicion();

	Double getPrecio();

	TipoPrestamo getPrestamo();

	void setPrestamo(TipoPrestamo prestamo);

}
