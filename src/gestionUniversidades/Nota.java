package gestionUniversidades;

import java.time.LocalDate;

public interface Nota {

	Asignatura getAsignatura();

	LocalDate getCursoAcademico();

	Convocatoria getConvocatoria();

	Double getValor();

	Calificacion getCalificacion();

	Boolean getMencionHonor();

}
