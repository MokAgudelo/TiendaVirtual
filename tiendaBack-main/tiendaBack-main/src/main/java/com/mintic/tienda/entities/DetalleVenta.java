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
@Table(name = DetalleVenta.TABLE_NAME)
public class DetalleVenta {
	public static final String TABLE_NAME = "detalleventa";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id, idProducto, idVenta;
	
	// OJO: preguntar si dejamos este -> @Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long idCliente;
	
	// OJO: preguntar si se usa -> @ManyToOne
	@Column(name = "cantidadProducto")
	private Long cantidadProducto;
	// OJO preguntar si cantidad producto es entero, en tabla esta como INT
	
	@Column(name = "valorTotal")
	private Long valorTotal;
	// OJO preguntar si valro total es LONG , en tabla esta como DOUBLE

	@Column(name = "valorVenta")
	private Long valorVenta;
	
	@Column(name = "valorIva")
	private Long valorIva;

		
	public DetalleVenta() {
		
		}


	public DetalleVenta(Long id, Long idProducto, Long idVenta, Long cantidadProducto, Long valorTotal, Long valorVenta,
			Long valorIva) {
		super();
		this.id = id;
		this.idProducto = idProducto;
		this.idVenta = idVenta;
		this.cantidadProducto = cantidadProducto;
		this.valorTotal = valorTotal;
		this.valorVenta = valorVenta;
		this.valorIva = valorIva;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getIdProducto() {
		return idProducto;
	}


	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}


	public Long getIdVenta() {
		return idVenta;
	}


	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}


	public Long getCantidadProducto() {
		return cantidadProducto;
	}


	public void setCantidadProducto(Long cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}


	public Long getValorTotal() {
		return valorTotal;
	}


	public void setValorTotal(Long valorTotal) {
		this.valorTotal = valorTotal;
	}


	public Long getValorVenta() {
		return valorVenta;
	}


	public void setValorVenta(Long valorVenta) {
		this.valorVenta = valorVenta;
	}


	public Long getValorIva() {
		return valorIva;
	}


	public void setValorIva(Long valorIva) {
		this.valorIva = valorIva;
	}


	public static String getTableName() {
		return TABLE_NAME;
	}


}

