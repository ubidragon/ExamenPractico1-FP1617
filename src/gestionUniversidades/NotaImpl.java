package gestionUniversidades;

import java.time.LocalDate;

public class NotaImpl implements Nota {
	private Asignatura asignatura;
	private LocalDate cursoAcademico;
	private Convocatoria convocatoria;
	private Double valor;
	private Boolean mencion;

	@Override
	public Asignatura getAsignatura() {

		return asignatura;
	}

	@Override
	public LocalDate getCursoAcademico() {

		return cursoAcademico;
	}

	@Override
	public Convocatoria getConvocatoria() {

		return convocatoria;
	}

	@Override
	public Double getValor() {

		return valor;
	}

	public Calificacion getCalificacion() {

		Calificacion cal = Calificacion.SUSPENSO;

		if (valor >= 5 && valor < 7) {
			cal = Calificacion.APROBADO;
		} else if (valor >= 7 && valor < 9) {
			cal = Calificacion.NOTABLE;
		} else if (valor >= 9 && getMencionHonor() == false) {
			cal = Calificacion.SOBRESALIENTE;
		} else if (valor >= 9 && getMencionHonor() == true) {
			cal = Calificacion.MATRICULA_HONOR;
		}

		return cal;

	}

	@Override
	public Boolean getMencionHonor() {

		return mencion;
	}

}
