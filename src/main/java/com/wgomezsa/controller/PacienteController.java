package com.wgomezsa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wgomezsa.modelo.Paciente;
import com.wgomezsa.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
	
	@Autowired
	private IPacienteService service;
	
	public Paciente registrar(Paciente objeto) {
		return service.registrar(objeto);
	}

}
