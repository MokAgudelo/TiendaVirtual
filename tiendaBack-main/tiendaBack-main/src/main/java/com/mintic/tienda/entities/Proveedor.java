package com.mintic.tienda.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = Proveedor.TABLE_NAME)
public class Proveedor {
	public static final String TABLE_NAME = "proveedor";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// OJO preguntar si se usa ->@ManyToOne
	
	@Column(name = "ciudad")
	private String ciudad;

	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "nit")
	private String nit;

	
	public Proveedor() {

	}


	public Proveedor(Long id, String ciudad, String direccion, String nombre, String telefono, String nit) {
		super();
		this.id = id;
		this.ciudad = ciudad;
		this.direccion = direccion;
		this.nombre = nombre;
		this.telefono = telefono;
		this.nit = nit;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public static String getTableName() {
		return TABLE_NAME;
	}
	
}
	