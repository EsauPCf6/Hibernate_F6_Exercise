package es.perez.hibernate.modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROYECTO")
public class Proyecto implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="")
	private Long id_proy;
	
	@Column(name="")
	private String nombre_proy;
	
	@Column(name="")
	private String caracteristicas_proy;
	
	@OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL) //fetch auto en relaciones one to many es LAZY
	private List<Empleado> empleados = new ArrayList<>();
	
	public Proyecto() { 
	
	}	
	public Proyecto(Long id_proy, String nombre_proy, String caracteristicas_proy) {
		super();
		this.id_proy = id_proy;
		this.nombre_proy = nombre_proy;
		this.caracteristicas_proy = caracteristicas_proy;
	}
	public Long getId_proy() {
		return id_proy;
	}
	public void setId_proy(Long id_proy) {
		this.id_proy = id_proy;
	}
	public String getNombre_proy() {
		return nombre_proy;
	}
	public void setNombre_proy(String nombre_proy) {
		this.nombre_proy = nombre_proy;
	}
	public String getCaracteristicas_proy() {
		return caracteristicas_proy;
	}
	public void setCaracteristicas_proy(String caracteristicas_proy) {
		this.caracteristicas_proy = caracteristicas_proy;
	}
	public List<Empleado> getEmpleados() {
		return empleados;
	}
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}
	@Override
	public String toString() {
		return "Proyecto [id_proy=" + id_proy + ", nombre_proy=" + nombre_proy + ", caracteristicas_proy="
				+ caracteristicas_proy + "]";
	}
	
	
}


