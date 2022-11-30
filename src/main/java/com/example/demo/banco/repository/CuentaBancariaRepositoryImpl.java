package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuencaBancariaRepository {
	private static List<CuentaBancaria> baseCuentas = new ArrayList<>();
	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		//SELECT * FROM CUENTA C WHERE C.NUMERO = numeroCuenta
		//*Mock
		
		
		//CuentaBancaria cuenta = new CuentaBancaria();
		//cuenta.setNumero(numeroCuenta);
		//cuenta.setSaldo(new BigDecimal(100));
		//cuenta.setTipo("A");
		//cuenta.setTitular("Jimmy Ortega");
		
		CuentaBancaria cuenta = null;
		for(CuentaBancaria cb: baseCuentas) {
			if(cb.getNumero().equals(numeroCuenta)) {
				cuenta=cb;
				
			}
		}
		System.out.println("Se busca la cuenta bancaria:"+numeroCuenta);
		return cuenta;
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		System.out.println("Se busca la cuenta:"+id);
		return null;
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		System.out.println("Se actualiza la cuenta:"+ cuentaBancaria);
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		System.out.println("Se inserta la cuenta Bancaria");
		baseCuentas.add(cuentaBancaria);
	}

	@Override
	public void borrar(Integer id) {
		System.out.println("se borra lka cuenta bancaria");
		
	}

}
