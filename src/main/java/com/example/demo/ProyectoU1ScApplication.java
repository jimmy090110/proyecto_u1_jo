package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.spring.CitaMedicaSB;
import com.example.demo.spring.MedicoSB;
import com.example.demo.spring.PacienteTerceraEdadSB;


@SpringBootApplication
public class ProyectoU1ScApplication implements CommandLineRunner {
	
	@Autowired
	private PacienteTerceraEdadSB pacienteTE; 
	@Autowired
	private CitaMedicaSB citaMedicaSB;
	@Autowired
	private MedicoSB medicoSB;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1ScApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	System.out.println("SpringBoot");
	
	this.pacienteTE.setCodIess("123456");
	this.pacienteTE.setNombre("Jhonatan");

	this.pacienteTE.setTipo("");
	this.pacienteTE.setCedula("1727501510");
	
	System.out.println(pacienteTE);
	
	citaMedicaSB.agendar("1", LocalDateTime.of(2022,12,2,8,30), pacienteTE, medicoSB);
	
	}

//public class ProyectoU1ScApplication implements CommandLineRunner {
//@Autowired
//	private ICuentaBancariaService bancariaService;
//
//@Autowired
// 	private ITransferenciaService iTransferenciaService;
//	public static void main(String[] args) {
//		SpringApplication.run(ProyectoU1ScApplication.class, args);
//	}
//
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Spring boot");
//		
//		CuentaBancaria cuenta1 = new CuentaBancaria();
//		cuenta1.setNumero("0001");
//		cuenta1.setTipo("A");
//		cuenta1.setTitular("Jimmy ORtega");
//		cuenta1.setSaldo(new BigDecimal(100));
//		this.bancariaService.insertar(cuenta1);
//		
//		
//		CuentaBancaria cuenta2 = new CuentaBancaria();
//		cuenta2.setNumero("0002");
//		cuenta2.setTipo("A");
//		cuenta2.setTitular("Diana Teran");
//		cuenta2.setSaldo(new BigDecimal(200));
//		this.bancariaService.insertar(cuenta2);
//		
//	 for(Transferencia t:this.iTransferenciaService.buscarReporte()) {
//		 System.out.println(t);
//	 }
//		this.iTransferenciaService.realizar("0001", "0002", new BigDecimal(10));
//System.out.println("Reporte 2");
//for(Transferencia t:this.iTransferenciaService.buscarReporte()) {
//	System.out.println(t);
//}
//
//	}

}