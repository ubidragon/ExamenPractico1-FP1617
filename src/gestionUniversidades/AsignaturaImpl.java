package gestionUniversidades;

public class AsignaturaImpl implements Asignatura {

	private String asignatura, departamento;
	private Integer codigo, curso;
	private Double creditos;
	private TipoAsignatura tipo;

	public AsignaturaImpl(String asignatura, Integer codigo, Double creditos, TipoAsignatura tipo, Integer curso,
			String departamento) {
		this.asignatura = asignatura;
		this.departamento = departamento;
		this.codigo = codigo;
		this.curso = curso;
		this.creditos = creditos;
		this.tipo = tipo;
	}

	
	public String getNombre() {
	
		return asignatura;
	}

	
	public Integer getCodigo() {
	
		return codigo;
	}

	
	public Double getCreditos() {
	
		return creditos;
	}

	
	public TipoAsignatura getTipo() {
	
		return tipo;
	}

	
	public Integer getCurso() {
	
		return curso;
	}

	
	public String getDepartamento() {
	
		return departamento;
	}

	
	public void setDepartamento(String dpto) {
	
		this.departamento=dpto;

	}

}
