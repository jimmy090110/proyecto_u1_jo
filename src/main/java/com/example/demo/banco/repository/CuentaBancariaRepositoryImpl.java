package com.example.demo.banco.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.service.ICuentaBancariaService;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaService{

	private static List<CuentaBancaria> baseCuentas= new ArrayList<>();
	
	public CuentaBancaria buscarPorNUmero(String numeroCuenta) {
		// TODO Auto-generated method stub
		
		//SELECT * FROM CUENTA C WHERE C.NUMERO=numeroCuenta
		
		CuentaBancaria cuenta = new CuentaBancaria();
//		cuenta.setNumero(numeroCuenta);
//		cuenta.setSaldo(new BigDecimal(100));
//		cuenta.setTipo("A");
//		cuenta.setTitular("EDISON CAYAMBE");
//		
		for(CuentaBancaria cb: baseCuentas) {
			if(cb.getNumero().equals(numeroCuenta)){
				cuenta=cb;
			}
		}
		System.out.println("se busca la cuenta: "+cuenta);
		return null;
	}

	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		System.out.println("se busca la cuenta: "+id);
		return null;
	}

	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("se actualiza la cuenta: "+cuentaBancaria);
		
	}

	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		System.out.println("se inserta la cuenta bancaria: "+cuentaBancaria);
		baseCuentas.add(cuentaBancaria);
	}

	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
