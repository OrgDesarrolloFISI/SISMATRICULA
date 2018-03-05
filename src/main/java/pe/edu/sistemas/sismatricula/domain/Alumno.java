package pe.edu.sistemas.sismatricula.domain;
// Generated 02/03/2018 05:00:38 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Alumno generated by hbm2java
 */
@Entity
@Table(name = "alumno", catalog = "modelomatriculafisi")
public class Alumno implements java.io.Serializable {

	private Integer idAlumno;
	private Periodo periodo;
	private String alumnoCodigo;
	private String alumnoAppaterno;
	private String alumnoApmaterno;
	private String alumnoNombre;
	private String alumnoEstado;
	private Integer alumnoIngreso;
	private String alumnoApellidos;
	private String estado;

	public Alumno() {
	}

	public Alumno(Periodo periodo, String alumnoCodigo, String alumnoAppaterno, String alumnoApmaterno,
			String alumnoNombre, String alumnoEstado, Integer alumnoIngreso, String alumnoApellidos, String estado) {
		this.periodo = periodo;
		this.alumnoCodigo = alumnoCodigo;
		this.alumnoAppaterno = alumnoAppaterno;
		this.alumnoApmaterno = alumnoApmaterno;
		this.alumnoNombre = alumnoNombre;
		this.alumnoEstado = alumnoEstado;
		this.alumnoIngreso = alumnoIngreso;
		this.alumnoApellidos = alumnoApellidos;
		this.estado = estado;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_ALUMNO", unique = true, nullable = false)
	public Integer getIdAlumno() {
		return this.idAlumno;
	}

	public void setIdAlumno(Integer idAlumno) {
		this.idAlumno = idAlumno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ULTIMO_PERIODO")
	public Periodo getPeriodo() {
		return this.periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

	@Column(name = "ALUMNO_CODIGO", length = 45)
	public String getAlumnoCodigo() {
		return this.alumnoCodigo;
	}

	public void setAlumnoCodigo(String alumnoCodigo) {
		this.alumnoCodigo = alumnoCodigo;
	}

	@Column(name = "ALUMNO_APPATERNO", length = 45)
	public String getAlumnoAppaterno() {
		return this.alumnoAppaterno;
	}

	public void setAlumnoAppaterno(String alumnoAppaterno) {
		this.alumnoAppaterno = alumnoAppaterno;
	}

	@Column(name = "ALUMNO_APMATERNO", length = 45)
	public String getAlumnoApmaterno() {
		return this.alumnoApmaterno;
	}

	public void setAlumnoApmaterno(String alumnoApmaterno) {
		this.alumnoApmaterno = alumnoApmaterno;
	}

	@Column(name = "ALUMNO_NOMBRE", length = 45)
	public String getAlumnoNombre() {
		return this.alumnoNombre;
	}

	public void setAlumnoNombre(String alumnoNombre) {
		this.alumnoNombre = alumnoNombre;
	}

	@Column(name = "ALUMNO_ESTADO", length = 4)
	public String getAlumnoEstado() {
		return this.alumnoEstado;
	}

	public void setAlumnoEstado(String alumnoEstado) {
		this.alumnoEstado = alumnoEstado;
	}

	@Column(name = "ALUMNO_INGRESO")
	public Integer getAlumnoIngreso() {
		return this.alumnoIngreso;
	}

	public void setAlumnoIngreso(Integer alumnoIngreso) {
		this.alumnoIngreso = alumnoIngreso;
	}

	@Column(name = "alumno_apellidos", length = 45)
	public String getAlumnoApellidos() {
		return this.alumnoApellidos;
	}

	public void setAlumnoApellidos(String alumnoApellidos) {
		this.alumnoApellidos = alumnoApellidos;
	}

	@Column(name = "estado", length = 45)
	public String getEstado() {
		return this.estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
