package com.mintic.tienda.repositories;

import org.springframework.data.repository.CrudRepository;

import com.mintic.tienda.entities.Cliente;

public interface ICliente extends CrudRepository<Cliente, Long> {
	
	// consultas personalizadas 
	// 
}
