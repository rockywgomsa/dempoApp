package com.wgomezsa.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wgomezsa.modelo.Paciente;
import com.wgomezsa.repo.IPacienteRepo;
import com.wgomezsa.service.IPacienteService;

@Service
public class PacienteServiceImpl implements IPacienteService{
	
	@Autowired
	private IPacienteRepo repo;

	@Override
	public Paciente registrar(Paciente obj) {
		return repo.save(obj);
	}
	
	public Paciente modificar(Paciente obj) {
		return repo.save(obj);
	}

	@Override
	public List<Paciente> listar() {
		return repo.findAll();
	}

	@Override
	public Paciente listarPorId(Integer id) {
		Optional<Paciente> op =repo.findById(id);
		return op.isPresent() ? op.get() : new Paciente();
	}

	@Override
	public boolean eliminar(Integer id) {
		repo.deleteById(id);
		return true;
	}

}
