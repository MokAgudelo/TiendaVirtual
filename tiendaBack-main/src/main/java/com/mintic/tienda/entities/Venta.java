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
@Table(name = Venta.TABLE_NAME)
public class Venta {
	public static final String TABLE_NAME = "venta";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "idCliente")
	private Cliente idCliente;
	
	@ManyToOne
	@JoinColumn(name = "idUsuario")
	private Usuario idUsuario;
	
	
	@Column(name = "ivaVenta")
	private Long ivaVenta;
	
	@Column(name = "totalVenta")
	private Long totalVenta;

	@Column(name = "valorVenta")
	private Long valorVenta;

		

	public Venta() {
		
	}

		public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	


	public Cliente getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Cliente idCliente) {
		this.idCliente = idCliente;
	}

	public Usuario getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Usuario idUsuario) {
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