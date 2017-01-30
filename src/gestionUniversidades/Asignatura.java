package gestionUniversidades;

public interface Asignatura {

	String getNombre();

	Integer getCodigo();

	Double getCreditos();

	TipoAsignatura getTipo();

	Integer getCurso();

	String getDepartamento();

	void setDepartamento(String dpto);

}
