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
@Table(name = Venta.TABLE_NAME)
public class Venta {
	public static final String TABLE_NAME = "venta";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id, idCliente, idUsuario;
	
	// OJO: preguntar si dejamos este -> @Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//private Long idCliente;
	
	// OJO: preguntar si se usa -> @ManyToOne
	@Column(name = "ivaVenta")
	private Long ivaVenta;
	
	@Column(name = "totalVenta")
	private Long totalVenta;

	@Column(name = "valorVenta")
	private Long valorVenta;

		

	public Venta() {
		
	}

	public Venta(Long id, Long idCliente, Long idUsuario, Long ivaVenta, Long totalVenta, Long valorVenta) {
		super();
		this.id = id;
		this.idCliente = idCliente;
		this.idUsuario = idUsuario;
		this.ivaVenta = ivaVenta;
		this.totalVenta = totalVenta;
		this.valorVenta = valorVenta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Long getIvaVenta() {
		return ivaVenta;
	}

	public void setIvaVenta(Long ivaVenta) {
		this.ivaVenta = ivaVenta;
	}

	public Long getTotalVenta() {
		return totalVenta;
	}

	public void setTotalVenta(Long totalVenta) {
		this.totalVenta = totalVenta;
	}

	public Long getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(Long valorVenta) {
		this.valorVenta = valorVenta;
	}

	public static String getTableName() {
		return TABLE_NAME;
	}

	
	}