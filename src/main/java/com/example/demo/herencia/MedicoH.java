package com.example.demo.herencia;

public class MedicoH {
	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	private String nombre;
	private String cedula;
	public String getNombre() {
		return nombre;
		
		//SET Y GET
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
		
	}