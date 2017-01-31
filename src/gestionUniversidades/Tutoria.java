package gestionUniversidades;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalTime;

public interface Tutoria {

	DayOfWeek getDiaSemana();

	LocalTime getHoraComienzo();

	LocalTime getHoraFin();

	Duration getDuracion();

}
