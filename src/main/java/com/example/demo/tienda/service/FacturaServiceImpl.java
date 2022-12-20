package com.example.demo.tienda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.tienda.modelo.Cliente;
import com.example.demo.tienda.modelo.Factura;
import com.example.demo.tienda.modelo.ItemTO;
import com.example.demo.tienda.repository.IClienteRepsitory;
@Service
public class FacturaServiceImpl implements IFacturaService {
	
	@Autowired
	private IFacturaService FacturaServiceImpl;
	
	@Autowired
	private IClienteRepsitory clienteRepsitory;

	@Override
	public void generar(String cedulaCliente, List<ItemTO> detalles) {
		Cliente cli = this.clienteRepsitory.buscar(cedulaCliente);
		
		Factura miFactura = new Factura();
		miFactura.setCliente(null);
		
	}
	

}
