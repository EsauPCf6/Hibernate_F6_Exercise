package es.perez.hibernate.aplicacion;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import es.perez.hibernate.modelo.Departamento;
import es.perez.hibernate.modelo.Empleado;
import es.perez.hibernate.modelo.Proyecto;

public class app {
	
	//private static EntityManager controlador;

	private static EntityManagerFactory entidad = Persistence.createEntityManagerFactory("persistencia");;
	
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//entidad = Persistence.createEntityManagerFactory("persistencia");
		//controlador = entidad.createEntityManager();
		
		
		
		
		crearDatos();
		imprimirTodo(); 
		
		//controlador = entidad.createEntityManager();
		//controlador.getTransaction().begin();
		//Empleado e = controlador.find(Empleado.class, 15L);
		//e.setApellido_emp("Vallarta");
		//controlador.getTransaction().commit();
		//controlador.close(); 
	}	
		
	 	private static void crearDatos() {
	 		EntityManager controlador = entidad.createEntityManager();
	 		
	 	controlador.getTransaction().begin();	
	 	
	 	Proyecto p1 = new Proyecto(12L,"Publicitón","Promocionar la meta, visión y capacidades de la empresa en entorno global.");
		controlador.persist(p1);
		Proyecto p2 = new Proyecto(6L,"Sistema ADMON.","Desarrollar un sistema de administración de inventario");
		controlador.persist(p2);
		
		Departamento d = new Departamento(5L,"Ventas","Relaciones públicas");
		controlador.persist(d);
		Departamento d2 = new Departamento(3L,"Compras","Relaciones públicas");
		controlador.persist(d2);
		Departamento d3 = new Departamento(4L,"Desarrollo","Realización de proyectos e ingeniería de software");
		controlador.persist(d3);
				
	 	Empleado e = new Empleado(4L,"Roberto","Romero","7789451167",p1);
		e.setDepartamento(d);
		controlador.persist(e);
	 	Empleado e2 = new Empleado(6L,"Juan","Estrada","7751183974",p1);
		e2.setDepartamento(d);
		controlador.persist(e2);
		Empleado e3 = new Empleado(5L,"Irlanda","Páez","2311183974",p1);
		e3.setDepartamento(d2);
		controlador.persist(e3);
		Empleado e4 = new Empleado(9L,"Samantha","Pérez","4561883274",p2);
		e3.setDepartamento(d3);
		controlador.persist(e4);
		
		controlador.getTransaction().commit(); 
		
		controlador.close();
		
	 	}
	
		@SuppressWarnings("unchecked")
		private static void imprimirTodo() {
			
		EntityManager controlador = entidad.createEntityManager();
		
		Proyecto p1 = controlador.find(Proyecto.class, 12L);
		System.out.println(p1);
		List<Empleado> empleados = p1.getEmpleados();
		for (Empleado Empleado:empleados) {
		System.out.println(" * " + Empleado.toString());
		}
		controlador.close();
		}
		
	}


