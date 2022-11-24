package com.example.demo.herencia;

import java.time.LocalDateTime;

public class MainFramework {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	PacienteTerceraEdadH pacienteTe = new PacienteTerceraEdadH();
//	pacienteTe.setCedula("2141341");
//	pacienteTe.setCodIess("1234");
//	pacienteTe.setNombre("Juan");
//	pacienteTe.setTipo("TE");

	PacienteNinioH pacienteN = new PacienteNinioH();
	pacienteN.setCedula("4124123");
	pacienteN.setPesoNacimiento(12);
	pacienteN.setNombre("Juan");
	pacienteN.setTipo("TE");
		
	MedicoH medico = new MedicoH();
	medico.setCedula("2252389723");
	medico.setNombre("Pedro");
	
	CitaMedicaH cita = new CitaMedicaH();
	cita.agendar("1", LocalDateTime.of(2022,12,2,8,30), pacienteN, medico);
	
	
	}

}
