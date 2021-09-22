package com.mintic.tienda.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.entities.Cliente;
import com.mintic.tienda.repositories.ICliente;
import com.mintic.tienda.repositories.IUsuario;

@Service
public class ClienteImp {
	
	@Autowired
	ICliente iCliente;
	
	
	public Cliente buscar(Long id) {
		
		Cliente e = iCliente.findById(id).orElse(null);
		
		return e;
		
		
	}
	
	

}
