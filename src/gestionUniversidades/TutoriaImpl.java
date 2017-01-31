package gestionUniversidades;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public class TutoriaImpl implements Tutoria {

	private DayOfWeek diaSemana;
	private LocalTime inicio;
	private LocalTime fin;

	@Override
	public DayOfWeek getDiaSemana() {

		return diaSemana;
	}

	@Override
	public LocalTime getHoraComienzo() {

		return inicio;
	}

	@Override
	public LocalTime getHoraFin() {

		return fin;
	}

	private Integer calculoDuracion() {
		Integer r1 = inicio.getMinute();
		Integer r2 = fin.getMinute();

		return r2 - r1;
	}

	@Override
	public Duration getDuracion() {

		return Duration.ofMinutes(calculoDuracion());
	}

}
