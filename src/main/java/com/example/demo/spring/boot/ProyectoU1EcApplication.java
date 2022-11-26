package com.example.demo.spring.boot;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoU1EcApplication implements CommandLineRunner {

	@Autowired
	private PacienteTerceraEdadSB pacientViejo;
	@Autowired
	private CitaMedicaSB cita;
	@Autowired
	private MedicoSB doctor;
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1EcApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Spring Boot");
		
		System.out.println("PacienteTE");
		this.pacientViejo.setCodIess("15511");
		this.pacientViejo.setNombre("Edison");
		this.pacientViejo.setTipo("TE");
		this.pacientViejo.setCedula("1758465258");
		
		System.out.println(pacientViejo);
		
		
		
		
		cita.agendar("52525",  LocalDateTime.of(2022,12,2,8,30),pacientViejo, doctor);
		
		
		
	}
	
}
