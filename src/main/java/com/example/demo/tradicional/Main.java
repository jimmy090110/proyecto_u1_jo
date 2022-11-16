package com.example.demo.tradicional;

import java.time.LocalDateTime;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CitaMedica cita = new CitaMedica();
		 cita.agendar("12232", LocalDateTime.of(2022, 11,1,8,30), "Doctor Washo","0600584531", "Paciente Edi", "08587542631", "TE");
	}

}
