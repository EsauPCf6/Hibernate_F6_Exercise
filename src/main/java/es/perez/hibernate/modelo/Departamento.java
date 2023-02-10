package es.perez.hibernate.modelo;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DEPARTAMENTO")
public class Departamento implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="ID_DEPARTAMENTO")
	private Long id_dep;
	
	@Column(name="DESCRIPCION_DEP")
	private String descripcion_dep;
	
	@Column(name="TIPO_DEPARTAMENTO")
	private String tipo_dep;
	
	public Departamento() {
		
	}	
	
	public Departamento(Long id_dep, String descripcion_dep, String tipo_dep) {
		super();
		this.id_dep = id_dep;
		this.descripcion_dep = descripcion_dep;
		this.tipo_dep = tipo_dep;
	}
	public Long getId_dep() {
		return id_dep;
	}
	public void setId_dep(Long id_dep) {
		this.id_dep = id_dep;
	}
	public String getDescripcion_dep() {
		return descripcion_dep;
	}
	public void setDescripcion_dep(String descripcion_dep) {
		this.descripcion_dep = descripcion_dep;
	}
	public String getTipo_dep() {
		return tipo_dep;
	}
	public void setTipo_dep(String tipo_dep) {
		this.tipo_dep = tipo_dep;
	}

	@Override
	public String toString() {
		return "Departamento [id_dep=" + id_dep + ", descripcion_dep=" + descripcion_dep + ", tipo_dep=" + tipo_dep
				+ "]";
	}
	
}
