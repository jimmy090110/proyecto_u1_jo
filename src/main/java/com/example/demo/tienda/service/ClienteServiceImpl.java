package com.example.demo.tienda.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.repository.IClienteRepsitory;

public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepsitory clienteRepsitory;
	@Override
	public void agregar(Cliente cliente) {
		// TODO Auto-generated method stub
		
	this.clienteRepsitory.insertar(cliente);
		
	}

}
