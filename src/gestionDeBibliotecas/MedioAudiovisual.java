package gestionDeBibliotecas;

import java.time.Duration;
import java.time.LocalDate;

public interface MedioAudiovisual extends Medio{

	String getCodigo();

	Integer getDuracion();

	TipoMedioAudiovisual getTipo();

	Integer getNumeroDisco();

}
