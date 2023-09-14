package com.utn.TpJpaYanzonFacundo;

import com.utn.TpJpaYanzonFacundo.entidades.*;
import com.utn.TpJpaYanzonFacundo.enumeraciones.*;
import com.utn.TpJpaYanzonFacundo.repositorios.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class TpJpaYanzonFacundoApplication {
	@Autowired
	RubroRepository rubroRepository;
	@Autowired
	ClienteRepository clienteRepository;
	public static void main(String[] args) {
		SpringApplication.run(TpJpaYanzonFacundoApplication.class, args);
	}

}


