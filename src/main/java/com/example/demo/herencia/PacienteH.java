package com.example.demo.herencia;

public class PacienteH {
	private String nombre;
	private String cedula;
	private String tipo;
	
	protected Integer calcularDescuento() {
		System.out.println("Sin descuento");
		return 0;
	}
	
	//Set y get
	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", cedula=" + cedula + "]";
	}

	
	//set y get
	protected String getNombre() {
		return nombre;
	}
	protected  void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected  String getCedula() {
		return cedula;
	}
	protected  void setCedula(String cedula) {
		this.cedula = cedula;
	}
	

}