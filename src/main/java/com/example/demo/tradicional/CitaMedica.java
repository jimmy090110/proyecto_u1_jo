package com.example.demo.tradicional;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class CitaMedica {
	private String numero;
	private LocalDateTime fechaCita;
	private LocalDateTime fechaAgenda;
	private Medico medico;
	private Paciente paciente;
	
	public void agendar(String numer, LocalDateTime fechaCita, String nombreMedico, String cedulaMedico,
			String nombrePaciente, String cedulaPaciente, String tipo) {
		this.numero= numer;
		this.fechaCita= fechaCita;
		this.fechaAgenda = LocalDateTime.now();
		Medico medico= new Medico();
		medico.setCedula(cedulaMedico);
		medico.setNombre(nombreMedico);
		
		this.medico=medico;
		if(tipo.equals("TE")){
			PacienteTerceraEdad pacienteTE = new PacienteTerceraEdad();
			pacienteTE.setCodeIESS("2655");
			pacienteTE.setTipo("TE");
			System.out.println("Paciente con descuento ");
			
			this.paciente= pacienteTE;
			
			
		}else {
				PacienteNino pacienteNino = new PacienteNino();
				pacienteNino.setPesoNacimiento(5);
				pacienteNino.setTipo("N");
				this.paciente=pacienteNino;
				System.out.println("Paciente Niño sin descuento");
			}
			
		this.paciente.setNombre(nombrePaciente);
		this.paciente.setCedula(cedulaPaciente);
		this.guardarCita(this);
		
		
	}
	private void guardarCita(CitaMedica cita) {
		//Aquí vamos a insertar en la BD
		System.out.println(cita);
	}
	//SET Y GET
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public LocalDateTime getFechaCita() {
		return fechaCita;
	}
	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}
	public LocalDateTime getFechaAgenda() {
		return fechaAgenda;
	}
	public void setFechaAgenda(LocalDateTime fechaAgenda) {
		this.fechaAgenda = fechaAgenda;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paceinte) {
		this.paciente = paceinte;
	}
	@Override
	public String toString() {
		return "CitaMedica [numero=" + numero + ", fechaCita=" + fechaCita + ", fechaAgenda=" + fechaAgenda
				+ ", medico=" + medico + ", paciente=" + paciente + ", getNumero()=" + getNumero() + ", getFechaCita()="
				+ getFechaCita() + ", getFechaAgenda()=" + getFechaAgenda() + ", getMedico()=" + getMedico()
				+ ", getPaciente()=" + getPaciente() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

}
