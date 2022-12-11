package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.banco.modelo.CuentaBancaria;
import com.example.demo.banco.modelo.Transferencia;
import com.example.demo.banco.repository.ITransferenciaRepository;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService{
@Autowired
	private ITransferenciaRepository iTransferenciaRepository;	
@Autowired	
private ICuentaBancariaService bancariaService;
	
@Override
	public List<Transferencia> buscarReporte() {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscarTodos();
	}

	@Override
	public void realizar(String numeroOrigen, String numeroDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		
		//origen
		//1.buscar la cuenta origen
		CuentaBancaria origen =this.bancariaService.buscarPorNumero(numeroOrigen);
		
		//2.Consultar el saldo de la cuenta origen
		BigDecimal saldoOrigen=  origen.getSaldo();
		//3. Operacion resta en el origen
		//nuevo saldo= saldoOrigen-monto
		BigDecimal nuevoSaldo = saldoOrigen.subtract(monto);
		//4. Actualizacion cuenta origen
		origen.setSaldo(nuevoSaldo);
		this.bancariaService.actualizar(origen);
		//destino
		//1.buscar la cuenta destino
		CuentaBancaria destino=this.bancariaService.buscarPorNumero(numeroDestino);
		//2.Consultar el saldo de la cuenta destino
		BigDecimal saldoDEstino = destino.getSaldo();
	
		//3. Operacion resta en el destino
		BigDecimal nuevoSaldoDestino=    saldoDEstino.add(monto);
		//4. Actualizacion cuenta destino
		destino.setSaldo(nuevoSaldoDestino);
		this.bancariaService.actualizar(destino);
		
		Transferencia transferencia = new Transferencia();
		transferencia.setCuentaDestino(numeroDestino);
		transferencia.setCuentaOrigen(numeroOrigen);
		transferencia.setFecha(LocalDateTime.now());
		transferencia.setMonto(monto);
		transferencia.setNumero("121214");
		this.iTransferenciaRepository.insertar(transferencia);
		
	}

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscar(id);
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		System.out.println("La transferencia se a actualizado");
		
	}

	@Override
	public void insertar(Transferencia transferencia) {
		System.out.println("La transferencia se ha insertado");
		
	}

	@Override
	public void borrar(Integer id) {
		System.out.println("La transferencia se a borrado");
		
	}

}
