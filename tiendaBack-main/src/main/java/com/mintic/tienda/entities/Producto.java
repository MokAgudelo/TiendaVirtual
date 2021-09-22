package com.mintic.tienda.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = Producto.TABLE_NAME)
public class Producto {
	public static final String TABLE_NAME = "producto";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	@ManyToOne
	@JoinColumn(name = "idProveedor")
	private Proveedor idProveedor;
	
	@Column(name = "ivaCompra")
	private Long ivaCompra;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "precioCompra")
	private Long precioCompra;
	
	@Column(name = "precioVenta")
	private Long precioVenta;
	
	
	
	public Producto() {
		
		}



	
	public Proveedor getIdProveedor() {
		return idProveedor;
	}




	public void setIdProveedor(Proveedor idProveedor) {
		this.idProveedor = idProveedor;
	}




	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public Long getIvaCompra() {
		return ivaCompra;
	}



	public void setIvaCompra(Long ivaCompra) {
		this.ivaCompra = ivaCompra;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public Long getPrecioCompra() {
		return precioCompra;
	}



	public void setPrecioCompra(Long precioCompra) {
		this.precioCompra = precioCompra;
	}



	public Long getPrecioVenta() {
		return precioVenta;
	}



	public void setPrecioVenta(Long precioVenta) {
		this.precioVenta = precioVenta;
	}



	public static String getTableName() {
		return TABLE_NAME;
	}
	
}