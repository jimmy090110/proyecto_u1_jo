package com.example.demo.banco.service;

import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.repository.ICuencaBancariaRepository;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {

		private ICuencaBancariaRepository bancariaRepository;

	@Override
	public CuentaBancaria buscarPorNumero(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscarPorNumero(numeroCuenta);
	}

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(id);
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		
		
	}

	@Override
	public void insertar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
