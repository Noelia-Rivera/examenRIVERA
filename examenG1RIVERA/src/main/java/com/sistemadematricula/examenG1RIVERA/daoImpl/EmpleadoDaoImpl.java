package com.sistemadematricula.examenG1RIVERA.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sistemadematricula.examenG1RIVERA.dao.EmpleadoDao;
import com.sistemadematricula.examenG1RIVERA.entity.Empleado;
import com.sistemadematricula.examenG1RIVERA.repository.EmpleadoRepository;

@Component
public class EmpleadoDaoImpl implements EmpleadoDao{

	@Autowired
	private EmpleadoRepository repository;
	
	@Override
	public Empleado create(Empleado em) {
		// TODO Auto-generated method stub
		return repository.save(em);
	}

	@Override
	public Empleado update(Empleado em) {
		// TODO Auto-generated method stub
		return repository.save(em);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
	}

	@Override
	public Optional<Empleado> read(Long id) {
		// TODO Auto-generated method stub
		return repository.findById(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
