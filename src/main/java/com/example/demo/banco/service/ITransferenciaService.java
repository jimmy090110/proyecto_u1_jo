package com.example.demo.banco.service;

import java.math.BigDecimal;
import java.util.List;

import com.example.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	
	public List<Transferencia> buscarReporte();
	
	public void realizar(String numeroOrigen,String numeroORigen,BigDecimal monto);
	
	
	//CRUD construir el crud beber
	public Transferencia buscar(Integer id);
	public void actualizar(Transferencia transferencia);
	public void insertar(Transferencia transferencia);
	public void borrar(Integer id);
	
	
}
