package com.example.demo.spring.boot;

import org.springframework.stereotype.Component;

@Component
public class PacienteNinioSB extends PacienteSB{
private int pesoNacimiento;

	public int getPesoNacimiento() {
		return pesoNacimiento;
	}
	
	public void setPesoNacimiento(int pesoNacimiento) {
		this.pesoNacimiento = pesoNacimiento;
	}

	protected Integer calcularDescuento() {
		System.out.println("Paciente Ninio con el 10% de descuento");
		return 10;
	}
}
