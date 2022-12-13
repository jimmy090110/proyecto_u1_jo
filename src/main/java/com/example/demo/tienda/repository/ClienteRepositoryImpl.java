package com.example.demo.tienda.repository;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.tienda.modelo.Cliente;

public class ClienteRepositoryImpl implements IClienteRepsitory{
	
	private static List<Cliente> baseDeDatos = new ArrayList<>();
	

	@Override
	public void insertar(Cliente cliente) {
		baseDeDatos.add(cliente);
		
	}

	@Override
	public void actualizar(Cliente cliente) {
		Cliente cli = null;
		for(Cliente c: baseDeDatos) {
			if(c.getCedula().equals(cliente.getCedula())) {
				cliente=c;
				
				
			}
				
				
			}
		baseDeDatos.remove(cliente);
		baseDeDatos.add(cliente);
		
		System.out.println("Se actualiza la cuenta: " +cliente);
		
	}

    @Override
    public Cliente buscar(String cedula) {
        // TODO Auto-generated method stub

        Cliente cli = null;
        for(Cliente cb: baseDeDatos) {
            if(cb.getCedula().equals(cedula)) {
                cli = cb;
            }
        }
        return cli;

 

    }

 

    @Override
    public void eliminar(String cedula) {
        // TODO Auto-generated method stub
        Cliente cli=buscar(cedula);
        baseDeDatos.remove(cli);

        }

}
