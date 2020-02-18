package com.wgomezsa.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wgomezsa.modelo.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer>{

}
