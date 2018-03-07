package pe.edu.sistemas.sismatricula.domain;
// Generated 05/03/2018 04:18:39 PM by Hibernate Tools 4.3.1.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Rol generated by hbm2java
 */
@Entity
@Table(name = "rol", catalog = "modelomatriculafisi")
public class Rol implements java.io.Serializable {

	private Integer idRol;
	private String rol;

	public Rol() {
	}

	public Rol(String rol) {
		this.rol = rol;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "ID_ROL", unique = true, nullable = false)
	public Integer getIdRol() {
		return this.idRol;
	}

	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}

	@Column(name = "ROL")
	public String getRol() {
		return this.rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

}
