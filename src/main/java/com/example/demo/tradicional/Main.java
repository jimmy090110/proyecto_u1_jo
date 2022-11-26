package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CitaMedica cita = new CitaMedica();
		cita.agendar("2413",LocalDateTime.of(2022,12,2,8,30),"Doctor Teran",
				"4235235","Paciente Edison","2134564","N");
		
	}

} 
