package pe.edu.sistemas.sismatricula.model;

import java.util.List;

public class RegAlumno {
	
	private String codAlumno;
	private String nombre;
	private int periodRestantes;
	private int periodUsados;
	private boolean matriculaDisp;
	private List<ProcAlumno> listaProcAlumno;
	
	public RegAlumno(){}
	
	public RegAlumno(String codAlumno, String nombre, int periodRestantes, int periodUsados, boolean matriculaDisp,
			List<ProcAlumno> listaProcAlumno) {
		super();
		this.codAlumno = codAlumno;
		this.nombre = nombre;
		this.periodRestantes = periodRestantes;
		this.periodUsados = periodUsados;
		this.matriculaDisp = matriculaDisp;
		this.listaProcAlumno = listaProcAlumno;
	}
	
	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPeriodRestantes() {
		return periodRestantes;
	}

	public void setPeriodRestantes(int periodRestantes) {
		this.periodRestantes = periodRestantes;
	}

	public int getPeriodUsados() {
		return periodUsados;
	}

	public void setPeriodUsados(int periodUsados) {
		this.periodUsados = periodUsados;
	}

	public boolean isMatriculaDisp() {
		return matriculaDisp;
	}

	public void setMatriculaDisp(boolean matriculaDisp) {
		this.matriculaDisp = matriculaDisp;
	}

	public List<ProcAlumno> getListaProcAlumno() {
		return listaProcAlumno;
	}

	public void setProcAlumno(List<ProcAlumno> listaProcAlumno) {
		this.listaProcAlumno = listaProcAlumno;
	}

	@Override
	public String toString() {
		return "RegAlumno [codAlumno=" + codAlumno + ", nombre=" + nombre + ", periodRestantes=" + periodRestantes
				+ ", periodUsados=" + periodUsados + ", matriculaDisp=" + matriculaDisp + ", listaProcAlumno="
				+ listaProcAlumno + "]";
	}
}