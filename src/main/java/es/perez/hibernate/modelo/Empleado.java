package es.perez.hibernate.modelo;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="EMPLEADO")
public class Empleado implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ID_EMP")
	private Long id_emp;
	
	@Column(name="NOMBRE_EMP")
	private String nombre_emp;
	
	@Column(name="APELLIDO_EMP")
	private String apellido_emp;
	
	@Column(name="TELEFONO_EMP")
	private String telefono;

	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name="ID_Departamento")
	private Departamento departamento;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_Proyecto")
	private Proyecto proyecto;
	
	public Empleado() {
		
	}
	public Empleado(Long id_emp, String nombre_emp, String apellido_emp, String telefono,Proyecto proyecto) {
		this.id_emp = id_emp;
		this.nombre_emp = nombre_emp;
		this.apellido_emp = apellido_emp;
		this.telefono = telefono;
		this.proyecto = proyecto;
	}
	public Long getId_emp() {
		return id_emp;
	}
	public void setId_emp(Long id_emp) {
		this.id_emp = id_emp;
	}
	public String getNombre_emp() {
		return nombre_emp;
	}
	public void setNombre_emp(String nombre_emp) {
		this.nombre_emp = nombre_emp;
	}
	public String getApellido_emp() {
		return apellido_emp;
	}
	public void setApellido_emp(String apellido_emp) {
		this.apellido_emp = apellido_emp;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Empleado [id_emp=" + id_emp + ", nombre_emp=" + nombre_emp + ", apellido_emp=" + apellido_emp
				+ ", telefono=" + telefono + ", departamento=" + departamento + ", proyecto asignado="+ proyecto +"]";
	}
	public Proyecto getProyecto() {
		return proyecto;
	}
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}
	

}
