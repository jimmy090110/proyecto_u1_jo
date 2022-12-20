package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository{

	//esta lista nuestra base de datos momentanea
	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	
	@Override
	public CuentaBancaria buscarPorBumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		//select *from cuenta c where c.numero=numeroCuenta
		//vamos a crear con metodos mooks crear datos nosotros
	
		/*
		CuentaBancaria cuenta= new CuentaBancaria();
		cuenta.setNumero(numeroCuenta);
		cuenta.setSaldo(new BigDecimal(100));
		cuenta.setTipo("A");
		cuenta.setTitular("Anddy Quisilema");
		*/
		CuentaBancaria cuenta = null;
		for(CuentaBancaria cb: baseCuentas) {
			if(cb.getNumero().equals(numeroCuenta)) {
				cuenta= cb;
				
			}
			
		}
		System.out.println("Se busca la cuenta : " + numeroCuenta);
		
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
	 System.out.println("Se busca la cuenta : " + id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		//update en base de datos
		
		CuentaBancaria cuenta = null;
		for(CuentaBancaria cb: baseCuentas) {
			if(cb.getNumero().equals(cuentaBancaria.getNumero())) {
				cuenta=cb;
				
				
			}
				
				
			}
		baseCuentas.remove(cuenta);
		baseCuentas.add(cuentaBancaria);
		
		System.out.println("Se actualiza la cuenta: " + cuentaBancaria);
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		
		
		System.out.println("Se inserta la cuentaBancaria : " + cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		System.out.println("Borrar la cuenta bancaria: " + id);
		
	}

}
